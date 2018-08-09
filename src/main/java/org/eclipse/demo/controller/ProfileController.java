package org.eclipse.demo.controller;

import org.eclipse.demo.entity.Profile;
import org.eclipse.demo.entity.User;
import org.eclipse.demo.service.ProfileService;
import org.eclipse.demo.service.impl.ProfileServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ProfileController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ProfileService profileService = new ProfileServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        RequestDispatcher dispatcher;

        switch (action) {
            case "/pview":
                List<Profile> profiles = profileService.findAll();
                request.setAttribute("Profile", profiles);
                dispatcher = request.getRequestDispatcher("/view/Profile/profileList.jsp");
                dispatcher.forward(request, response);
                break;
            case "/pview/tambahData":
                dispatcher = request.getRequestDispatcher("/view/Profile/tambahData.jsp");
                dispatcher.forward(request, response);
                break;
            case "/pview/update":
                Profile profile = new Profile();
                profile.setId(Integer.valueOf(request.getParameter("id")));
                Profile data = profileService.findById(profile);
                request.setAttribute("Profile", data);
                dispatcher = request.getRequestDispatcher("/view/Profile/update.jsp");
                dispatcher.forward(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        switch (action) {
            case "/pview/tambahData":
                Profile profile = new Profile();
                profile.setNamaLengkap(request.getParameter("nama"));
                profile.setAlamat(request.getParameter("alamat"));
                profile.setUmur(Integer.valueOf(request.getParameter("umur")));
                profile.setJenisKelamin(request.getParameter("jk"));
                Profile data = profileService.save(profile);
                if (data == null) {
                    response.sendRedirect("/pview/tambahData?addsuc=0");
                } else {
                    response.sendRedirect("/pview/tambahData?addsuc=1");
                }
                break;
            case "/pview/update":
                this.doPut(request, response);
                break;
            case "/pview/delete":
                this.doDelete(request, response);
                break;
        }
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Profile profile = new Profile();
        profile.setNamaLengkap(request.getParameter("nama"));
        profile.setAlamat(request.getParameter("alamat"));
        profile.setUmur(Integer.valueOf(request.getParameter("umur")));
        profile.setJenisKelamin(request.getParameter("jk"));
        profile.setId(Integer.valueOf(request.getParameter("id")));
        Profile data = profileService.update(profile);
        if (data == null) {
            response.sendRedirect("/pview?upsuc=0");
        } else {
            response.sendRedirect("/pview?upsuc=1");
        }
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Profile profile = new Profile();
        profile.setId(Integer.valueOf(request.getParameter("id")));
        int data = profileService.delete(profile);
        if (data == 0) {
            response.sendRedirect("/pview?delsuc=0");
        } else {
            response.sendRedirect("/pview?delsuc=1");
        }
    }
}

package org.eclipse.demo.controller;

import org.eclipse.demo.entity.User;
import org.eclipse.demo.service.UserService;
import org.eclipse.demo.service.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
        RequestDispatcher dispatcher;

//        response.setContentType("text/plain");
//        response.getWriter().println(action);
        switch (action) {
            case "/view":
                List<User> users = userService.findAll();
                request.setAttribute("Users", users);
                dispatcher = request.getRequestDispatcher("/view/User/userList.jsp");
                dispatcher.forward(request, response);
                break;
            case "/view/tambahData":
                dispatcher = request.getRequestDispatcher("/view/User/tambahData.jsp");
                dispatcher.forward(request, response);
                break;
            case "/view/update":
                User user = new User();
                user.setId(Integer.valueOf(request.getParameter("id")));
                User data = userService.findById(user);
                request.setAttribute("Users", data);
                dispatcher = request.getRequestDispatcher("/view/User/update.jsp");
                dispatcher.forward(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
        switch (action) {
            case "/view/tambahData":
                User user = new User();
                user.setUsername(request.getParameter("username"));
                user.setPassword(request.getParameter("password"));
                User data = userService.save(user);
                if (data == null) {
                    response.sendRedirect("/view/tambahData?addsuc=0");
                } else {
                    response.sendRedirect("/view/tambahData?addsuc=1");
                }
                break;
            case "/view/update":
                this.doPut(request, response);
                break;
            case "/view/delete":
                this.doDelete(request, response);
                break;
        }
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        user.setId(Integer.valueOf(request.getParameter("id")));
        User data = userService.update(user);
        if (data == null) {
            response.sendRedirect("/view?upsuc=0");
        } else {
            response.sendRedirect("/view?upsuc=1");
        }
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setId(Integer.valueOf(request.getParameter("id")));
        int data = userService.delete(user);
        if (data == 0) {
            response.sendRedirect("/view?delsuc=0");
        } else {
            response.sendRedirect("/view?delsuc=1");
        }
    }
}

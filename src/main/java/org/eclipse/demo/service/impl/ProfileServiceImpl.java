package org.eclipse.demo.service.impl;

import org.eclipse.demo.dao.ProfileDAO;
import org.eclipse.demo.dao.impl.ProfileDAOImpl;
import org.eclipse.demo.entity.Profile;
import org.eclipse.demo.service.ProfileService;
import org.eclipse.demo.service.UserService;

import java.util.List;

public class ProfileServiceImpl implements ProfileService {

    private ProfileDAO profileDAO = new ProfileDAOImpl();

    @Override
    public Profile save(Profile param) {
        return profileDAO.save(param);
    }

    @Override
    public Profile update(Profile param) {
        return profileDAO.update(param);
    }

    @Override
    public int delete(Profile param) {
        return profileDAO.delete(param);
    }

    @Override
    public Profile findById(Profile param) {
        return profileDAO.findById(param);
    }

    @Override
    public List<Profile> findAll() {
        return profileDAO.findAll();
    }
}

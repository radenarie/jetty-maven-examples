package org.eclipse.demo.service.impl;

import org.eclipse.demo.dao.UserDAO;
import org.eclipse.demo.dao.impl.UserDAOImpl;
import org.eclipse.demo.entity.User;
import org.eclipse.demo.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO = new UserDAOImpl();

    @Override
    public User save(User param) {
        return userDAO.save(param);
    }

    @Override
    public User update(User param) {
        return userDAO.update(param);
    }

    @Override
    public int delete(User param) {
        return userDAO.delete(param);
    }

    @Override
    public User findById(User param) {
        return userDAO.findById(param);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }
}

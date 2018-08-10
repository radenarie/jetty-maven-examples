package org.eclipse.demo.service.impl;

import org.eclipse.demo.dao.UserDAO;
import org.eclipse.demo.dao.impl.UserDAOImpl;
import org.eclipse.demo.entity.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceImplTest {

    private UserDAO userDAO = new UserDAOImpl();

    @Test
    public void save() {
       User user = new User();
       user.setUsername("New Admin");
       user.setPassword("New Password");
       User data = userDAO.save(user);
       assertNotNull(data);
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void findById() {
    }

    @Test
    public void findAll() {
    }
}
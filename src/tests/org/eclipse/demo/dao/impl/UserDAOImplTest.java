package org.eclipse.demo.dao.impl;

import org.eclipse.demo.dao.UserDAO;
import org.eclipse.demo.entity.User;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UserDAOImplTest {

    UserDAO userDAO = new UserDAOImpl();

    @Test
    public void getUserByUsername() {
    }

    @Test
    public void save() {
        User user = new User();
        user.setUsername("Admin New");
        user.setPassword("Admin Pass");
        User data = userDAO.save(user);
        assertNotNull(data);
    }

    @Test
    public void update() {
        User user = new User();
        user.setUsername("Admin 9 new");
        user.setPassword("Admin 9 pass");
        user.setId(9);
        User data = userDAO.update(user);
        assertNotNull(data);
    }

    @Test
    public void delete() {
        User user = new User();
        user.setId(8);
        int data = userDAO.delete(user);
        assertNotNull(data);
    }

    @Test
    public void findById() {
    }

    @Test
    public void findAll() {
        List<User> users = userDAO.findAll();
        assertNotNull(users);
        assertEquals(2, users.size());
    }
}
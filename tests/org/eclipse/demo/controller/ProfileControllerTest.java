package org.eclipse.demo.controller;

import org.eclipse.demo.dao.ProfileDAO;
import org.eclipse.demo.dao.UserDAO;
import org.eclipse.demo.dao.impl.ProfileDAOImpl;
import org.eclipse.demo.dao.impl.UserDAOImpl;
import org.eclipse.demo.entity.Profile;
import org.eclipse.demo.entity.User;
import org.eclipse.demo.service.ProfileService;
import org.eclipse.demo.service.UserService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProfileControllerTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void doGet() {
       // ProfileService userService = new Pro();
        ProfileDAO profileDAOimpl = new ProfileDAOImpl();
        List<Profile> profiles = profileDAOimpl.findAll();

        Assert.assertNotNull(profiles);
//        Assert.assertArrayEquals({},users);
        Assert.assertEquals(3, profiles.size());
        return;
    }

    @Test
    public void doPost() {
    }

    @Test
    public void doPut() {
    }

    @Test
    public void doDelete() {
    }
}
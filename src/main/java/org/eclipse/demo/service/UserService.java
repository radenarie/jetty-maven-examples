package org.eclipse.demo.service;

import org.eclipse.demo.dao.UserDAO;
import org.eclipse.demo.dao.impl.UserDAOImpl;
import org.eclipse.demo.entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface UserService extends BaseService<User> {
}

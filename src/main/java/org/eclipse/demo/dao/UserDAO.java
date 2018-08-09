package org.eclipse.demo.dao;

import org.eclipse.demo.entity.User;

public interface UserDAO extends BaseDAO<User> {

    User getUserByUsername();

}
package com.vpomo.reportglonass.repository;

import com.vpomo.reportglonass.model.Users;

import java.util.Date;
import java.util.List;

import org.springframework.dao.DataAccessException;

/**
 * Repository interface for <code>Users</code> domain objects
 *
 * @author Pomogalov Vladimir
 */

public interface UsersRepository {
    List<Users> getAll() throws DataAccessException;

    Users getUserLogin(String login) throws DataAccessException;

    Integer addUser(String login, String password, String passwordTwo, String names, String groupUser) throws DataAccessException;

    Users newUser(String login, String password, String names, Date dateLastReport, String groupUser) throws DataAccessException;

    void newDateUser(Users user, Date dateLastReport) throws DataAccessException;

    List<Users> getUsersGroup(String grUser) throws DataAccessException;

    void remove(String login) throws DataAccessException;

}

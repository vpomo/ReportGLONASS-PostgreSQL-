package com.vpomo.reportglonass.repository;

import com.vpomo.reportglonass.model.LogUsers;
import com.vpomo.reportglonass.model.Users;
import org.springframework.dao.DataAccessException;

import java.util.Date;
import java.util.List;

/**
 * Repository interface for <code>LogUsers</code> domain objects
 *
 * @author Pomogalov Vladimir
 */

public interface LogUsersRepository {
    Integer addLogUser(Users userL, Date currentDate, String actionLog) throws DataAccessException;

    void removeLogUser(int id) throws DataAccessException;

    List<LogUsers> getAll() throws DataAccessException;
}

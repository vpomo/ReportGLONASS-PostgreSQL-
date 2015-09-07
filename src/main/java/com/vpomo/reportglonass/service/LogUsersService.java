package com.vpomo.reportglonass.service;

import com.vpomo.reportglonass.model.LogUsers;
import com.vpomo.reportglonass.model.Users;
import org.springframework.dao.DataAccessException;

import java.util.Date;
import java.util.List;

/**
 * Mostly used as a facade so all controllers have a single point of entry
 *
 * @author Pomogalov Vladimir
 */

public interface LogUsersService {
    Integer addLogUser(Users userL, Date currentDate, String actionLog) throws DataAccessException;

    void removeLogUser(int id) throws DataAccessException;

    List<LogUsers> getAll() throws DataAccessException;
}

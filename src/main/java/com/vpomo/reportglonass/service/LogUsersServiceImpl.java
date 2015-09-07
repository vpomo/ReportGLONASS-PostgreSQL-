package com.vpomo.reportglonass.service;

import com.vpomo.reportglonass.model.LogUsers;
import com.vpomo.reportglonass.model.Users;
import com.vpomo.reportglonass.repository.LogUsersRepository;
import com.vpomo.reportglonass.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Mostly used as a facade for all ReportGlonass controllers
 * Also a placeholder for @Transactional annotations
 *
 * @author Pomogalov Vladimir
 */

@Service
public class LogUsersServiceImpl implements LogUsersService {
    private LogUsersRepository logUsersRepository;

    @Autowired
    public LogUsersServiceImpl(com.vpomo.reportglonass.repository.LogUsersRepository logUsersRepository) throws DataAccessException {
        this.logUsersRepository = logUsersRepository;
    }

    @Override
    @Transactional
    public Integer addLogUser(Users userL, Date currentDate, String actionLog) throws DataAccessException {
        return this.logUsersRepository.addLogUser(userL, currentDate, actionLog);
    }

    @Override
    @Transactional
    public void removeLogUser(int id) throws DataAccessException {
        this.logUsersRepository.removeLogUser(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<LogUsers> getAll() throws DataAccessException {
        return this.logUsersRepository.getAll();
    }
}

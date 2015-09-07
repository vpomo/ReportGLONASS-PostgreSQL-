package com.vpomo.reportglonass.service;

import com.vpomo.reportglonass.model.Users;

import java.util.Date;
import java.util.List;

import com.vpomo.reportglonass.repository.UsersRepository;
import com.vpomo.reportglonass.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.dao.DataAccessException;

/**
 * Mostly used as a facade for all ReportGlonass controllers
 * Also a placeholder for @Transactional annotations
 *
 * @author Pomogalov Vladimir
 */

@Service
//@Transactional(propagation = Propagation.REQUIRED, timeout = 60)
public class UsersServiceImpl implements UsersService {
    private UsersRepository usersRepository;

    @Autowired
    public UsersServiceImpl(com.vpomo.reportglonass.repository.UsersRepository usersRepository) throws DataAccessException {
        this.usersRepository = usersRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Users> getAll() throws DataAccessException {
        return usersRepository.getAll();
    }


    @Override
    @Transactional(readOnly = true)
    public Users getUserLogin(String login) throws DataAccessException {
        return usersRepository.getUserLogin(login);
    }

    @Override
    @Transactional
    public Integer addUser(String login, String password, String passwordTwo, String names, String groupUser) throws DataAccessException {
        return usersRepository.addUser(login, password, passwordTwo, names, groupUser);
    }

    @Override
    @Transactional
    public Users newUser(String login, String password, String names, Date dateLastReport, String groupUser) throws DataAccessException {
        return usersRepository.newUser(login, password, names, dateLastReport, groupUser);
    }

    @Override
    @Transactional
    public void newDateUser(Users user, Date dateLastReport) throws DataAccessException {
        usersRepository.newDateUser(user, dateLastReport);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Users> getUsersGroup(String grUser) throws DataAccessException {
        return usersRepository.getUsersGroup(grUser);
    }

    @Override
    @Transactional
    public void remove(String login) throws DataAccessException {
        usersRepository.remove(login);
    }

}

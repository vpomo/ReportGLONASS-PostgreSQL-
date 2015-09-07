package com.vpomo.reportglonass.repository.jpa;

import com.vpomo.reportglonass.model.LogUsers;
import com.vpomo.reportglonass.model.Users;
import com.vpomo.reportglonass.repository.LogUsersRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Date;
import java.util.List;

/**
 * JPA implementation of the {@link com.vpomo.reportglonass.repository.LogUsersRepository} interface.
 *
 * @author Pomogalov Vladimir
 */

@Repository
@EnableTransactionManagement
public class JpaLogUsersRepositoryImpl implements LogUsersRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Integer addLogUser(Users userL, Date currentDate, String actionLog) {
        try {
            LogUsers loguser = new LogUsers(userL, currentDate, actionLog);
            this.entityManager.persist(loguser);
            return loguser.getIdLogUser();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public void removeLogUser(int id) {
        LogUsers logUser = this.entityManager.find(LogUsers.class, id);
        if (logUser != null) {
            this.entityManager.remove(logUser);
        }

    }

    @Override
    public List<LogUsers> getAll() {
        Query query = this.entityManager.createQuery("SELECT l FROM LogUsers l");
        List<LogUsers> resultList = query.getResultList();
        return resultList;
    }
}

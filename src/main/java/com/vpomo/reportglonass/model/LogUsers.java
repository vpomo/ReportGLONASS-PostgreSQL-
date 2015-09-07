package com.vpomo.reportglonass.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Simple model logusers
 *
 * @author Pomogalov Vladimir
 */

@Entity
@Table(name = "log_users")
@Cacheable(false)
@XmlRootElement
public class LogUsers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_log_user")
    private Integer idLogUser;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_login")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLogin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "action_log")
    private String actionLog;
    @JoinColumn(name = "user_login", referencedColumnName = "login")
    @ManyToOne(optional = false)
    private Users userLogin;

    public LogUsers() {
    }

    public LogUsers(Integer idLogUser) {
        this.idLogUser = idLogUser;
    }

    public LogUsers(Users userLogin, Date dateLogin, String actionLog) {
        this.userLogin = userLogin;
        this.dateLogin = dateLogin;
        this.actionLog = actionLog;
    }

    public Integer getIdLogUser() {
        return idLogUser;
    }

    public void setIdLogUser(Integer idLogUser) {
        this.idLogUser = idLogUser;
    }

    public Date getDateLogin() {
        return dateLogin;
    }

    public void setDateLogin(Date dateLogin) {
        this.dateLogin = dateLogin;
    }

    public String getActionLog() {
        return actionLog;
    }

    public void setActionLog(String actionLog) {
        this.actionLog = actionLog;
    }

    public Users getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(Users userLogin) {
        this.userLogin = userLogin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLogUser != null ? idLogUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogUsers)) {
            return false;
        }
        LogUsers other = (LogUsers) object;
        if ((this.idLogUser == null && other.idLogUser != null) || (this.idLogUser != null && !this.idLogUser.equals(other.idLogUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.LogUsers[ idLogUser=" + idLogUser + " ]";
    }
    
}

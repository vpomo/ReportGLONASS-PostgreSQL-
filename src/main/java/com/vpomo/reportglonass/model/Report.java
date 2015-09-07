package com.vpomo.reportglonass.model;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Simple model report
 *
 * @author Pomogalov Vladimir
 */

@Entity
@Cacheable(false)
@Table(name = "report")
@XmlRootElement
public class Report implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_report")
    public Integer idReport;
    @Column(name = "date_report")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateReport;
    @Column(name = "catM1StateAll")
    private Integer catM1StateAll;
    @Column(name = "catM1MunicAll")
    private Integer catM1MunicAll;
    @Column(name = "catM1CommercAll")
    private Integer catM1CommercAll;
    @Column(name = "catM1ItogAll")
    private Integer catM1ItogAll;
    @Column(name = "catM2M3StateAll")
    private Integer catM2M3StateAll;
    @Column(name = "catM2M3MunicAll")
    private Integer catM2M3MunicAll;
    @Column(name = "catM2M3CommercAll")
    private Integer catM2M3CommercAll;
    @Column(name = "catM2M3ItogAll")
    private Integer catM2M3ItogAll;
    @Column(name = "catLargeStateAll")
    private Integer catLargeStateAll;
    @Column(name = "catLargeMunicAll")
    private Integer catLargeMunicAll;
    @Column(name = "catLargeCommercAll")
    private Integer catLargeCommercAll;
    @Column(name = "catLargeItogAll")
    private Integer catLargeItogAll;
    @Column(name = "catDangerStateAll")
    private Integer catDangerStateAll;
    @Column(name = "catDangerMunicAll")
    private Integer catDangerMunicAll;
    @Column(name = "catDangerCommercAll")
    private Integer catDangerCommercAll;
    @Column(name = "catDangerItogAll")
    private Integer catDangerItogAll;
    @Column(name = "catSchoolStateAll")
    private Integer catSchoolStateAll;
    @Column(name = "catSchoolMunicAll")
    private Integer catSchoolMunicAll;
    @Column(name = "catSchoolCommercAll")
    private Integer catSchoolCommercAll;
    @Column(name = "catSchoolItogAll")
    private Integer catSchoolItogAll;
    @Column(name = "catGKHStateAll")
    private Integer catGKHStateAll;
    @Column(name = "catGKHMunicAll")
    private Integer catGKHMunicAll;
    @Column(name = "catGKHCommercAll")
    private Integer catGKHCommercAll;
    @Column(name = "catGKHItogAll")
    private Integer catGKHItogAll;
    @Column(name = "catDepartStateAll")
    private Integer catDepartStateAll;
    @Column(name = "catDepartMunicAll")
    private Integer catDepartMunicAll;
    @Column(name = "catDepartCommercAll")
    private Integer catDepartCommercAll;
    @Column(name = "catDepartItogAll")
    private Integer catDepartItogAll;
    @Column(name = "catM1StateEquip")
    private Integer catM1StateEquip;
    @Column(name = "catM1MunicEquip")
    private Integer catM1MunicEquip;
    @Column(name = "catM1CommercEquip")
    private Integer catM1CommercEquip;
    @Column(name = "catM1ItogEquip")
    private Integer catM1ItogEquip;
    @Column(name = "catM2M3StateEquip")
    private Integer catM2M3StateEquip;
    @Column(name = "catM2M3MunicEquip")
    private Integer catM2M3MunicEquip;
    @Column(name = "catM2M3CommercEquip")
    private Integer catM2M3CommercEquip;
    @Column(name = "catM2M3ItogEquip")
    private Integer catM2M3ItogEquip;
    @Column(name = "catLargeStateEquip")
    private Integer catLargeStateEquip;
    @Column(name = "catLargeMunicEquip")
    private Integer catLargeMunicEquip;
    @Column(name = "catLargeCommercEquip")
    private Integer catLargeCommercEquip;
    @Column(name = "catLargeItogEquip")
    private Integer catLargeItogEquip;
    @Column(name = "catDangerStateEquip")
    private Integer catDangerStateEquip;
    @Column(name = "catDangerMunicEquip")
    private Integer catDangerMunicEquip;
    @Column(name = "catDangerCommercEquip")
    private Integer catDangerCommercEquip;
    @Column(name = "catDangerItogEquip")
    private Integer catDangerItogEquip;
    @Column(name = "catSchoolStateEquip")
    private Integer catSchoolStateEquip;
    @Column(name = "catSchoolMunicEquip")
    private Integer catSchoolMunicEquip;
    @Column(name = "catSchoolCommercEquip")
    private Integer catSchoolCommercEquip;
    @Column(name = "catSchoolItogEquip")
    private Integer catSchoolItogEquip;
    @Column(name = "catGKHStateEquip")
    private Integer catGKHStateEquip;
    @Column(name = "catGKHMunicEquip")
    private Integer catGKHMunicEquip;
    @Column(name = "catGKHCommercEquip")
    private Integer catGKHCommercEquip;
    @Column(name = "catGKHItogEquip")
    private Integer catGKHItogEquip;
    @Column(name = "catDepartStateEquip")
    private Integer catDepartStateEquip;
    @Column(name = "catDepartMunicEquip")
    private Integer catDepartMunicEquip;
    @Column(name = "catDepartCommercEquip")
    private Integer catDepartCommercEquip;
    @Column(name = "catDepartItogEquip")
    private Integer catDepartItogEquip;
    @Column(name = "catM1StateRNIS")
    private Integer catM1StateRNIS;
    @Column(name = "catM1MunicRNIS")
    private Integer catM1MunicRNIS;
    @Column(name = "catM1CommercRNIS")
    private Integer catM1CommercRNIS;
    @Column(name = "catM1ItogRNIS")
    private Integer catM1ItogRNIS;
    @Column(name = "catM2M3StateRNIS")
    private Integer catM2M3StateRNIS;
    @Column(name = "catM2M3MunicRNIS")
    private Integer catM2M3MunicRNIS;
    @Column(name = "catM2M3CommercRNIS")
    private Integer catM2M3CommercRNIS;
    @Column(name = "catM2M3ItogRNIS")
    private Integer catM2M3ItogRNIS;
    @Column(name = "catLargeStateRNIS")
    private Integer catLargeStateRNIS;
    @Column(name = "catLargeMunicRNIS")
    private Integer catLargeMunicRNIS;
    @Column(name = "catLargeCommercRNIS")
    private Integer catLargeCommercRNIS;
    @Column(name = "catLargeItogRNIS")
    private Integer catLargeItogRNIS;
    @Column(name = "catDangerStateRNIS")
    private Integer catDangerStateRNIS;
    @Column(name = "catDangerMunicRNIS")
    private Integer catDangerMunicRNIS;
    @Column(name = "catDangerCommercRNIS")
    private Integer catDangerCommercRNIS;
    @Column(name = "catDangerItogRNIS")
    private Integer catDangerItogRNIS;
    @Column(name = "catSchoolStateRNIS")
    private Integer catSchoolStateRNIS;
    @Column(name = "catSchoolMunicRNIS")
    private Integer catSchoolMunicRNIS;
    @Column(name = "catSchoolCommercRNIS")
    private Integer catSchoolCommercRNIS;
    @Column(name = "catSchoolItogRNIS")
    private Integer catSchoolItogRNIS;
    @Column(name = "catGKHStateRNIS")
    private Integer catGKHStateRNIS;
    @Column(name = "catGKHMunicRNIS")
    private Integer catGKHMunicRNIS;
    @Column(name = "catGKHCommercRNIS")
    private Integer catGKHCommercRNIS;
    @Column(name = "catGKHItogRNIS")
    private Integer catGKHItogRNIS;
    @Column(name = "catDepartStateRNIS")
    private Integer catDepartStateRNIS;
    @Column(name = "catDepartMunicRNIS")
    private Integer catDepartMunicRNIS;
    @Column(name = "catDepartCommercRNIS")
    private Integer catDepartCommercRNIS;
    @Column(name = "catDepartItogRNIS")
    private Integer catDepartItogRNIS;
    @Column(name = "catM1StateOther")
    private Integer catM1StateOther;
    @Column(name = "catM1MunicOther")
    private Integer catM1MunicOther;
    @Column(name = "catM1CommercOther")
    private Integer catM1CommercOther;
    @Column(name = "catM1ItogOther")
    private Integer catM1ItogOther;
    @Column(name = "catM2M3StateOther")
    private Integer catM2M3StateOther;
    @Column(name = "catM2M3MunicOther")
    private Integer catM2M3MunicOther;
    @Column(name = "catM2M3CommercOther")
    private Integer catM2M3CommercOther;
    @Column(name = "catM2M3ItogOther")
    private Integer catM2M3ItogOther;
    @Column(name = "catLargeStateOther")
    private Integer catLargeStateOther;
    @Column(name = "catLargeMunicOther")
    private Integer catLargeMunicOther;
    @Column(name = "catLargeCommercOther")
    private Integer catLargeCommercOther;
    @Column(name = "catLargeItogOther")
    private Integer catLargeItogOther;
    @Column(name = "catDangerStateOther")
    private Integer catDangerStateOther;
    @Column(name = "catDangerMunicOther")
    private Integer catDangerMunicOther;
    @Column(name = "catDangerCommercOther")
    private Integer catDangerCommercOther;
    @Column(name = "catDangerItogOther")
    private Integer catDangerItogOther;
    @Column(name = "catSchoolStateOther")
    private Integer catSchoolStateOther;
    @Column(name = "catSchoolMunicOther")
    private Integer catSchoolMunicOther;
    @Column(name = "catSchoolCommercOther")
    private Integer catSchoolCommercOther;
    @Column(name = "catSchoolItogOther")
    private Integer catSchoolItogOther;
    @Column(name = "catGKHStateOther")
    private Integer catGKHStateOther;
    @Column(name = "catGKHMunicOther")
    private Integer catGKHMunicOther;
    @Column(name = "catGKHCommercOther")
    private Integer catGKHCommercOther;
    @Column(name = "catGKHItogOther")
    private Integer catGKHItogOther;
    @Column(name = "catDepartStateOther")
    private Integer catDepartStateOther;
    @Column(name = "catDepartMunicOther")
    private Integer catDepartMunicOther;
    @Column(name = "catDepartCommercOther")
    private Integer catDepartCommercOther;
    @Column(name = "catDepartItogOther")
    private Integer catDepartItogOther;
    @JoinColumn(name = "user_report", referencedColumnName = "login")
    @ManyToOne(optional = false)
    private Users userReport;

    public Report() {
    }

    public Report(Integer idReport) {
        this.idReport = idReport;
    }

    public Report(Users userReport, Date dateReport,
                  Integer icatM1StateAll, Integer icatM1StateEquip, Integer icatM1StateRNIS, Integer icatM1StateOther,
                  Integer icatM1MunicAll, Integer icatM1MunicEquip, Integer icatM1MunicRNIS, Integer icatM1MunicOther,
                  Integer icatM1CommercAll, Integer icatM1CommercEquip, Integer icatM1CommercRNIS, Integer icatM1CommercOther,

                  Integer icatM2M3StateAll, Integer icatM2M3StateEquip, Integer icatM2M3StateRNIS, Integer icatM2M3StateOther,
                  Integer icatM2M3MunicAll, Integer icatM2M3MunicEquip, Integer icatM2M3MunicRNIS, Integer icatM2M3MunicOther,
                  Integer icatM2M3CommercAll, Integer icatM2M3CommercEquip, Integer icatM2M3CommercRNIS, Integer icatM2M3CommercOther,

                  Integer icatLargeStateAll, Integer icatLargeStateEquip, Integer icatLargeStateRNIS, Integer icatLargeStateOther,
                  Integer icatLargeMunicAll, Integer icatLargeMunicEquip, Integer icatLargeMunicRNIS, Integer icatLargeMunicOther,
                  Integer icatLargeCommercAll, Integer icatLargeCommercEquip, Integer icatLargeCommercRNIS, Integer icatLargeCommercOther,

                  Integer icatDangerStateAll, Integer icatDangerStateEquip, Integer icatDangerStateRNIS, Integer icatDangerStateOther,
                  Integer icatDangerMunicAll, Integer icatDangerMunicEquip, Integer icatDangerMunicRNIS, Integer icatDangerMunicOther,
                  Integer icatDangerCommercAll, Integer icatDangerCommercEquip, Integer icatDangerCommercRNIS, Integer icatDangerCommercOther,

                  Integer icatSchoolStateAll, Integer icatSchoolStateEquip, Integer icatSchoolStateRNIS, Integer icatSchoolStateOther,
                  Integer icatSchoolMunicAll, Integer icatSchoolMunicEquip, Integer icatSchoolMunicRNIS, Integer icatSchoolMunicOther,
                  Integer icatSchoolCommercAll, Integer icatSchoolCommercEquip, Integer icatSchoolCommercRNIS, Integer icatSchoolCommercOther,

                  Integer icatGKHStateAll, Integer icatGKHStateEquip, Integer icatGKHStateRNIS, Integer icatGKHStateOther,
                  Integer icatGKHMunicAll, Integer icatGKHMunicEquip, Integer icatGKHMunicRNIS, Integer icatGKHMunicOther,
                  Integer icatGKHCommercAll, Integer icatGKHCommercEquip, Integer icatGKHCommercRNIS, Integer icatGKHCommercOther,

                  Integer icatDepartStateAll, Integer icatDepartStateEquip, Integer icatDepartStateRNIS, Integer icatDepartStateOther,
                  Integer icatDepartMunicAll, Integer icatDepartMunicEquip, Integer icatDepartMunicRNIS, Integer icatDepartMunicOther,
                  Integer icatDepartCommercAll, Integer icatDepartCommercEquip, Integer icatDepartCommercRNIS, Integer icatDepartCommercOther

    ) {
        this.userReport = userReport;
        this.dateReport = dateReport;

        this.catM1StateAll = icatM1StateAll;
        this.catM1StateEquip = icatM1StateEquip;
        this.catM1StateRNIS = icatM1StateRNIS;
        this.catM1StateOther = icatM1StateOther;
        this.catM1MunicAll = icatM1MunicAll;
        this.catM1MunicEquip = icatM1MunicEquip;
        this.catM1MunicRNIS = icatM1MunicRNIS;
        this.catM1MunicOther = icatM1MunicOther;
        this.catM1CommercAll = icatM1CommercAll;
        this.catM1CommercEquip = icatM1CommercEquip;
        this.catM1CommercRNIS = icatM1CommercRNIS;
        this.catM1CommercOther = icatM1CommercOther;

        this.catM2M3StateAll = icatM2M3StateAll;
        this.catM2M3StateEquip = icatM2M3StateEquip;
        this.catM2M3StateRNIS = icatM2M3StateRNIS;
        this.catM2M3StateOther = icatM2M3StateOther;
        this.catM2M3MunicAll = icatM2M3MunicAll;
        this.catM2M3MunicEquip = icatM2M3MunicEquip;
        this.catM2M3MunicRNIS = icatM2M3MunicRNIS;
        this.catM2M3MunicOther = icatM2M3MunicOther;
        this.catM2M3CommercAll = icatM2M3CommercAll;
        this.catM2M3CommercEquip = icatM2M3CommercEquip;
        this.catM2M3CommercRNIS = icatM2M3CommercRNIS;
        this.catM2M3CommercOther = icatM2M3CommercOther;

        this.catLargeStateAll = icatLargeStateAll;
        this.catLargeStateEquip = icatLargeStateEquip;
        this.catLargeStateRNIS = icatLargeStateRNIS;
        this.catLargeStateOther = icatLargeStateOther;
        this.catLargeMunicAll = icatLargeMunicAll;
        this.catLargeMunicEquip = icatLargeMunicEquip;
        this.catLargeMunicRNIS = icatLargeMunicRNIS;
        this.catLargeMunicOther = icatLargeMunicOther;
        this.catLargeCommercAll = icatLargeCommercAll;
        this.catLargeCommercEquip = icatLargeCommercEquip;
        this.catLargeCommercRNIS = icatLargeCommercRNIS;
        this.catLargeCommercOther = icatLargeCommercOther;

        this.catDangerStateAll = icatDangerStateAll;
        this.catDangerStateEquip = icatDangerStateEquip;
        this.catDangerStateRNIS = icatDangerStateRNIS;
        this.catDangerStateOther = icatDangerStateOther;
        this.catDangerMunicAll = icatDangerMunicAll;
        this.catDangerMunicEquip = icatDangerMunicEquip;
        this.catDangerMunicRNIS = icatDangerMunicRNIS;
        this.catDangerMunicOther = icatDangerMunicOther;
        this.catDangerCommercAll = icatDangerCommercAll;
        this.catDangerCommercEquip = icatDangerCommercEquip;
        this.catDangerCommercRNIS = icatDangerCommercRNIS;
        this.catDangerCommercOther = icatDangerCommercOther;

        this.catSchoolStateAll = icatSchoolStateAll;
        this.catSchoolStateEquip = icatSchoolStateEquip;
        this.catSchoolStateRNIS = icatSchoolStateRNIS;
        this.catSchoolStateOther = icatSchoolStateOther;
        this.catSchoolMunicAll = icatSchoolMunicAll;
        this.catSchoolMunicEquip = icatSchoolMunicEquip;
        this.catSchoolMunicRNIS = icatSchoolMunicRNIS;
        this.catSchoolMunicOther = icatSchoolMunicOther;
        this.catSchoolCommercAll = icatSchoolCommercAll;
        this.catSchoolCommercEquip = icatSchoolCommercEquip;
        this.catSchoolCommercRNIS = icatSchoolCommercRNIS;
        this.catSchoolCommercOther = icatSchoolCommercOther;

        this.catGKHStateAll = icatGKHStateAll;
        this.catGKHStateEquip = icatGKHStateEquip;
        this.catGKHStateRNIS = icatGKHStateRNIS;
        this.catGKHStateOther = icatGKHStateOther;
        this.catGKHMunicAll = icatGKHMunicAll;
        this.catGKHMunicEquip = icatGKHMunicEquip;
        this.catGKHMunicRNIS = icatGKHMunicRNIS;
        this.catGKHMunicOther = icatGKHMunicOther;
        this.catGKHCommercAll = icatGKHCommercAll;
        this.catGKHCommercEquip = icatGKHCommercEquip;
        this.catGKHCommercRNIS = icatGKHCommercRNIS;
        this.catGKHCommercOther = icatGKHCommercOther;

        this.catDepartStateAll = icatDepartStateAll;
        this.catDepartStateEquip = icatDepartStateEquip;
        this.catDepartStateRNIS = icatDepartStateRNIS;
        this.catDepartStateOther = icatDepartStateOther;
        this.catDepartMunicAll = icatDepartMunicAll;
        this.catDepartMunicEquip = icatDepartMunicEquip;
        this.catDepartMunicRNIS = icatDepartMunicRNIS;
        this.catDepartMunicOther = icatDepartMunicOther;
        this.catDepartCommercAll = icatDepartCommercAll;
        this.catDepartCommercEquip = icatDepartCommercEquip;
        this.catDepartCommercRNIS = icatDepartCommercRNIS;
        this.catDepartCommercOther = icatDepartCommercOther;

        this.catM1ItogAll = icatM1StateAll + icatM1MunicAll + icatM1CommercAll;
        this.catM2M3ItogAll = icatM2M3StateAll + icatM2M3MunicAll + icatM2M3CommercAll;
        this.catLargeItogAll = icatLargeStateAll + icatLargeMunicAll + icatLargeCommercAll;
        this.catDangerItogAll = icatDangerStateAll + icatDangerMunicAll + icatDangerCommercAll;
        this.catSchoolItogAll = icatSchoolStateAll + icatSchoolMunicAll + icatSchoolCommercAll;
        this.catGKHItogAll = icatGKHStateAll + icatGKHMunicAll + icatGKHCommercAll;
        this.catDepartItogAll = icatDepartStateAll + icatDepartMunicAll + icatDepartCommercAll;

        this.catM1ItogEquip = icatM1StateEquip + icatM1MunicEquip + icatM1CommercEquip;
        this.catM2M3ItogEquip = icatM2M3StateEquip + icatM2M3MunicEquip + icatM2M3CommercEquip;
        this.catLargeItogEquip = icatLargeStateEquip + icatLargeMunicEquip + icatLargeCommercEquip;
        this.catDangerItogEquip = icatDangerStateEquip + icatDangerMunicEquip + icatDangerCommercEquip;
        this.catSchoolItogEquip = icatSchoolStateEquip + icatSchoolMunicEquip + icatSchoolCommercEquip;
        this.catGKHItogEquip = icatGKHStateEquip + icatGKHMunicEquip + icatGKHCommercEquip;
        this.catDepartItogEquip = icatDepartStateEquip + icatDepartMunicEquip + icatDepartCommercEquip;

        this.catM1ItogRNIS = icatM1StateRNIS + icatM1MunicRNIS + icatM1CommercRNIS;
        this.catM2M3ItogRNIS = icatM2M3StateRNIS + icatM2M3MunicRNIS + icatM2M3CommercRNIS;
        this.catLargeItogRNIS = icatLargeStateRNIS + icatLargeMunicRNIS + icatLargeCommercRNIS;
        this.catDangerItogRNIS = icatDangerStateRNIS + icatDangerMunicRNIS + icatDangerCommercRNIS;
        this.catSchoolItogRNIS = icatSchoolStateRNIS + icatSchoolMunicRNIS + icatSchoolCommercRNIS;
        this.catGKHItogRNIS = icatGKHStateRNIS + icatGKHMunicRNIS + icatGKHCommercRNIS;
        this.catDepartItogRNIS = icatDepartStateRNIS + icatDepartMunicRNIS + icatDepartCommercRNIS;

        this.catM1ItogOther = icatM1StateOther + icatM1MunicOther + icatM1CommercOther;
        this.catM2M3ItogOther = icatM2M3StateOther + icatM2M3MunicOther + icatM2M3CommercOther;
        this.catLargeItogOther = icatLargeStateOther + icatLargeMunicOther + icatLargeCommercOther;
        this.catDangerItogOther = icatDangerStateOther + icatDangerMunicOther + icatDangerCommercOther;
        this.catSchoolItogOther = icatSchoolStateOther + icatSchoolMunicOther + icatSchoolCommercOther;
        this.catGKHItogOther = icatGKHStateOther + icatGKHMunicOther + icatGKHCommercOther;
        this.catDepartItogOther = icatDepartStateOther + icatDepartMunicOther + icatDepartCommercOther;

    }

    public Integer getIdReport() {
        return idReport;
    }

    public void setIdReport(Integer idReport) {
        this.idReport = idReport;
    }

    public String getDateReport() {
        try {
            return new SimpleDateFormat("dd.MM.yyyy").format(this.dateReport);
        } catch (NullPointerException e) {
            return "Дата не определена";
        }
    }

    public void setDateReport(Date dateReport) {
        this.dateReport = dateReport;
    }

    public Integer getCatM1StateAll() {
        return catM1StateAll;
    }

    public void setCatM1StateAll(Integer catM1StateAll) {
        this.catM1StateAll = catM1StateAll;
    }

    public Integer getCatM1MunicAll() {
        return catM1MunicAll;
    }

    public void setCatM1MunicAll(Integer catM1MunicAll) {
        this.catM1MunicAll = catM1MunicAll;
    }

    public Integer getCatM1CommercAll() {
        return catM1CommercAll;
    }

    public void setCatM1CommercAll(Integer catM1CommercAll) {
        this.catM1CommercAll = catM1CommercAll;
    }

    public Integer getCatM1ItogAll() {
        return catM1ItogAll;
    }

    public void setCatM1ItogAll(Integer catM1ItogAll) {
        this.catM1ItogAll = catM1ItogAll;
    }

    public Integer getCatM2M3StateAll() {
        return catM2M3StateAll;
    }

    public void setCatM2M3StateAll(Integer catM2M3StateAll) {
        this.catM2M3StateAll = catM2M3StateAll;
    }

    public Integer getCatM2M3MunicAll() {
        return catM2M3MunicAll;
    }

    public void setCatM2M3MunicAll(Integer catM2M3MunicAll) {
        this.catM2M3MunicAll = catM2M3MunicAll;
    }

    public Integer getCatM2M3CommercAll() {
        return catM2M3CommercAll;
    }

    public void setCatM2M3CommercAll(Integer catM2M3CommercAll) {
        this.catM2M3CommercAll = catM2M3CommercAll;
    }

    public Integer getCatM2M3ItogAll() {
        return catM2M3ItogAll;
    }

    public void setCatM2M3ItogAll(Integer catM2M3ItogAll) {
        this.catM2M3ItogAll = catM2M3ItogAll;
    }

    public Integer getCatLargeStateAll() {
        return catLargeStateAll;
    }

    public void setCatLargeStateAll(Integer catLargeStateAll) {
        this.catLargeStateAll = catLargeStateAll;
    }

    public Integer getCatLargeMunicAll() {
        return catLargeMunicAll;
    }

    public void setCatLargeMunicAll(Integer catLargeMunicAll) {
        this.catLargeMunicAll = catLargeMunicAll;
    }

    public Integer getCatLargeCommercAll() {
        return catLargeCommercAll;
    }

    public void setCatLargeCommercAll(Integer catLargeCommercAll) {
        this.catLargeCommercAll = catLargeCommercAll;
    }

    public Integer getCatLargeItogAll() {
        return catLargeItogAll;
    }

    public void setCatLargeItogAll(Integer catLargeItogAll) {
        this.catLargeItogAll = catLargeItogAll;
    }

    public Integer getCatDangerStateAll() {
        return catDangerStateAll;
    }

    public void setCatDangerStateAll(Integer catDangerStateAll) {
        this.catDangerStateAll = catDangerStateAll;
    }

    public Integer getCatDangerMunicAll() {
        return catDangerMunicAll;
    }

    public void setCatDangerMunicAll(Integer catDangerMunicAll) {
        this.catDangerMunicAll = catDangerMunicAll;
    }

    public Integer getCatDangerCommercAll() {
        return catDangerCommercAll;
    }

    public void setCatDangerCommercAll(Integer catDangerCommercAll) {
        this.catDangerCommercAll = catDangerCommercAll;
    }

    public Integer getCatDangerItogAll() {
        return catDangerItogAll;
    }

    public void setCatDangerItogAll(Integer catDangerItogAll) {
        this.catDangerItogAll = catDangerItogAll;
    }

    public Integer getCatSchoolStateAll() {
        return catSchoolStateAll;
    }

    public void setCatSchoolStateAll(Integer catSchoolStateAll) {
        this.catSchoolStateAll = catSchoolStateAll;
    }

    public Integer getCatSchoolMunicAll() {
        return catSchoolMunicAll;
    }

    public void setCatSchoolMunicAll(Integer catSchoolMunicAll) {
        this.catSchoolMunicAll = catSchoolMunicAll;
    }

    public Integer getCatSchoolCommercAll() {
        return catSchoolCommercAll;
    }

    public void setCatSchoolCommercAll(Integer catSchoolCommercAll) {
        this.catSchoolCommercAll = catSchoolCommercAll;
    }

    public Integer getCatSchoolItogAll() {
        return catSchoolItogAll;
    }

    public void setCatSchoolItogAll(Integer catSchoolItogAll) {
        this.catSchoolItogAll = catSchoolItogAll;
    }

    public Integer getCatGKHStateAll() {
        return catGKHStateAll;
    }

    public void setCatGKHStateAll(Integer catGKHStateAll) {
        this.catGKHStateAll = catGKHStateAll;
    }

    public Integer getCatGKHMunicAll() {
        return catGKHMunicAll;
    }

    public void setCatGKHMunicAll(Integer catGKHMunicAll) {
        this.catGKHMunicAll = catGKHMunicAll;
    }

    public Integer getCatGKHCommercAll() {
        return catGKHCommercAll;
    }

    public void setCatGKHCommercAll(Integer catGKHCommercAll) {
        this.catGKHCommercAll = catGKHCommercAll;
    }

    public Integer getCatGKHItogAll() {
        return catGKHItogAll;
    }

    public void setCatGKHItogAll(Integer catGKHItogAll) {
        this.catGKHItogAll = catGKHItogAll;
    }

    public Integer getCatDepartStateAll() {
        return catDepartStateAll;
    }

    public void setCatDepartStateAll(Integer catDepartStateAll) {
        this.catDepartStateAll = catDepartStateAll;
    }

    public Integer getCatDepartMunicAll() {
        return catDepartMunicAll;
    }

    public void setCatDepartMunicAll(Integer catDepartMunicAll) {
        this.catDepartMunicAll = catDepartMunicAll;
    }

    public Integer getCatDepartCommercAll() {
        return catDepartCommercAll;
    }

    public void setCatDepartCommercAll(Integer catDepartCommercAll) {
        this.catDepartCommercAll = catDepartCommercAll;
    }

    public Integer getCatDepartItogAll() {
        return catDepartItogAll;
    }

    public void setCatDepartItogAll(Integer catDepartItogAll) {
        this.catDepartItogAll = catDepartItogAll;
    }

    public Integer getCatM1StateEquip() {
        return catM1StateEquip;
    }

    public void setCatM1StateEquip(Integer catM1StateEquip) {
        this.catM1StateEquip = catM1StateEquip;
    }

    public Integer getCatM1MunicEquip() {
        return catM1MunicEquip;
    }

    public void setCatM1MunicEquip(Integer catM1MunicEquip) {
        this.catM1MunicEquip = catM1MunicEquip;
    }

    public Integer getCatM1CommercEquip() {
        return catM1CommercEquip;
    }

    public void setCatM1CommercEquip(Integer catM1CommercEquip) {
        this.catM1CommercEquip = catM1CommercEquip;
    }

    public Integer getCatM1ItogEquip() {
        return catM1ItogEquip;
    }

    public void setCatM1ItogEquip(Integer catM1ItogEquip) {
        this.catM1ItogEquip = catM1ItogEquip;
    }

    public Integer getCatM2M3StateEquip() {
        return catM2M3StateEquip;
    }

    public void setCatM2M3StateEquip(Integer catM2M3StateEquip) {
        this.catM2M3StateEquip = catM2M3StateEquip;
    }

    public Integer getCatM2M3MunicEquip() {
        return catM2M3MunicEquip;
    }

    public void setCatM2M3MunicEquip(Integer catM2M3MunicEquip) {
        this.catM2M3MunicEquip = catM2M3MunicEquip;
    }

    public Integer getCatM2M3CommercEquip() {
        return catM2M3CommercEquip;
    }

    public void setCatM2M3CommercEquip(Integer catM2M3CommercEquip) {
        this.catM2M3CommercEquip = catM2M3CommercEquip;
    }

    public Integer getCatM2M3ItogEquip() {
        return catM2M3ItogEquip;
    }

    public void setCatM2M3ItogEquip(Integer catM2M3ItogEquip) {
        this.catM2M3ItogEquip = catM2M3ItogEquip;
    }

    public Integer getCatLargeStateEquip() {
        return catLargeStateEquip;
    }

    public void setCatLargeStateEquip(Integer catLargeStateEquip) {
        this.catLargeStateEquip = catLargeStateEquip;
    }

    public Integer getCatLargeMunicEquip() {
        return catLargeMunicEquip;
    }

    public void setCatLargeMunicEquip(Integer catLargeMunicEquip) {
        this.catLargeMunicEquip = catLargeMunicEquip;
    }

    public Integer getCatLargeCommercEquip() {
        return catLargeCommercEquip;
    }

    public void setCatLargeCommercEquip(Integer catLargeCommercEquip) {
        this.catLargeCommercEquip = catLargeCommercEquip;
    }

    public Integer getCatLargeItogEquip() {
        return catLargeItogEquip;
    }

    public void setCatLargeItogEquip(Integer catLargeItogEquip) {
        this.catLargeItogEquip = catLargeItogEquip;
    }

    public Integer getCatDangerStateEquip() {
        return catDangerStateEquip;
    }

    public void setCatDangerStateEquip(Integer catDangerStateEquip) {
        this.catDangerStateEquip = catDangerStateEquip;
    }

    public Integer getCatDangerMunicEquip() {
        return catDangerMunicEquip;
    }

    public void setCatDangerMunicEquip(Integer catDangerMunicEquip) {
        this.catDangerMunicEquip = catDangerMunicEquip;
    }

    public Integer getCatDangerCommercEquip() {
        return catDangerCommercEquip;
    }

    public void setCatDangerCommercEquip(Integer catDangerCommercEquip) {
        this.catDangerCommercEquip = catDangerCommercEquip;
    }

    public Integer getCatDangerItogEquip() {
        return catDangerItogEquip;
    }

    public void setCatDangerItogEquip(Integer catDangerItogEquip) {
        this.catDangerItogEquip = catDangerItogEquip;
    }

    public Integer getCatSchoolStateEquip() {
        return catSchoolStateEquip;
    }

    public void setCatSchoolStateEquip(Integer catSchoolStateEquip) {
        this.catSchoolStateEquip = catSchoolStateEquip;
    }

    public Integer getCatSchoolMunicEquip() {
        return catSchoolMunicEquip;
    }

    public void setCatSchoolMunicEquip(Integer catSchoolMunicEquip) {
        this.catSchoolMunicEquip = catSchoolMunicEquip;
    }

    public Integer getCatSchoolCommercEquip() {
        return catSchoolCommercEquip;
    }

    public void setCatSchoolCommercEquip(Integer catSchoolCommercEquip) {
        this.catSchoolCommercEquip = catSchoolCommercEquip;
    }

    public Integer getCatSchoolItogEquip() {
        return catSchoolItogEquip;
    }

    public void setCatSchoolItogEquip(Integer catSchoolItogEquip) {
        this.catSchoolItogEquip = catSchoolItogEquip;
    }

    public Integer getCatGKHStateEquip() {
        return catGKHStateEquip;
    }

    public void setCatGKHStateEquip(Integer catGKHStateEquip) {
        this.catGKHStateEquip = catGKHStateEquip;
    }

    public Integer getCatGKHMunicEquip() {
        return catGKHMunicEquip;
    }

    public void setCatGKHMunicEquip(Integer catGKHMunicEquip) {
        this.catGKHMunicEquip = catGKHMunicEquip;
    }

    public Integer getCatGKHCommercEquip() {
        return catGKHCommercEquip;
    }

    public void setCatGKHCommercEquip(Integer catGKHCommercEquip) {
        this.catGKHCommercEquip = catGKHCommercEquip;
    }

    public Integer getCatGKHItogEquip() {
        return catGKHItogEquip;
    }

    public void setCatGKHItogEquip(Integer catGKHItogEquip) {
        this.catGKHItogEquip = catGKHItogEquip;
    }

    public Integer getCatDepartStateEquip() {
        return catDepartStateEquip;
    }

    public void setCatDepartStateEquip(Integer catDepartStateEquip) {
        this.catDepartStateEquip = catDepartStateEquip;
    }

    public Integer getCatDepartMunicEquip() {
        return catDepartMunicEquip;
    }

    public void setCatDepartMunicEquip(Integer catDepartMunicEquip) {
        this.catDepartMunicEquip = catDepartMunicEquip;
    }

    public Integer getCatDepartCommercEquip() {
        return catDepartCommercEquip;
    }

    public void setCatDepartCommercEquip(Integer catDepartCommercEquip) {
        this.catDepartCommercEquip = catDepartCommercEquip;
    }

    public Integer getCatDepartItogEquip() {
        return catDepartItogEquip;
    }

    public void setCatDepartItogEquip(Integer catDepartItogEquip) {
        this.catDepartItogEquip = catDepartItogEquip;
    }

    public Integer getCatM1StateRNIS() {
        return catM1StateRNIS;
    }

    public void setCatM1StateRNIS(Integer catM1StateRNIS) {
        this.catM1StateRNIS = catM1StateRNIS;
    }

    public Integer getCatM1MunicRNIS() {
        return catM1MunicRNIS;
    }

    public void setCatM1MunicRNIS(Integer catM1MunicRNIS) {
        this.catM1MunicRNIS = catM1MunicRNIS;
    }

    public Integer getCatM1CommercRNIS() {
        return catM1CommercRNIS;
    }

    public void setCatM1CommercRNIS(Integer catM1CommercRNIS) {
        this.catM1CommercRNIS = catM1CommercRNIS;
    }

    public Integer getCatM1ItogRNIS() {
        return catM1ItogRNIS;
    }

    public void setCatM1ItogRNIS(Integer catM1ItogRNIS) {
        this.catM1ItogRNIS = catM1ItogRNIS;
    }

    public Integer getCatM2M3StateRNIS() {
        return catM2M3StateRNIS;
    }

    public void setCatM2M3StateRNIS(Integer catM2M3StateRNIS) {
        this.catM2M3StateRNIS = catM2M3StateRNIS;
    }

    public Integer getCatM2M3MunicRNIS() {
        return catM2M3MunicRNIS;
    }

    public void setCatM2M3MunicRNIS(Integer catM2M3MunicRNIS) {
        this.catM2M3MunicRNIS = catM2M3MunicRNIS;
    }

    public Integer getCatM2M3CommercRNIS() {
        return catM2M3CommercRNIS;
    }

    public void setCatM2M3CommercRNIS(Integer catM2M3CommercRNIS) {
        this.catM2M3CommercRNIS = catM2M3CommercRNIS;
    }

    public Integer getCatM2M3ItogRNIS() {
        return catM2M3ItogRNIS;
    }

    public void setCatM2M3ItogRNIS(Integer catM2M3ItogRNIS) {
        this.catM2M3ItogRNIS = catM2M3ItogRNIS;
    }

    public Integer getCatLargeStateRNIS() {
        return catLargeStateRNIS;
    }

    public void setCatLargeStateRNIS(Integer catLargeStateRNIS) {
        this.catLargeStateRNIS = catLargeStateRNIS;
    }

    public Integer getCatLargeMunicRNIS() {
        return catLargeMunicRNIS;
    }

    public void setCatLargeMunicRNIS(Integer catLargeMunicRNIS) {
        this.catLargeMunicRNIS = catLargeMunicRNIS;
    }

    public Integer getCatLargeCommercRNIS() {
        return catLargeCommercRNIS;
    }

    public void setCatLargeCommercRNIS(Integer catLargeCommercRNIS) {
        this.catLargeCommercRNIS = catLargeCommercRNIS;
    }

    public Integer getCatLargeItogRNIS() {
        return catLargeItogRNIS;
    }

    public void setCatLargeItogRNIS(Integer catLargeItogRNIS) {
        this.catLargeItogRNIS = catLargeItogRNIS;
    }

    public Integer getCatDangerStateRNIS() {
        return catDangerStateRNIS;
    }

    public void setCatDangerStateRNIS(Integer catDangerStateRNIS) {
        this.catDangerStateRNIS = catDangerStateRNIS;
    }

    public Integer getCatDangerMunicRNIS() {
        return catDangerMunicRNIS;
    }

    public void setCatDangerMunicRNIS(Integer catDangerMunicRNIS) {
        this.catDangerMunicRNIS = catDangerMunicRNIS;
    }

    public Integer getCatDangerCommercRNIS() {
        return catDangerCommercRNIS;
    }

    public void setCatDangerCommercRNIS(Integer catDangerCommercRNIS) {
        this.catDangerCommercRNIS = catDangerCommercRNIS;
    }

    public Integer getCatDangerItogRNIS() {
        return catDangerItogRNIS;
    }

    public void setCatDangerItogRNIS(Integer catDangerItogRNIS) {
        this.catDangerItogRNIS = catDangerItogRNIS;
    }

    public Integer getCatSchoolStateRNIS() {
        return catSchoolStateRNIS;
    }

    public void setCatSchoolStateRNIS(Integer catSchoolStateRNIS) {
        this.catSchoolStateRNIS = catSchoolStateRNIS;
    }

    public Integer getCatSchoolMunicRNIS() {
        return catSchoolMunicRNIS;
    }

    public void setCatSchoolMunicRNIS(Integer catSchoolMunicRNIS) {
        this.catSchoolMunicRNIS = catSchoolMunicRNIS;
    }

    public Integer getCatSchoolCommercRNIS() {
        return catSchoolCommercRNIS;
    }

    public void setCatSchoolCommercRNIS(Integer catSchoolCommercRNIS) {
        this.catSchoolCommercRNIS = catSchoolCommercRNIS;
    }

    public Integer getCatSchoolItogRNIS() {
        return catSchoolItogRNIS;
    }

    public void setCatSchoolItogRNIS(Integer catSchoolItogRNIS) {
        this.catSchoolItogRNIS = catSchoolItogRNIS;
    }

    public Integer getCatGKHStateRNIS() {
        return catGKHStateRNIS;
    }

    public void setCatGKHStateRNIS(Integer catGKHStateRNIS) {
        this.catGKHStateRNIS = catGKHStateRNIS;
    }

    public Integer getCatGKHMunicRNIS() {
        return catGKHMunicRNIS;
    }

    public void setCatGKHMunicRNIS(Integer catGKHMunicRNIS) {
        this.catGKHMunicRNIS = catGKHMunicRNIS;
    }

    public Integer getCatGKHCommercRNIS() {
        return catGKHCommercRNIS;
    }

    public void setCatGKHCommercRNIS(Integer catGKHCommercRNIS) {
        this.catGKHCommercRNIS = catGKHCommercRNIS;
    }

    public Integer getCatGKHItogRNIS() {
        return catGKHItogRNIS;
    }

    public void setCatGKHItogRNIS(Integer catGKHItogRNIS) {
        this.catGKHItogRNIS = catGKHItogRNIS;
    }

    public Integer getCatDepartStateRNIS() {
        return catDepartStateRNIS;
    }

    public void setCatDepartStateRNIS(Integer catDepartStateRNIS) {
        this.catDepartStateRNIS = catDepartStateRNIS;
    }

    public Integer getCatDepartMunicRNIS() {
        return catDepartMunicRNIS;
    }

    public void setCatDepartMunicRNIS(Integer catDepartMunicRNIS) {
        this.catDepartMunicRNIS = catDepartMunicRNIS;
    }

    public Integer getCatDepartCommercRNIS() {
        return catDepartCommercRNIS;
    }

    public void setCatDepartCommercRNIS(Integer catDepartCommercRNIS) {
        this.catDepartCommercRNIS = catDepartCommercRNIS;
    }

    public Integer getCatDepartItogRNIS() {
        return catDepartItogRNIS;
    }

    public void setCatDepartItogRNIS(Integer catDepartItogRNIS) {
        this.catDepartItogRNIS = catDepartItogRNIS;
    }

    public Integer getCatM1StateOther() {
        return catM1StateOther;
    }

    public void setCatM1StateOther(Integer catM1StateOther) {
        this.catM1StateOther = catM1StateOther;
    }

    public Integer getCatM1MunicOther() {
        return catM1MunicOther;
    }

    public void setCatM1MunicOther(Integer catM1MunicOther) {
        this.catM1MunicOther = catM1MunicOther;
    }

    public Integer getCatM1CommercOther() {
        return catM1CommercOther;
    }

    public void setCatM1CommercOther(Integer catM1CommercOther) {
        this.catM1CommercOther = catM1CommercOther;
    }

    public Integer getCatM1ItogOther() {
        return catM1ItogOther;
    }

    public void setCatM1ItogOther(Integer catM1ItogOther) {
        this.catM1ItogOther = catM1ItogOther;
    }

    public Integer getCatM2M3StateOther() {
        return catM2M3StateOther;
    }

    public void setCatM2M3StateOther(Integer catM2M3StateOther) {
        this.catM2M3StateOther = catM2M3StateOther;
    }

    public Integer getCatM2M3MunicOther() {
        return catM2M3MunicOther;
    }

    public void setCatM2M3MunicOther(Integer catM2M3MunicOther) {
        this.catM2M3MunicOther = catM2M3MunicOther;
    }

    public Integer getCatM2M3CommercOther() {
        return catM2M3CommercOther;
    }

    public void setCatM2M3CommercOther(Integer catM2M3CommercOther) {
        this.catM2M3CommercOther = catM2M3CommercOther;
    }

    public Integer getCatM2M3ItogOther() {
        return catM2M3ItogOther;
    }

    public void setCatM2M3ItogOther(Integer catM2M3ItogOther) {
        this.catM2M3ItogOther = catM2M3ItogOther;
    }

    public Integer getCatLargeStateOther() {
        return catLargeStateOther;
    }

    public void setCatLargeStateOther(Integer catLargeStateOther) {
        this.catLargeStateOther = catLargeStateOther;
    }

    public Integer getCatLargeMunicOther() {
        return catLargeMunicOther;
    }

    public void setCatLargeMunicOther(Integer catLargeMunicOther) {
        this.catLargeMunicOther = catLargeMunicOther;
    }

    public Integer getCatLargeCommercOther() {
        return catLargeCommercOther;
    }

    public void setCatLargeCommercOther(Integer catLargeCommercOther) {
        this.catLargeCommercOther = catLargeCommercOther;
    }

    public Integer getCatLargeItogOther() {
        return catLargeItogOther;
    }

    public void setCatLargeItogOther(Integer catLargeItogOther) {
        this.catLargeItogOther = catLargeItogOther;
    }

    public Integer getCatDangerStateOther() {
        return catDangerStateOther;
    }

    public void setCatDangerStateOther(Integer catDangerStateOther) {
        this.catDangerStateOther = catDangerStateOther;
    }

    public Integer getCatDangerMunicOther() {
        return catDangerMunicOther;
    }

    public void setCatDangerMunicOther(Integer catDangerMunicOther) {
        this.catDangerMunicOther = catDangerMunicOther;
    }

    public Integer getCatDangerCommercOther() {
        return catDangerCommercOther;
    }

    public void setCatDangerCommercOther(Integer catDangerCommercOther) {
        this.catDangerCommercOther = catDangerCommercOther;
    }

    public Integer getCatDangerItogOther() {
        return catDangerItogOther;
    }

    public void setCatDangerItogOther(Integer catDangerItogOther) {
        this.catDangerItogOther = catDangerItogOther;
    }

    public Integer getCatSchoolStateOther() {
        return catSchoolStateOther;
    }

    public void setCatSchoolStateOther(Integer catSchoolStateOther) {
        this.catSchoolStateOther = catSchoolStateOther;
    }

    public Integer getCatSchoolMunicOther() {
        return catSchoolMunicOther;
    }

    public void setCatSchoolMunicOther(Integer catSchoolMunicOther) {
        this.catSchoolMunicOther = catSchoolMunicOther;
    }

    public Integer getCatSchoolCommercOther() {
        return catSchoolCommercOther;
    }

    public void setCatSchoolCommercOther(Integer catSchoolCommercOther) {
        this.catSchoolCommercOther = catSchoolCommercOther;
    }

    public Integer getCatSchoolItogOther() {
        return catSchoolItogOther;
    }

    public void setCatSchoolItogOther(Integer catSchoolItogOther) {
        this.catSchoolItogOther = catSchoolItogOther;
    }

    public Integer getCatGKHStateOther() {
        return catGKHStateOther;
    }

    public void setCatGKHStateOther(Integer catGKHStateOther) {
        this.catGKHStateOther = catGKHStateOther;
    }

    public Integer getCatGKHMunicOther() {
        return catGKHMunicOther;
    }

    public void setCatGKHMunicOther(Integer catGKHMunicOther) {
        this.catGKHMunicOther = catGKHMunicOther;
    }

    public Integer getCatGKHCommercOther() {
        return catGKHCommercOther;
    }

    public void setCatGKHCommercOther(Integer catGKHCommercOther) {
        this.catGKHCommercOther = catGKHCommercOther;
    }

    public Integer getCatGKHItogOther() {
        return catGKHItogOther;
    }

    public void setCatGKHItogOther(Integer catGKHItogOther) {
        this.catGKHItogOther = catGKHItogOther;
    }

    public Integer getCatDepartStateOther() {
        return catDepartStateOther;
    }

    public void setCatDepartStateOther(Integer catDepartStateOther) {
        this.catDepartStateOther = catDepartStateOther;
    }

    public Integer getCatDepartMunicOther() {
        return catDepartMunicOther;
    }

    public void setCatDepartMunicOther(Integer catDepartMunicOther) {
        this.catDepartMunicOther = catDepartMunicOther;
    }

    public Integer getCatDepartCommercOther() {
        return catDepartCommercOther;
    }

    public void setCatDepartCommercOther(Integer catDepartCommercOther) {
        this.catDepartCommercOther = catDepartCommercOther;
    }

    public Integer getCatDepartItogOther() {
        return catDepartItogOther;
    }

    public void setCatDepartItogOther(Integer catDepartItogOther) {
        this.catDepartItogOther = catDepartItogOther;
    }

    public Users getUserReport() {
        return userReport;
    }

    public void setUserReport(Users userReport) {
        this.userReport = userReport;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReport != null ? idReport.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Report)) {
            return false;
        }
        Report other = (Report) object;
        if ((this.idReport == null && other.idReport != null) || (this.idReport != null && !this.idReport.equals(other.idReport))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Report[ idReport=" + idReport + " ]";
    }

}

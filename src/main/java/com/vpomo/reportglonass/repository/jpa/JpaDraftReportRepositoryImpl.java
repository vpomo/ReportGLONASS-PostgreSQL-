package com.vpomo.reportglonass.repository.jpa;

import com.vpomo.reportglonass.model.DraftReport;
import com.vpomo.reportglonass.model.Report;
import com.vpomo.reportglonass.model.Users;
import com.vpomo.reportglonass.repository.DraftReportRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import org.springframework.cache.annotation.Cacheable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Date;
import java.util.List;

/**
 * JPA implementation of the {@link com.vpomo.reportglonass.repository.DraftReportRepository} interface.
 *
 * @author Pomogalov Vladimir
 */

@Repository
@EnableTransactionManagement
public class JpaDraftReportRepositoryImpl implements DraftReportRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<DraftReport> getAll() {
        Query query = this.entityManager.createQuery("SELECT d FROM DraftReport d ORDER BY d.dateReport ASC");
        List<DraftReport> resultList = query.getResultList();
        return resultList;
    }

    @Override
    public Integer addReport(
            Users userR, Date currentDate,
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
        try {
            DraftReport report = new DraftReport(
                    userR, currentDate,
                    icatM1StateAll, icatM1StateEquip, icatM1StateRNIS, icatM1StateOther,
                    icatM1MunicAll, icatM1MunicEquip, icatM1MunicRNIS, icatM1MunicOther,
                    icatM1CommercAll, icatM1CommercEquip, icatM1CommercRNIS, icatM1CommercOther,

                    icatM2M3StateAll, icatM2M3StateEquip, icatM2M3StateRNIS, icatM2M3StateOther,
                    icatM2M3MunicAll, icatM2M3MunicEquip, icatM2M3MunicRNIS, icatM2M3MunicOther,
                    icatM2M3CommercAll, icatM2M3CommercEquip, icatM2M3CommercRNIS, icatM2M3CommercOther,

                    icatLargeStateAll, icatLargeStateEquip, icatLargeStateRNIS, icatLargeStateOther,
                    icatLargeMunicAll, icatLargeMunicEquip, icatLargeMunicRNIS, icatLargeMunicOther,
                    icatLargeCommercAll, icatLargeCommercEquip, icatLargeCommercRNIS, icatLargeCommercOther,

                    icatDangerStateAll, icatDangerStateEquip, icatDangerStateRNIS, icatDangerStateOther,
                    icatDangerMunicAll, icatDangerMunicEquip, icatDangerMunicRNIS, icatDangerMunicOther,
                    icatDangerCommercAll, icatDangerCommercEquip, icatDangerCommercRNIS, icatDangerCommercOther,

                    icatSchoolStateAll, icatSchoolStateEquip, icatSchoolStateRNIS, icatSchoolStateOther,
                    icatSchoolMunicAll, icatSchoolMunicEquip, icatSchoolMunicRNIS, icatSchoolMunicOther,
                    icatSchoolCommercAll, icatSchoolCommercEquip, icatSchoolCommercRNIS, icatSchoolCommercOther,

                    icatGKHStateAll, icatGKHStateEquip, icatGKHStateRNIS, icatGKHStateOther,
                    icatGKHMunicAll, icatGKHMunicEquip, icatGKHMunicRNIS, icatGKHMunicOther,
                    icatGKHCommercAll, icatGKHCommercEquip, icatGKHCommercRNIS, icatGKHCommercOther,

                    icatDepartStateAll, icatDepartStateEquip, icatDepartStateRNIS, icatDepartStateOther,
                    icatDepartMunicAll, icatDepartMunicEquip, icatDepartMunicRNIS, icatDepartMunicOther,
                    icatDepartCommercAll, icatDepartCommercEquip, icatDepartCommercRNIS, icatDepartCommercOther
            );
            this.entityManager.persist(report);
            //this.entityManager.refresh(Users.class);
            this.entityManager.flush();
            return report.getIdDraftreport();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    //@Cacheable(false)
    public void updateReport(
            String login, Date dateReport,
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
        Users userR = null;
        userR = this.entityManager.find(Users.class, login);
        if (userR != null) {
            DraftReport report = userR.getDraftreportList().get(0);

            if (report != null) {
                report.setDateReport(dateReport);
                report.setCatM1StateAll(icatM1StateAll);
                report.setCatM1StateEquip(icatM1StateEquip);
                report.setCatM1StateRNIS(icatM1StateRNIS);
                report.setCatM1StateOther(icatM1StateOther);
                report.setCatM1MunicAll(icatM1MunicAll);
                report.setCatM1MunicEquip(icatM1MunicEquip);
                report.setCatM1MunicRNIS(icatM1MunicRNIS);
                report.setCatM1MunicOther(icatM1MunicOther);
                report.setCatM1CommercAll(icatM1CommercAll);
                report.setCatM1CommercEquip(icatM1CommercEquip);
                report.setCatM1CommercRNIS(icatM1CommercRNIS);
                report.setCatM1CommercOther(icatM1CommercOther);

                report.setCatM2M3StateAll(icatM2M3StateAll);
                report.setCatM2M3StateEquip(icatM1StateEquip);
                report.setCatM2M3StateRNIS(icatM2M3StateRNIS);
                report.setCatM2M3StateOther(icatM2M3StateOther);
                report.setCatM2M3MunicAll(icatM2M3MunicAll);
                report.setCatM2M3MunicEquip(icatM2M3MunicEquip);
                report.setCatM2M3MunicRNIS(icatM2M3MunicRNIS);
                report.setCatM2M3MunicOther(icatM2M3MunicOther);
                report.setCatM2M3CommercAll(icatM2M3CommercAll);
                report.setCatM2M3CommercEquip(icatM2M3CommercEquip);
                report.setCatM2M3CommercRNIS(icatM2M3CommercRNIS);
                report.setCatM2M3CommercOther(icatM2M3CommercOther);

                report.setCatLargeStateAll(icatLargeStateAll);
                report.setCatLargeStateEquip(icatLargeStateEquip);
                report.setCatLargeStateRNIS(icatLargeStateRNIS);
                report.setCatLargeStateOther(icatLargeStateOther);
                report.setCatLargeMunicAll(icatLargeMunicAll);
                report.setCatLargeMunicEquip(icatLargeMunicEquip);
                report.setCatLargeMunicRNIS(icatLargeMunicRNIS);
                report.setCatLargeMunicOther(icatLargeMunicOther);
                report.setCatLargeCommercAll(icatLargeCommercAll);
                report.setCatLargeCommercEquip(icatLargeCommercEquip);
                report.setCatLargeCommercRNIS(icatLargeCommercRNIS);
                report.setCatLargeCommercOther(icatLargeCommercOther);

                report.setCatDangerStateAll(icatDangerStateAll);
                report.setCatDangerStateEquip(icatDangerStateEquip);
                report.setCatDangerStateRNIS(icatDangerStateRNIS);
                report.setCatDangerStateOther(icatDangerStateOther);
                report.setCatDangerMunicAll(icatDangerMunicAll);
                report.setCatDangerMunicEquip(icatDangerMunicEquip);
                report.setCatDangerMunicRNIS(icatDangerMunicRNIS);
                report.setCatDangerMunicOther(icatDangerMunicOther);
                report.setCatDangerCommercAll(icatDangerCommercAll);
                report.setCatDangerCommercEquip(icatDangerCommercEquip);
                report.setCatDangerCommercRNIS(icatDangerCommercRNIS);
                report.setCatDangerCommercOther(icatDangerCommercOther);

                report.setCatSchoolStateAll(icatSchoolStateAll);
                report.setCatSchoolStateEquip(icatSchoolStateEquip);
                report.setCatSchoolStateRNIS(icatSchoolStateRNIS);
                report.setCatSchoolStateOther(icatSchoolStateOther);
                report.setCatSchoolMunicAll(icatSchoolMunicAll);
                report.setCatSchoolMunicEquip(icatSchoolMunicEquip);
                report.setCatSchoolMunicRNIS(icatSchoolMunicRNIS);
                report.setCatSchoolMunicOther(icatSchoolMunicOther);
                report.setCatSchoolCommercAll(icatSchoolCommercAll);
                report.setCatSchoolCommercEquip(icatSchoolCommercEquip);
                report.setCatSchoolCommercRNIS(icatSchoolCommercRNIS);
                report.setCatSchoolCommercOther(icatSchoolCommercOther);

                report.setCatGKHStateAll(icatGKHStateAll);
                report.setCatGKHStateEquip(icatGKHStateEquip);
                report.setCatGKHStateRNIS(icatGKHStateRNIS);
                report.setCatGKHStateOther(icatGKHStateOther);
                report.setCatGKHMunicAll(icatGKHMunicAll);
                report.setCatGKHMunicEquip(icatGKHMunicEquip);
                report.setCatGKHMunicRNIS(icatGKHMunicRNIS);
                report.setCatGKHMunicOther(icatGKHMunicOther);
                report.setCatGKHCommercAll(icatGKHCommercAll);
                report.setCatGKHCommercEquip(icatGKHCommercEquip);
                report.setCatGKHCommercRNIS(icatGKHCommercRNIS);
                report.setCatGKHCommercOther(icatGKHCommercOther);

                report.setCatDepartStateAll(icatDepartStateAll);
                report.setCatDepartStateEquip(icatDepartStateEquip);
                report.setCatDepartStateRNIS(icatDepartStateRNIS);
                report.setCatDepartStateOther(icatDepartStateOther);
                report.setCatDepartMunicAll(icatDepartMunicAll);
                report.setCatDepartMunicEquip(icatDepartMunicEquip);
                report.setCatDepartMunicRNIS(icatDepartMunicRNIS);
                report.setCatDepartMunicOther(icatDepartMunicOther);
                report.setCatDepartCommercAll(icatDepartCommercAll);
                report.setCatDepartCommercEquip(icatDepartCommercEquip);
                report.setCatDepartCommercRNIS(icatDepartCommercRNIS);
                report.setCatDepartCommercOther(icatDepartCommercOther);

                this.entityManager.merge(report);
                this.entityManager.flush();
            }
        }
    }

    @Override
    //@Cacheable(value = "glonass")
    public void removeReport(int id) {
        DraftReport report = this.entityManager.find(DraftReport.class, id);
        if (report != null) {
            this.entityManager.remove(report);
            this.entityManager.flush();
        }
    }

    @Override
    public List<DraftReport> reportsByLogin(String login) {
        List<DraftReport> resultList = null;
        Users userDraftReport = null;

        userDraftReport = this.entityManager.find(Users.class, login);
        if (userDraftReport != null) {
            Query query = this.entityManager.createQuery("SELECT d FROM DraftReport d WHERE d.userDraftreport = :userDraftReport");
            query.setParameter("userDraftReport", userDraftReport);
            resultList = query.getResultList();
        }
        if (resultList != null) {
            return resultList;
        } else {
            return null;
        }
    }

    @Override
    public DraftReport find(Integer id) {
        DraftReport result = null;
        result = this.entityManager.find(DraftReport.class, id);
        return result;
    }

}

package com.vpomo.reportglonass.service;

import com.vpomo.reportglonass.model.Report;
import com.vpomo.reportglonass.model.Users;
import com.vpomo.reportglonass.repository.ReportRepository;
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
public class ReportServiceImpl implements ReportService {
    private ReportRepository reportRepository;

    @Autowired
    public ReportServiceImpl(ReportRepository reportRepository) throws DataAccessException {
        this.reportRepository = reportRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Report> getAll() throws DataAccessException {
        return this.reportRepository.getAll();
    }

    @Override
    @Transactional
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
    ) throws DataAccessException {
        return this.reportRepository.addReport(
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
    }

    @Override
    @Transactional
    public void removeReport(int id) throws DataAccessException {
        this.reportRepository.removeReport(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Report find(Integer id) throws DataAccessException {
        return this.reportRepository.find(id);
    }

    @Override
    @Transactional
    public List<Report> reportsByLogin(String login) throws DataAccessException {
        return this.reportRepository.reportsByLogin(login);
    }

}

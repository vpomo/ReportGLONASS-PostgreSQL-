package com.vpomo.reportglonass.web;

import com.vpomo.reportglonass.model.DraftReport;
import com.vpomo.reportglonass.model.Report;
import com.vpomo.reportglonass.model.Users;
import com.vpomo.reportglonass.service.DraftReportService;
import com.vpomo.reportglonass.service.LogUsersService;
import com.vpomo.reportglonass.service.ReportService;
import com.vpomo.reportglonass.service.UsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Here are the methods for constructing a system of collecting reporting GLONASS
 *
 * @author Pomogalov Vladimir
 */

@Controller
public class MakeReports {


    /**
     * Simply selects the home view to render by returning its name.
     *
     * @param id
     * @param model
     */
    private static final Logger logger = LoggerFactory.getLogger(MakeReports.class);

    private UsersService usersService;
    private ReportService reportService;
    private DraftReportService draftReportService;
    private LogUsersService logUsersService;

    @Autowired
    public MakeReports(UsersService usersService, ReportService reportService,
                      DraftReportService draftReportService, LogUsersService logUsersService) {
        this.usersService = usersService;
        this.reportService = reportService;
        this.draftReportService = draftReportService;
        this.logUsersService = logUsersService;
    }


    @RequestMapping(value = "/report_phorm", method = RequestMethod.GET)
    public void reportPhorm(@RequestParam("idrep") String id, Map<String, Object> model) {
        Report selectedReport;
        selectedReport = this.reportService.find(Integer.parseInt(id));
        model.put("report", selectedReport);
    }


    @RequestMapping(value = "/create_report", method = RequestMethod.GET)
    public String viewCreateReport() {
        return "/create_report";
    }


    @RequestMapping(value = "/create_report", method = RequestMethod.POST)
    public String addReport(HttpServletRequest request, Principal principal, Model model) {
        Users userReport;
        String login = null;
        List<DraftReport> draftReportsUser = null;
        Users usersDraftReport = null;
        login = (String) request.getSession().getServletContext().getAttribute("login");

        logger.info("Report LOGIN=" + login);
        String dateReportForm = null;
        Date iDateReport = null;

        Integer icatM1StateAll = 0, icatM1StateEquip = 0, icatM1StateRNIS = 0, icatM1StateOther = 0;
        String catM1StateAll = "0", catM1StateEquip = "0", catM1StateRNIS = "0", catM1StateOther = "0";
        Integer icatM1MunicAll = 0, icatM1MunicEquip = 0, icatM1MunicRNIS = 0, icatM1MunicOther = 0;
        String catM1MunicAll = "0", catM1MunicEquip = "0", catM1MunicRNIS = "0", catM1MunicOther = "0";
        Integer icatM1CommercAll = 0, icatM1CommercEquip = 0, icatM1CommercRNIS = 0, icatM1CommercOther = 0;
        String catM1CommercAll = "0", catM1CommercEquip = "0", catM1CommercRNIS = "0", catM1CommercOther = "0";

        Integer icatM2M3StateAll = 0, icatM2M3StateEquip = 0, icatM2M3StateRNIS = 0, icatM2M3StateOther = 0;
        String catM2M3StateAll = "0", catM2M3StateEquip = "0", catM2M3StateRNIS = "0", catM2M3StateOther = "0";
        Integer icatM2M3MunicAll = 0, icatM2M3MunicEquip = 0, icatM2M3MunicRNIS = 0, icatM2M3MunicOther = 0;
        String catM2M3MunicAll = "0", catM2M3MunicEquip = "0", catM2M3MunicRNIS = "0", catM2M3MunicOther = "0";
        Integer icatM2M3CommercAll = 0, icatM2M3CommercEquip = 0, icatM2M3CommercRNIS = 0, icatM2M3CommercOther = 0;
        String catM2M3CommercAll = "0", catM2M3CommercEquip = "0", catM2M3CommercRNIS = "0", catM2M3CommercOther = "0";

        Integer icatLargeStateAll = 0, icatLargeStateEquip = 0, icatLargeStateRNIS = 0, icatLargeStateOther = 0;
        String catLargeStateAll = "0", catLargeStateEquip = "0", catLargeStateRNIS = "0", catLargeStateOther = "0";
        Integer icatLargeMunicAll = 0, icatLargeMunicEquip = 0, icatLargeMunicRNIS = 0, icatLargeMunicOther = 0;
        String catLargeMunicAll = "0", catLargeMunicEquip = "0", catLargeMunicRNIS = "0", catLargeMunicOther = "0";
        Integer icatLargeCommercAll = 0, icatLargeCommercEquip = 0, icatLargeCommercRNIS = 0, icatLargeCommercOther = 0;
        String catLargeCommercAll = "0", catLargeCommercEquip = "0", catLargeCommercRNIS = "0", catLargeCommercOther = "0";

        Integer icatDangerStateAll = 0, icatDangerStateEquip = 0, icatDangerStateRNIS = 0, icatDangerStateOther = 0;
        String catDangerStateAll = "0", catDangerStateEquip = "0", catDangerStateRNIS = "0", catDangerStateOther = "0";
        Integer icatDangerMunicAll = 0, icatDangerMunicEquip = 0, icatDangerMunicRNIS = 0, icatDangerMunicOther = 0;
        String catDangerMunicAll = "0", catDangerMunicEquip = "0", catDangerMunicRNIS = "0", catDangerMunicOther = "0";
        Integer icatDangerCommercAll = 0, icatDangerCommercEquip = 0, icatDangerCommercRNIS = 0, icatDangerCommercOther = 0;
        String catDangerCommercAll = "0", catDangerCommercEquip = "0", catDangerCommercRNIS = "0", catDangerCommercOther = "0";

        Integer icatSchoolStateAll = 0, icatSchoolStateEquip = 0, icatSchoolStateRNIS = 0, icatSchoolStateOther = 0;
        String catSchoolStateAll = "0", catSchoolStateEquip = "0", catSchoolStateRNIS = "0", catSchoolStateOther = "0";
        Integer icatSchoolMunicAll = 0, icatSchoolMunicEquip = 0, icatSchoolMunicRNIS = 0, icatSchoolMunicOther = 0;
        String catSchoolMunicAll = "0", catSchoolMunicEquip = "0", catSchoolMunicRNIS = "0", catSchoolMunicOther = "0";
        Integer icatSchoolCommercAll = 0, icatSchoolCommercEquip = 0, icatSchoolCommercRNIS = 0, icatSchoolCommercOther = 0;
        String catSchoolCommercAll = "0", catSchoolCommercEquip = "0", catSchoolCommercRNIS = "0", catSchoolCommercOther = "0";

        Integer icatGKHStateAll = 0, icatGKHStateEquip = 0, icatGKHStateRNIS = 0, icatGKHStateOther = 0;
        String catGKHStateAll = "0", catGKHStateEquip = "0", catGKHStateRNIS = "0", catGKHStateOther = "0";
        Integer icatGKHMunicAll = 0, icatGKHMunicEquip = 0, icatGKHMunicRNIS = 0, icatGKHMunicOther = 0;
        String catGKHMunicAll = "0", catGKHMunicEquip = "0", catGKHMunicRNIS = "0", catGKHMunicOther = "0";
        Integer icatGKHCommercAll = 0, icatGKHCommercEquip = 0, icatGKHCommercRNIS = 0, icatGKHCommercOther = 0;
        String catGKHCommercAll = "0", catGKHCommercEquip = "0", catGKHCommercRNIS = "0", catGKHCommercOther = "0";

        Integer icatDepartStateAll = 0, icatDepartStateEquip = 0, icatDepartStateRNIS = 0, icatDepartStateOther = 0;
        String catDepartStateAll = "0", catDepartStateEquip = "0", catDepartStateRNIS = "0", catDepartStateOther = "0";
        Integer icatDepartMunicAll = 0, icatDepartMunicEquip = 0, icatDepartMunicRNIS = 0, icatDepartMunicOther = 0;
        String catDepartMunicAll = "0", catDepartMunicEquip = "0", catDepartMunicRNIS = "0", catDepartMunicOther = "0";
        Integer icatDepartCommercAll = 0, icatDepartCommercEquip = 0, icatDepartCommercRNIS = 0, icatDepartCommercOther = 0;
        String catDepartCommercAll = "0", catDepartCommercEquip = "0", catDepartCommercRNIS = "0", catDepartCommercOther = "0";

        if (principal != null) {
            String nameUser = principal.getName();
        }

        Integer pressButton = 0;
        Integer codeLogOperation = 3;
        Integer codeReportOperation = 3;


        Enumeration<String> parameters = request.getParameterNames();
        while (parameters.hasMoreElements()) {
            String parameter = parameters.nextElement();
            switch (parameter) {
// begin Получаем все по M1
                case "catM1StateAll":
                    catM1StateAll = request.getParameter(parameter);
                    break;
                case "catM1StateEquip":
                    catM1StateEquip = request.getParameter(parameter);
                    break;
                case "catM1StateRNIS":
                    catM1StateRNIS = request.getParameter(parameter);
                    break;
                case "catM1StateOther":
                    catM1StateOther = request.getParameter(parameter);
                    break;

                case "catM1MunicAll":
                    catM1MunicAll = request.getParameter(parameter);
                    break;
                case "catM1MunicEquip":
                    catM1MunicEquip = request.getParameter(parameter);
                    break;
                case "catM1MunicRNIS":
                    catM1MunicRNIS = request.getParameter(parameter);
                    break;
                case "catM1MunicOther":
                    catM1MunicOther = request.getParameter(parameter);
                    break;

                case "catM1CommercAll":
                    catM1CommercAll = request.getParameter(parameter);
                    break;
                case "catM1CommercEquip":
                    catM1CommercEquip = request.getParameter(parameter);
                    break;
                case "catM1CommercRNIS":
                    catM1CommercRNIS = request.getParameter(parameter);
                    break;
                case "catM1CommercOther":
                    catM1CommercOther = request.getParameter(parameter);
                    break;
// end Получаем все по M1
// begin Получаем все по M2M3
                case "catM2M3StateAll":
                    catM2M3StateAll = request.getParameter(parameter);
                    break;
                case "catM2M3StateEquip":
                    catM2M3StateEquip = request.getParameter(parameter);
                    break;
                case "catM2M3StateRNIS":
                    catM2M3StateRNIS = request.getParameter(parameter);
                    break;
                case "catM2M3StateOther":
                    catM2M3StateOther = request.getParameter(parameter);
                    break;

                case "catM2M3MunicAll":
                    catM2M3MunicAll = request.getParameter(parameter);
                    break;
                case "catM2M3MunicEquip":
                    catM2M3MunicEquip = request.getParameter(parameter);
                    break;
                case "catM2M3MunicRNIS":
                    catM2M3MunicRNIS = request.getParameter(parameter);
                    break;
                case "catM2M3MunicOther":
                    catM2M3MunicOther = request.getParameter(parameter);
                    break;

                case "catM2M3CommercAll":
                    catM2M3CommercAll = request.getParameter(parameter);
                    break;
                case "catM2M3CommercEquip":
                    catM2M3CommercEquip = request.getParameter(parameter);
                    break;
                case "catM2M3CommercRNIS":
                    catM2M3CommercRNIS = request.getParameter(parameter);
                    break;
                case "catM2M3CommercOther":
                    catM2M3CommercOther = request.getParameter(parameter);
                    break;
// end Получаем все по M2M3
// begin Получаем все по Large
                case "catLargeStateAll":
                    catLargeStateAll = request.getParameter(parameter);
                    break;
                case "catLargeStateEquip":
                    catLargeStateEquip = request.getParameter(parameter);
                    break;
                case "catLargeStateRNIS":
                    catLargeStateRNIS = request.getParameter(parameter);
                    break;
                case "catLargeStateOther":
                    catLargeStateOther = request.getParameter(parameter);
                    break;

                case "catLargeMunicAll":
                    catLargeMunicAll = request.getParameter(parameter);
                    break;
                case "catLargeMunicEquip":
                    catLargeMunicEquip = request.getParameter(parameter);
                    break;
                case "catLargeMunicRNIS":
                    catLargeMunicRNIS = request.getParameter(parameter);
                    break;
                case "catLargeMunicOther":
                    catLargeMunicOther = request.getParameter(parameter);
                    break;

                case "catLargeCommercAll":
                    catLargeCommercAll = request.getParameter(parameter);
                    break;
                case "catLargeCommercEquip":
                    catLargeCommercEquip = request.getParameter(parameter);
                    break;
                case "catLargeCommercRNIS":
                    catLargeCommercRNIS = request.getParameter(parameter);
                    break;
                case "catLargeCommercOther":
                    catLargeCommercOther = request.getParameter(parameter);
                    break;
// end Получаем все по Large
// begin Получаем все по Danger
                case "catDangerStateAll":
                    catDangerStateAll = request.getParameter(parameter);
                    break;
                case "catDangerStateEquip":
                    catDangerStateEquip = request.getParameter(parameter);
                    break;
                case "catDangerStateRNIS":
                    catDangerStateRNIS = request.getParameter(parameter);
                    break;
                case "catDangerStateOther":
                    catDangerStateOther = request.getParameter(parameter);
                    break;

                case "catDangerMunicAll":
                    catDangerMunicAll = request.getParameter(parameter);
                    break;
                case "catDangerMunicEquip":
                    catDangerMunicEquip = request.getParameter(parameter);
                    break;
                case "catDangerMunicRNIS":
                    catDangerMunicRNIS = request.getParameter(parameter);
                    break;
                case "catDangerMunicOther":
                    catDangerMunicOther = request.getParameter(parameter);
                    break;

                case "catDangerCommercAll":
                    catDangerCommercAll = request.getParameter(parameter);
                    break;
                case "catDangerCommercEquip":
                    catDangerCommercEquip = request.getParameter(parameter);
                    break;
                case "catDangerCommercRNIS":
                    catDangerCommercRNIS = request.getParameter(parameter);
                    break;
                case "catDangerCommercOther":
                    catDangerCommercOther = request.getParameter(parameter);
                    break;
// end Получаем все по Danger
// begin Получаем все по School
                case "catSchoolStateAll":
                    catSchoolStateAll = request.getParameter(parameter);
                    break;
                case "catSchoolStateEquip":
                    catSchoolStateEquip = request.getParameter(parameter);
                    break;
                case "catSchoolStateRNIS":
                    catSchoolStateRNIS = request.getParameter(parameter);
                    break;
                case "catSchoolStateOther":
                    catSchoolStateOther = request.getParameter(parameter);
                    break;

                case "catSchoolMunicAll":
                    catSchoolMunicAll = request.getParameter(parameter);
                    break;
                case "catSchoolMunicEquip":
                    catSchoolMunicEquip = request.getParameter(parameter);
                    break;
                case "catSchoolMunicRNIS":
                    catSchoolMunicRNIS = request.getParameter(parameter);
                    break;
                case "catSchoolMunicOther":
                    catSchoolMunicOther = request.getParameter(parameter);
                    break;

                case "catSchoolCommercAll":
                    catSchoolCommercAll = request.getParameter(parameter);
                    break;
                case "catSchoolCommercEquip":
                    catSchoolCommercEquip = request.getParameter(parameter);
                    break;
                case "catSchoolCommercRNIS":
                    catSchoolCommercRNIS = request.getParameter(parameter);
                    break;
                case "catSchoolCommercOther":
                    catSchoolCommercOther = request.getParameter(parameter);
                    break;
// end Получаем все по School
// begin Получаем все по GKH
                case "catGKHStateAll":
                    catGKHStateAll = request.getParameter(parameter);
                    break;
                case "catGKHStateEquip":
                    catGKHStateEquip = request.getParameter(parameter);
                    break;
                case "catGKHStateRNIS":
                    catGKHStateRNIS = request.getParameter(parameter);
                    break;
                case "catGKHStateOther":
                    catGKHStateOther = request.getParameter(parameter);
                    break;

                case "catGKHMunicAll":
                    catGKHMunicAll = request.getParameter(parameter);
                    break;
                case "catGKHMunicEquip":
                    catGKHMunicEquip = request.getParameter(parameter);
                    break;
                case "catGKHMunicRNIS":
                    catGKHMunicRNIS = request.getParameter(parameter);
                    break;
                case "catGKHMunicOther":
                    catGKHMunicOther = request.getParameter(parameter);
                    break;

                case "catGKHCommercAll":
                    catGKHCommercAll = request.getParameter(parameter);
                    break;
                case "catGKHCommercEquip":
                    catGKHCommercEquip = request.getParameter(parameter);
                    break;
                case "catGKHCommercRNIS":
                    catGKHCommercRNIS = request.getParameter(parameter);
                    break;
                case "catGKHCommercOther":
                    catGKHCommercOther = request.getParameter(parameter);
                    break;
// end Получаем все по GKH
// begin Получаем все по Depart
                case "catDepartStateAll":
                    catDepartStateAll = request.getParameter(parameter);
                    break;
                case "catDepartStateEquip":
                    catDepartStateEquip = request.getParameter(parameter);
                    break;
                case "catDepartStateRNIS":
                    catDepartStateRNIS = request.getParameter(parameter);
                    break;
                case "catDepartStateOther":
                    catDepartStateOther = request.getParameter(parameter);
                    break;

                case "catDepartMunicAll":
                    catDepartMunicAll = request.getParameter(parameter);
                    break;
                case "catDepartMunicEquip":
                    catDepartMunicEquip = request.getParameter(parameter);
                    break;
                case "catDepartMunicRNIS":
                    catDepartMunicRNIS = request.getParameter(parameter);
                    break;
                case "catDepartMunicOther":
                    catDepartMunicOther = request.getParameter(parameter);
                    break;

                case "catDepartCommercAll":
                    catDepartCommercAll = request.getParameter(parameter);
                    break;
                case "catDepartCommercEquip":
                    catDepartCommercEquip = request.getParameter(parameter);
                    break;
                case "catDepartCommercRNIS":
                    catDepartCommercRNIS = request.getParameter(parameter);
                    break;
                case "catDepartCommercOther":
                    catDepartCommercOther = request.getParameter(parameter);
                    break;
// end Получаем все по Depart
                case "saveDraft":
                    pressButton = 1;
                    break;
                case "publicReport":
                    pressButton = 2;
                    break;
                case "saveDraft2":
                    pressButton = 4;
                    break;
                case "dateReport":
                    dateReportForm = request.getParameter(parameter);
                    break;
            }
        }
        //Преобразуем данные
//begin M1
        icatM1StateAll = parseStringToInteger(catM1StateAll);
        icatM1StateEquip = parseStringToInteger(catM1StateEquip);
        icatM1StateRNIS = parseStringToInteger(catM1StateRNIS);
        icatM1StateOther = parseStringToInteger(catM1StateOther);

        icatM1MunicAll = parseStringToInteger(catM1MunicAll);
        icatM1MunicEquip = parseStringToInteger(catM1MunicEquip);
        icatM1MunicRNIS = parseStringToInteger(catM1MunicRNIS);
        icatM1MunicOther = parseStringToInteger(catM1MunicOther);

        icatM1CommercAll = parseStringToInteger(catM1CommercAll);
        icatM1CommercEquip = parseStringToInteger(catM1CommercEquip);
        icatM1CommercRNIS = parseStringToInteger(catM1CommercRNIS);
        icatM1CommercOther = parseStringToInteger(catM1CommercOther);
//end M1
//begin M2M3
        icatM2M3StateAll = parseStringToInteger(catM2M3StateAll);
        icatM2M3StateEquip = parseStringToInteger(catM2M3StateEquip);
        icatM2M3StateRNIS = parseStringToInteger(catM2M3StateRNIS);
        icatM2M3StateOther = parseStringToInteger(catM2M3StateOther);

        icatM2M3MunicAll = parseStringToInteger(catM2M3MunicAll);
        icatM2M3MunicEquip = parseStringToInteger(catM2M3MunicEquip);
        icatM2M3MunicRNIS = parseStringToInteger(catM2M3MunicRNIS);
        icatM2M3MunicOther = parseStringToInteger(catM2M3MunicOther);

        icatM2M3CommercAll = parseStringToInteger(catM2M3CommercAll);
        icatM2M3CommercEquip = parseStringToInteger(catM2M3CommercEquip);
        icatM2M3CommercRNIS = parseStringToInteger(catM2M3CommercRNIS);
        icatM2M3CommercOther = parseStringToInteger(catM2M3CommercOther);
//end M2M3
//begin Large
        icatLargeStateAll = parseStringToInteger(catLargeStateAll);
        icatLargeStateEquip = parseStringToInteger(catLargeStateEquip);
        icatLargeStateRNIS = parseStringToInteger(catLargeStateRNIS);
        icatLargeStateOther = parseStringToInteger(catLargeStateOther);

        icatLargeMunicAll = parseStringToInteger(catLargeMunicAll);
        icatLargeMunicEquip = parseStringToInteger(catLargeMunicEquip);
        icatLargeMunicRNIS = parseStringToInteger(catLargeMunicRNIS);
        icatLargeMunicOther = parseStringToInteger(catLargeMunicOther);

        icatLargeCommercAll = parseStringToInteger(catLargeCommercAll);
        icatLargeCommercEquip = parseStringToInteger(catLargeCommercEquip);
        icatLargeCommercRNIS = parseStringToInteger(catLargeCommercRNIS);
        icatLargeCommercOther = parseStringToInteger(catLargeCommercOther);
//end Large
//begin Danger
        icatDangerStateAll = parseStringToInteger(catDangerStateAll);
        icatDangerStateEquip = parseStringToInteger(catDangerStateEquip);
        icatDangerStateRNIS = parseStringToInteger(catDangerStateRNIS);
        icatDangerStateOther = parseStringToInteger(catDangerStateOther);

        icatDangerMunicAll = parseStringToInteger(catDangerMunicAll);
        icatDangerMunicEquip = parseStringToInteger(catDangerMunicEquip);
        icatDangerMunicRNIS = parseStringToInteger(catDangerMunicRNIS);
        icatDangerMunicOther = parseStringToInteger(catDangerMunicOther);

        icatDangerCommercAll = parseStringToInteger(catDangerCommercAll);
        icatDangerCommercEquip = parseStringToInteger(catDangerCommercEquip);
        icatDangerCommercRNIS = parseStringToInteger(catDangerCommercRNIS);
        icatDangerCommercOther = parseStringToInteger(catDangerCommercOther);
//end Danger
//begin School
        icatSchoolStateAll = parseStringToInteger(catSchoolStateAll);
        icatSchoolStateEquip = parseStringToInteger(catSchoolStateEquip);
        icatSchoolStateRNIS = parseStringToInteger(catSchoolStateRNIS);
        icatSchoolStateOther = parseStringToInteger(catSchoolStateOther);

        icatSchoolMunicAll = parseStringToInteger(catSchoolMunicAll);
        icatSchoolMunicEquip = parseStringToInteger(catSchoolMunicEquip);
        icatSchoolMunicRNIS = parseStringToInteger(catSchoolMunicRNIS);
        icatSchoolMunicOther = parseStringToInteger(catSchoolMunicOther);

        icatSchoolCommercAll = parseStringToInteger(catSchoolCommercAll);
        icatSchoolCommercEquip = parseStringToInteger(catSchoolCommercEquip);
        icatSchoolCommercRNIS = parseStringToInteger(catSchoolCommercRNIS);
        icatSchoolCommercOther = parseStringToInteger(catSchoolCommercOther);
//end School
//begin GKH
        icatGKHStateAll = parseStringToInteger(catGKHStateAll);
        icatGKHStateEquip = parseStringToInteger(catGKHStateEquip);
        icatGKHStateRNIS = parseStringToInteger(catGKHStateRNIS);
        icatGKHStateOther = parseStringToInteger(catGKHStateOther);

        icatGKHMunicAll = parseStringToInteger(catGKHMunicAll);
        icatGKHMunicEquip = parseStringToInteger(catGKHMunicEquip);
        icatGKHMunicRNIS = parseStringToInteger(catGKHMunicRNIS);
        icatGKHMunicOther = parseStringToInteger(catGKHMunicOther);

        icatGKHCommercAll = parseStringToInteger(catGKHCommercAll);
        icatGKHCommercEquip = parseStringToInteger(catGKHCommercEquip);
        icatGKHCommercRNIS = parseStringToInteger(catGKHCommercRNIS);
        icatGKHCommercOther = parseStringToInteger(catGKHCommercOther);
//end GKH
//begin Depart
        icatDepartStateAll = parseStringToInteger(catDepartStateAll);
        icatDepartStateEquip = parseStringToInteger(catDepartStateEquip);
        icatDepartStateRNIS = parseStringToInteger(catDepartStateRNIS);
        icatDepartStateOther = parseStringToInteger(catDepartStateOther);

        icatDepartMunicAll = parseStringToInteger(catDepartMunicAll);
        icatDepartMunicEquip = parseStringToInteger(catDepartMunicEquip);
        icatDepartMunicRNIS = parseStringToInteger(catDepartMunicRNIS);
        icatDepartMunicOther = parseStringToInteger(catDepartMunicOther);

        icatDepartCommercAll = parseStringToInteger(catDepartCommercAll);
        icatDepartCommercEquip = parseStringToInteger(catDepartCommercEquip);
        icatDepartCommercRNIS = parseStringToInteger(catDepartCommercRNIS);
        icatDepartCommercOther = parseStringToInteger(catDepartCommercOther);
//end Depart
        iDateReport = convertStringToDate(dateReportForm);

        userReport = this.usersService.getUserLogin(login);
        Date currentDate = new Date();

        switch (pressButton) {
            case 0:
                break;
            case 1:  //saveDraft
                codeReportOperation = this.draftReportService.addReport(
                        userReport, iDateReport,
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
                switch (codeReportOperation) {
                    case 0:
                        request.setAttribute("notif", "Ошибка в базе данных!");
                        break;
                    case 1:
                        request.setAttribute("notif", "Черновик успешно сохранен");
                        break;
                }
                codeLogOperation = this.logUsersService.addLogUser(userReport, currentDate, "Создан черновик");
                return ("/end_create_draftreport");

            //break;
            case 2:  //publicReport
                if (iDateReport != null) {
                    codeReportOperation = this.reportService.addReport(
                            userReport, iDateReport,
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
                switch (codeReportOperation) {
                    case 0:
                        request.setAttribute("notif", "Ошибка в базе данных!");
                        break;
                    case 1:
                        request.setAttribute("notif", "Отчет успешно записан");
                        break;
                }

                codeLogOperation = this.logUsersService.addLogUser(userReport, currentDate, "Создан отчет");
                this.usersService.newDateUser(userReport, iDateReport);

                return "/end_create_report";
            //break;
            case 3:  //exitNosave
                return "/index";
            //break;
            case 4:  //saveDraft2
                this.draftReportService.updateReport(
                        login, iDateReport,
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

                request.setAttribute("notif", "Черновик еще раз успешно сохранен");
                codeLogOperation = this.logUsersService.addLogUser(userReport, currentDate, "Черновик повторно сохранен");
                this.usersService.newDateUser(userReport, currentDate);
                return ("/end_create_draftreport");
            //break;
        }
        return "/create_report";
    }


    @RequestMapping(value = "/create_draft_report", method = RequestMethod.GET)
    public String viewCreateDraftReport() {
        return "/create_draft_report";
    }

    @RequestMapping(value = "/end_create_report", method = RequestMethod.GET)
    public String endCreateReport() {
        return "/end_create_report";
    }

    @RequestMapping(value = "/end_create_draftreport", method = RequestMethod.GET)
    public String endCreateDraftReport() {
        return "/end_create_draftreport";
    }

    @RequestMapping(value = "/error_user_login_first_report", method = RequestMethod.GET)
    public String errorUserLoginFirstReport() {
        return "/error_user_login_first_report";
    }

    @RequestMapping(value = "/error_user_login_report", method = RequestMethod.GET)
    public String errorUserLoginReport() {
        return "/error_user_login_report";
    }

    public Date convertStringToDate(String dateString) {
        Date formattedDate = null;
        DateFormat patternDate = new SimpleDateFormat("dd.MM.yyyy");
        try {
            formattedDate = patternDate.parse(dateString);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return formattedDate;
    }


    public Integer parseStringToInteger(String s) {
        Integer result = 0;
        if (s != null) {
            try {
                result = Integer.parseInt(s);
            } catch (NumberFormatException ex) {
                // System.err.println("Неверный формат строки!");
            }
        }
        return result;
    }
}

package com.vpomo.reportglonass.web;

import com.vpomo.reportglonass.model.DraftReport;
import com.vpomo.reportglonass.model.Report;
import com.vpomo.reportglonass.model.Users;
import com.vpomo.reportglonass.service.DraftReportService;
import com.vpomo.reportglonass.service.ReportService;
import com.vpomo.reportglonass.service.UsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.Enumeration;
import java.util.List;

/**
 * Here are the methods for constructing a system of collecting reporting GLONASS
 *
 * @author Pomogalov Vladimir
 */

@Controller
public class CommonPhorm {

    /**
     * Simply selects the home view to render by returning its name.
     *
     * @param request
     * @param model
     * @return
     */
    private static final Logger logger = LoggerFactory.getLogger(CommonPhorm.class);
    private String login = null;

    private UsersService usersService;
    private ReportService reportService;
    private DraftReportService draftReportService;

    @Autowired
    public CommonPhorm(UsersService usersService, ReportService reportService, DraftReportService draftReportService) {
        this.usersService = usersService;
        this.reportService = reportService;
        this.draftReportService = draftReportService;
    }


    @RequestMapping(value = "/common_phorm", method = RequestMethod.GET)
    public String firstEnter(HttpServletRequest request, Principal principal, Model model) {

        List<Report> reportsByUser = null;
        Integer countReports = 0;
        List<DraftReport> draftReportsByUser = null;
        Integer countDraftReports = 0;

        Users userReport = null;
        String nameUser = "";

        if (principal != null) {
            nameUser = principal.getName();
            model.addAttribute("notif", "Вы авторизованы в системе как пользователь: " + nameUser + " !");
        } else {
            model.addAttribute("notif", "Пожалуйста, зарегистрируйтесь в системе!");
        }

        Enumeration<String> params = request.getParameterNames();
        while (params.hasMoreElements()) {
            String parameter = params.nextElement();
            login = "login".equals(parameter) ? request.getParameter(parameter) : login;
        }
        model.addAttribute("login", login);
        request.getSession().getServletContext().setAttribute("login", login);

        userReport = this.usersService.getUserLogin(login);
        request.getSession().getServletContext().setAttribute("nameUserReports", userReport.getNameUser());

        if (userReport != null) {
            reportsByUser = this.reportService.reportsByLogin(login);
            countReports = reportsByUser.size();
            draftReportsByUser = this.draftReportService.reportsByLogin(login);
            countDraftReports = draftReportsByUser.size();
        }
        if (countReports > 0) {
            model.addAttribute("reportToForm", reportsByUser);
            model.addAttribute("countReports", countReports);
            model.addAttribute("login", login);
            return "/common_phorm";
        }
        logger.info("countDraftReports=" + countDraftReports);

        if (countReports == 0) {
            if (nameUser.equals(login)) {
                model.addAttribute("countDraftReports", countDraftReports);
                model.addAttribute("draftReportsToForm", draftReportsByUser);
                model.addAttribute("login", login);
                if (countDraftReports == 1) {
                    return "/create_draft_report";
                } else {
                    return "/create_report";
                }
            } else {
                return ("/error_user_login_first_report");
            }
        }
        return "/common_phorm";
    }


    @RequestMapping(value = "/common_phorm", method = RequestMethod.POST)
    public String makeReportsOrDraft(HttpServletRequest request, Principal principal, Model model) {
        List<DraftReport> draftReportsByUser = null;
        Integer countDraftReports = 0;

        Users userReport = null;
        String nameUser = null;
        if (principal != null) {
            nameUser = principal.getName();
        }
        logger.info("common_phorm POST !!!");
        if (nameUser == null ? login == null : nameUser.equals(login)) {

            userReport = this.usersService.getUserLogin(login);
            if (userReport != null) {
                draftReportsByUser = this.draftReportService.reportsByLogin(login);
                countDraftReports = draftReportsByUser.size();
                model.addAttribute("countDraftReports", countDraftReports);
                model.addAttribute("draftReportsToForm", draftReportsByUser);
                model.addAttribute("login", login);
            } else {
                return ("/error_user_login_report");
            }

            if (countDraftReports == 1) {
                return ("/create_draft_report");
            } else {
                return ("/create_report");
            }

        } else {
            return ("/login_user");
        }

    }
}



package com.vpomo.reportglonass.web;

import java.util.Enumeration;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;

import com.vpomo.reportglonass.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Here are the methods for constructing a system of collecting reporting GLONASS
 *
 * @author Pomogalov Vladimir
 */

@Controller
public class AdminUsers {
    private UsersService usersService;

    @Autowired
    public AdminUsers(UsersService usersService) {
        this.usersService = usersService;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String addUserDB(HttpServletRequest request, Model model) {
        String login = null, pass = null, pass2 = null, nams = null, grUser = null;
        Enumeration<String> parameters = request.getParameterNames();
        while (parameters.hasMoreElements()) {
            String parameter = parameters.nextElement();
            switch (parameter) {
                case "loginUser":
                    login = request.getParameter(parameter);
                    break;
                case "password":
                    pass = request.getParameter(parameter);
                    break;
                case "password2":
                    pass2 = request.getParameter(parameter);
                    break;
                case "nameUser":
                    nams = request.getParameter(parameter);
                    break;
                case "groupUser":
                    grUser = request.getParameter(parameter);
                    break;
            }
        }

        Integer codeOperation = this.usersService.addUser(login, pass, pass2, nams, grUser);
        switch (codeOperation) {
            case 0:
                model.addAttribute("notif", "Пользователь " + login + " успешно создан!");
                break;
            case 1:
                model.addAttribute("notif", "Ошибка в базе данных!");
                break;
            case 2:
                model.addAttribute("notif", "Введенные пароли не совпадают");
                break;
            case 3:
                model.addAttribute("notif", "Повторите ввод еще раз! Пользователь " + login + " уже существует!");
                break;
        }
        return "/registration";
    }
}



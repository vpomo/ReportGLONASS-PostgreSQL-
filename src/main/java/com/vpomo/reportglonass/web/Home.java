package com.vpomo.reportglonass.web;

import com.vpomo.reportglonass.model.Users;
import com.vpomo.reportglonass.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;
import java.util.List;

/**
 * Here are the methods for constructing a system of collecting reporting GLONASS
 *
 * @author Pomogalov Vladimir
 */

@Controller
public class Home {
    public List<Users> usersIOGV = null;
    public List<Users> usersMunicipal = null;

    private UsersService usersService;

    @Autowired
    public Home(UsersService usersService) {
        this.usersService = usersService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Principal principal, Model model) {
        if (principal != null) {
            String nameUser = principal.getName();
            model.addAttribute("notif", "Вы авторизованы в системе как пользователь: " + nameUser + " !");
        } else {
            model.addAttribute("notif", "Пожалуйста, зарегистрируйтесь в системе!");
        }
        usersIOGV = this.usersService.getUsersGroup("iogv");
        usersMunicipal = this.usersService.getUsersGroup("municipal");
        model.addAttribute("usersIOGV", usersIOGV);
        model.addAttribute("usersMunicipal", usersMunicipal);

        return "index";
    }

}

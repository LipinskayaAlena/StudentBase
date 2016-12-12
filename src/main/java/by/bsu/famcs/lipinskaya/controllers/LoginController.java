package by.bsu.famcs.lipinskaya.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @RequestMapping(value = "/Authentification", method = RequestMethod.GET)
    public ModelAndView getLogin(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("../../WEB-INF/pages/personal-cabinet");
        if (request.getParameter("error") != null) {
            modelAndView.addObject("error", "Wrong credentials");
        }
        return modelAndView;
    }
}

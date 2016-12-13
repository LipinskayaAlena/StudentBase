package by.bsu.famcs.lipinskaya.controllers;

import by.bsu.famcs.lipinskaya.services.CustomUserDetailsServiceImpl;
import by.bsu.famcs.lipinskaya.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

//    <session-management>
//            <concurrency-control max-sessions="100" session-registry-alias="sessionRegistry"/>
//        </session-management>

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getLogin(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("../../index");
        if (request.getParameter("error") != null) {
            modelAndView.addObject("error", "Wrong credentials");
        }
        return modelAndView;
    }
}

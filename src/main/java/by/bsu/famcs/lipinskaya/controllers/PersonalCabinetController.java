package by.bsu.famcs.lipinskaya.controllers;

import by.bsu.famcs.lipinskaya.model.Student;
import by.bsu.famcs.lipinskaya.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Asus on 12.12.2016.
 */
@Controller
public class PersonalCabinetController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/personal-cabinet", method = RequestMethod.GET)
    public ModelAndView getCabinet(HttpServletRequest request) {
        Student student = (Student)request.getSession().getAttribute("student");
        ModelAndView modelAndView = new ModelAndView("../../WEB-INF/pages/personal-cabinet");


        modelAndView.addObject("student", student);

        return modelAndView;
    }
}

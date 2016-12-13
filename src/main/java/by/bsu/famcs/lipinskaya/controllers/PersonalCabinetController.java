package by.bsu.famcs.lipinskaya.controllers;

import by.bsu.famcs.lipinskaya.model.Student;
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

    @RequestMapping(value = "/personal-cabinet", method = RequestMethod.GET)
    public ModelAndView getMonth(HttpServletRequest request) {
        Student student = (Student)request.getSession().getAttribute("student");
        //List<Note> notes = noteService.getNotesByUsername(user.getUsername());
        //List<String> dateNotes = new ArrayList<String>();
        //List<Note> noteToday = new ArrayList<Note>();


        ModelAndView modelAndView = new ModelAndView("../../WEB-INF/pages/personal-cabinet");
//        switch (currentMonth) {
//            case 11:
//                modelAndView = new ModelAndView("months/november");
//                break;
//            case 12:
//                modelAndView = new ModelAndView("months/december");
//                break;
//            case 1:
//                modelAndView = new ModelAndView("months/january");
//                break;
//            case 2:
//                modelAndView = new ModelAndView("months/february");
//                break;
//        }

        //modelAndView.addObject("current_day", currentDate);
        // modelAndView.addObject("last_month", listDaysLastMonth);
        // modelAndView.addObject("days", listDays);
        //modelAndView.addObject("name_month_year", nameCurrentMonth + " " + currentYear);
        //modelAndView.addObject("date_notes", dateNotes);
        //modelAndView.addObject("note_today", noteToday);

        return modelAndView;
    }
}

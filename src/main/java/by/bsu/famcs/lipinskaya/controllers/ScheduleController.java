package by.bsu.famcs.lipinskaya.controllers;

import by.bsu.famcs.lipinskaya.model.Schedule;
import by.bsu.famcs.lipinskaya.model.Student;
import by.bsu.famcs.lipinskaya.model.Teacher;
import by.bsu.famcs.lipinskaya.services.ScheduleService;
import by.bsu.famcs.lipinskaya.services.TeacherSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 18.12.2016.
 */
@Controller
public class ScheduleController {
    @Autowired
    ScheduleService scheduleService;

    @Autowired
    TeacherSubjectService teacherSubjectService;

    @RequestMapping(value = "/schedule", method = RequestMethod.GET)
    public ModelAndView getMonth(HttpServletRequest request) {
        Student student = (Student)request.getSession().getAttribute("student");
        List<Schedule> schedule1 = scheduleService.readForDay(student);
        List<Schedule> monday = getForDay(schedule1,new Long(1));
        List<Schedule> tuesday = getForDay(schedule1,new Long(2));
        List<Schedule> wednesday = getForDay(schedule1,new Long(3));
        List<Schedule> thursday = getForDay(schedule1,new Long(4));
        List<Schedule> friday = getForDay(schedule1,new Long(5));
        List<Schedule> saturday = getForDay(schedule1,new Long(6));
        List<Teacher>  teachers = teacherSubjectService.readTeachers(student.getFaculty().getId_faculty());

        ModelAndView modelAndView = new ModelAndView("../../WEB-INF/pages/schedule");

        modelAndView.addObject("monday", monday);
        modelAndView.addObject("tuesday", tuesday);
        modelAndView.addObject("wednesday", wednesday);
        modelAndView.addObject("thursday", thursday);
        modelAndView.addObject("friday", friday);
        modelAndView.addObject("saturday", saturday);
        modelAndView.addObject("teachers", teachers);

        return modelAndView;
    }


    public List<Schedule> getForDay(List<Schedule> schedule, Long day) {
        List<Schedule> forDay = new ArrayList<Schedule>();
        for(Schedule pair: schedule) {
            if(pair.getFk_day_of_week().getId_day_of_week().equals(new Long(day)))
                forDay.add(pair);
        }
        return forDay;
    }

}

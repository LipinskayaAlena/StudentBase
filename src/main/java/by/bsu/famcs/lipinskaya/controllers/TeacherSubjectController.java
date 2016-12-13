package by.bsu.famcs.lipinskaya.controllers;

import by.bsu.famcs.lipinskaya.model.Student;
import by.bsu.famcs.lipinskaya.model.Subject;
import by.bsu.famcs.lipinskaya.model.Teacher;
import by.bsu.famcs.lipinskaya.services.TeacherSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Asus on 13.12.2016.
 */
@Controller
public class TeacherSubjectController {

    @Autowired
    TeacherSubjectService teacherSubjectService;

    @RequestMapping(value = "/teacher-subject", method = RequestMethod.GET)
    public ModelAndView getTeacherSubject(HttpServletRequest request) {
        Student student = (Student)request.getSession().getAttribute("student");
        //List<Note> notes = noteService.getNotesByUsername(user.getUsername());
        //List<String> dateNotes = new ArrayList<String>();
        //List<Note> noteToday = new ArrayList<Note>();
        //String nameFaculty = studentService.getFaculty(student.getFaculty().getId_faculty());
        List<Teacher> teachers = teacherSubjectService.readTeachers(student.getFaculty().getId_faculty());
        ModelAndView modelAndView = new ModelAndView("../../WEB-INF/pages/teacher-subject");


        modelAndView.addObject("teachers", teachers);

        return modelAndView;
    }

    @RequestMapping(value = "/subjects", method = RequestMethod.GET)
    public ModelAndView getSubject(HttpServletRequest request) {
        Student student = (Student)request.getSession().getAttribute("student");
        //List<Note> notes = noteService.getNotesByUsername(user.getUsername());
        //List<String> dateNotes = new ArrayList<String>();
        //List<Note> noteToday = new ArrayList<Note>();
        //String nameFaculty = studentService.getFaculty(student.getFaculty().getId_faculty());
        List<Subject> subjects = teacherSubjectService.readSubjects(student.getCourse().getId_course());

        ModelAndView modelAndView = new ModelAndView("../../WEB-INF/pages/subjects");


        modelAndView.addObject("subjects", subjects);

        return modelAndView;
    }
}

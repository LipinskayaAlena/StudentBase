package by.bsu.famcs.lipinskaya.services;

import by.bsu.famcs.lipinskaya.dao.TeacherSubjectDAO;
import by.bsu.famcs.lipinskaya.model.Subject;
import by.bsu.famcs.lipinskaya.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Asus on 13.12.2016.
 */
@Service("teacherSubjectService")
@Transactional
public class TeacherSubjectServiceImpl implements TeacherSubjectService {
    @Autowired
    TeacherSubjectDAO teacherSubjectDAO;

    public List<Teacher> readTeachers(Long faculty) {
        return teacherSubjectDAO.getAllTeachers(faculty);
    }

    public List<Subject> readSubjects(Long course) {
        return teacherSubjectDAO.getAllSubjects(course);
    }
}

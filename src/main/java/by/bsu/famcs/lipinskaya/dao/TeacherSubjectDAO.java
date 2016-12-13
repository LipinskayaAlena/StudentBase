package by.bsu.famcs.lipinskaya.dao;

import by.bsu.famcs.lipinskaya.model.Subject;
import by.bsu.famcs.lipinskaya.model.Teacher;

import java.util.List;

/**
 * Created by Asus on 13.12.2016.
 */
public interface TeacherSubjectDAO {
    List<Teacher> getAllTeachers(Long faculty);
    List<Subject> getAllSubjects(Long fk_course);
}

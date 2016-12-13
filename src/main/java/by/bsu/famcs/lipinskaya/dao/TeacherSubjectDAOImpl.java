package by.bsu.famcs.lipinskaya.dao;

import by.bsu.famcs.lipinskaya.model.Student;
import by.bsu.famcs.lipinskaya.model.Subject;
import by.bsu.famcs.lipinskaya.model.Teacher;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Asus on 13.12.2016.
 */
@Repository
public class TeacherSubjectDAOImpl implements TeacherSubjectDAO {
    private static String GET_ALL_TEACHERS = "FROM Teacher WHERE fk_faculty=:fk_faculty";
    private static String GET_ALL_SUBJECTS = "FROM Subject WHERE fk_course=:fk_course";

    @Autowired
    private SessionFactory sessionFactory;

    public List<Teacher> getAllTeachers(Long faculty) {
        Query query = sessionFactory.getCurrentSession().createQuery(GET_ALL_TEACHERS);
        query.setParameter("fk_faculty", faculty);
        List teachers = query.list();
        return teachers;
    }

    public List<Subject> getAllSubjects(Long fk_course) {
        Query query = sessionFactory.getCurrentSession().createQuery(GET_ALL_SUBJECTS);
        query.setParameter("fk_course", fk_course);
        List subjects = query.list();
        return subjects;
    }


}

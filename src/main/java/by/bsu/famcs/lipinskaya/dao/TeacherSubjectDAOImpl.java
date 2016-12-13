package by.bsu.famcs.lipinskaya.dao;

import by.bsu.famcs.lipinskaya.model.Student;
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
    private static String GET_ALL_TEACHERS = "FROM Teacher";
    @Autowired
    private SessionFactory sessionFactory;

    public List<Teacher> getAllTeachers() {
        Query query = sessionFactory.getCurrentSession().createQuery(GET_ALL_TEACHERS);
        List teachers = query.list();
        return teachers;
    }
}

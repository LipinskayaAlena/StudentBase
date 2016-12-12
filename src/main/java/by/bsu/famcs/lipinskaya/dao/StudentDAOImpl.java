package by.bsu.famcs.lipinskaya.dao;

import by.bsu.famcs.lipinskaya.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Asus on 12.12.2016.
 */
public class StudentDAOImpl implements StudentDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public Student getStudentByName(String name) {
        return (Student) getCurrentSession().get(Student.class, name);
    }

    public Student getStudentByEmail(String email) {
        return (Student) getCurrentSession().get(Student.class, email);
    }

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
}

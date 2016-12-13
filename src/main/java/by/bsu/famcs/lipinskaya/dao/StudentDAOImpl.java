package by.bsu.famcs.lipinskaya.dao;

import by.bsu.famcs.lipinskaya.model.Student;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Asus on 12.12.2016.
 */
@Repository
public class StudentDAOImpl implements StudentDAO {
    private static String GET_STUDENT_BY_EMAIL = "FROM Student WHERE email=:email";
    private static String FIND_STUDENT_BY_EMAIL_PASSWORD = "from Student where email=:email AND password = :password";

    @Autowired
    private SessionFactory sessionFactory;

    public Student getStudentByName(String name) {
        return (Student) getCurrentSession().get(Student.class, name);
    }

    public Student getStudentByEmail(String email) {
        Query query = sessionFactory.getCurrentSession().createQuery(GET_STUDENT_BY_EMAIL);
        query.setParameter("email", email);
        List student = query.list();
        return (Student) student.get(0);

    }

    public Student getStudentById(String id) {
        return (Student) getCurrentSession().get(Student.class, id);
    }

    public Student find(String email, String password) {
        Query query = sessionFactory.getCurrentSession().createQuery(FIND_STUDENT_BY_EMAIL_PASSWORD)
                .setParameter("email", email)
                .setParameter("password", password);
        List<Student> users = query.list();

        return (Student) users.get(0);
    }


    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
}

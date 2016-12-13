package by.bsu.famcs.lipinskaya.dao;

import by.bsu.famcs.lipinskaya.model.Faculty;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Asus on 13.12.2016.
 */
@Repository
public class FacultyDAOImpl implements FacultyDAO {
    private static String GET_FACULTY = "FROM Faculty WHERE id_faculty=:id_faculty";

    @Autowired
    private SessionFactory sessionFactory;

    public String getFaculty(long id) {
        Query query = sessionFactory.getCurrentSession().createQuery(GET_FACULTY);
        query.setParameter("id_faculty", id);
        List faculty = query.list();
        return ((Faculty) faculty.get(0)).getName();
    }
}

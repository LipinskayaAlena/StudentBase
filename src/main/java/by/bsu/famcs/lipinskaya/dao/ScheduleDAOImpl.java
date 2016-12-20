package by.bsu.famcs.lipinskaya.dao;

import by.bsu.famcs.lipinskaya.model.Schedule;
import by.bsu.famcs.lipinskaya.model.Student;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Asus on 18.12.2016.
 */
@Repository
public class ScheduleDAOImpl implements ScheduleDAO {
    private static String GET_SCHEDULE_FOR_DAY = "FROM Schedule WHERE fk_course=:fk_course";

    @Autowired
    private SessionFactory sessionFactory;


    public List<Schedule> getSchedule(Student student) {
        Query query = sessionFactory.getCurrentSession().createQuery(GET_SCHEDULE_FOR_DAY);
        query.setParameter("fk_course", student.getCourse().getId_course());
        List scheduleDay = query.list();
        if(scheduleDay == null)
            return null;
        return scheduleDay;
    }
}

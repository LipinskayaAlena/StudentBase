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
    private static String GET_SCHEDULE_FOR_DAY = "FROM Schedule WHERE fk_day_of_week=:fk_day_of_week AND fk_course=:fk_course AND fk_group=:fk_group";

    @Autowired
    private SessionFactory sessionFactory;


    public List<Schedule> getScheduleForDay(Student student, int id_day) {
        Query query = sessionFactory.getCurrentSession().createQuery(GET_SCHEDULE_FOR_DAY);
        query.setParameter("fk_day_of_week", id_day);
        query.setParameter("fk_course", student.getCourse().getId_course());
        query.setParameter("fk_group", student.getGroup().getId_group());
        List scheduleDay = query.list();
        return scheduleDay;
    }
}

package by.bsu.famcs.lipinskaya.dao;

import by.bsu.famcs.lipinskaya.model.Schedule;
import by.bsu.famcs.lipinskaya.model.Student;

/**
 * Created by Asus on 18.12.2016.
 */
public interface ScheduleDAO {
    Schedule getScheduleForDay(Student student, int id_day);

}

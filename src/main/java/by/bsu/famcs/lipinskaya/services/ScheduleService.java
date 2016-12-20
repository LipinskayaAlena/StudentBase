package by.bsu.famcs.lipinskaya.services;

import by.bsu.famcs.lipinskaya.model.Schedule;
import by.bsu.famcs.lipinskaya.model.Student;

import java.util.List;

/**
 * Created by Asus on 18.12.2016.
 */
public interface ScheduleService {
    List<Schedule> readSchedule(Student student);
}

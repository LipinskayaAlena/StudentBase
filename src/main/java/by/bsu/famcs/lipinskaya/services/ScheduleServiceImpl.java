package by.bsu.famcs.lipinskaya.services;

import by.bsu.famcs.lipinskaya.dao.ScheduleDAO;
import by.bsu.famcs.lipinskaya.model.Schedule;
import by.bsu.famcs.lipinskaya.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Asus on 18.12.2016.
 */
@Service("scheduleService")
@Transactional
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    ScheduleDAO scheduleDAO;

    public List<Schedule> readForDay(Student student) {
        return scheduleDAO.getScheduleForDay(student);
    }
}

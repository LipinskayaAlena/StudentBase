package by.bsu.famcs.lipinskaya.services;

import by.bsu.famcs.lipinskaya.dao.StudentDAO;
import by.bsu.famcs.lipinskaya.model.Student;
import by.bsu.famcs.lipinskaya.utils.handlers.CustomPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Asus on 12.12.2016.
 */
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDAO studentDAO;

    @Autowired
    private CustomPasswordEncoder customPasswordEncoder;


    public Student readByEmail(String email) {
        return studentDAO.getStudentByEmail(email);
    }
}

package by.bsu.famcs.lipinskaya.services;

import by.bsu.famcs.lipinskaya.dao.StudentDAO;
import by.bsu.famcs.lipinskaya.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Asus on 12.12.2016.
 */
@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDAO studentDAO;


    public Student readByEmail(String email) {
        return studentDAO.getStudentByEmail(email);
    }


}

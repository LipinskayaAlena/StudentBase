package by.bsu.famcs.lipinskaya.services;

import by.bsu.famcs.lipinskaya.dao.FacultyDAO;
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

    @Autowired
    private FacultyDAO facultyDAO;

    public Student readByEmail(String email) {
        return studentDAO.getStudentByEmail(email);
    }

    public Student readById(String id) {
        return studentDAO.getStudentById(id);
    }

    public Student find(String email, String password) {
        return studentDAO.find(email, password);
    }

    public String getFaculty(long id) {
        return facultyDAO.getFaculty(id);
    }

}

package by.bsu.famcs.lipinskaya.dao;

import by.bsu.famcs.lipinskaya.model.Student;

/**
 * Created by Asus on 12.12.2016.
 */
public interface StudentDAO {
    Student getStudentByName(String name);
    Student getStudentByEmail(String email);
}

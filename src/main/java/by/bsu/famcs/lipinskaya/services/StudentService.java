package by.bsu.famcs.lipinskaya.services;

import by.bsu.famcs.lipinskaya.model.Student;

/**
 * Created by Asus on 12.12.2016.
 */
public interface StudentService {
    Student readByEmail(String email);
}

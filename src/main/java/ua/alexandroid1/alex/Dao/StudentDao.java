package ua.alexandroid1.alex.Dao;

import ua.alexandroid1.alex.Entity.Student;

import java.util.Collection;

/**
 * Created by Oleksandr on 10.01.2017.
 */
public interface StudentDao {
    // get all
    Collection<Student> getAllStudents();

    // get one by id
    Student getStudentByID(int id);

    // remove one by id
    void removeStudentById(int id);

    // put one student
    void updateStudent(Student student);

    // insert one new
    void insertStudentToDB(Student student);
}

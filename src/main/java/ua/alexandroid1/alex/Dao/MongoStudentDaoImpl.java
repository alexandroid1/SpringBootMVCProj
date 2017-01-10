package ua.alexandroid1.alex.Dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import ua.alexandroid1.alex.Entity.Student;

import java.util.Collection;

/**
 * Created by Oleksandr on 10.01.2017.
 */

@Repository
@Qualifier("MongoData")
public class MongoStudentDaoImpl implements StudentDao {
    @Override
    public Collection<Student> getAllStudents() {
        return null;
    }

    @Override
    public Student getStudentByID(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertStudentToDB(Student student) {

    }
}

package ua.alexandroid1.alex.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.alexandroid1.alex.Dao.StudentDao;
import ua.alexandroid1.alex.Entity.Student;

import java.util.Collection;

/**
 * Created by Oleksandr on 09.01.2017.
 */

//stereotype for service layer
@Service
public class StudentService {

    @Autowired
    private StudentDao studentDAO;

    // for getting all
    public Collection<Student> getAllStudents(){
        return this.studentDAO.getAllStudents();
    }

    // for choosing one by id
    public Student getStudentByID(int id){
        return this.studentDAO.getStudentByID(id);
    }

    // for deleting one by id
    public void removeStudentById(int id) {
        this.studentDAO.removeStudentById(id);
    }

    // for updating one by id
    public void updateStudent(Student student){
        this.studentDAO.updateStudent(student);
    }

    // for inserting one new
    public void insertStudent(Student student) {
        this.studentDAO.insertStudentToDB(student);
    }
}

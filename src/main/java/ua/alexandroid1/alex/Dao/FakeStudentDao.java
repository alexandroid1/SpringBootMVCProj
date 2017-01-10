package ua.alexandroid1.alex.Dao;

import org.springframework.stereotype.Repository;
import ua.alexandroid1.alex.Entity.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Oleksandr on 09.01.2017.
 */

//stereotype for persistence layer
@Repository
public class FakeStudentDao implements StudentDao {

    private static Map<Integer, Student> students;

    // initialization for Map
    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Vasya", "Computer Science"));
                put(2, new Student(2, "Ira", "Computer Science"));
                put(3, new Student(3, "Olena", "Computer Science"));
            }
        };
    }

    // get all
    @Override
    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    // get one by id
    @Override
    public Student getStudentByID(int id){
        return this.students.get(id);
    }

    // remove one by id
    @Override
    public void removeStudentById(int id) {
        this.students.remove(id);
    }

    // put one student
    @Override
    public void updateStudent(Student student){
        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(student.getId(), student);
    }

    // insert one new
    @Override
    public void insertStudentToDB(Student student) {
        students.put(student.getId(), student);
    }
}

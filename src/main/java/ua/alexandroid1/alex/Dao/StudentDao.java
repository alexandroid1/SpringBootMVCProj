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
public class StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Vasya", "Computer Science"));
                put(2, new Student(2, "Ira", "Computer Science"));
                put(3, new Student(3, "Olena", "Computer Science"));
            }
        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    public Student getStudentByID(int id){
        return this.students.get(id);
    }

}

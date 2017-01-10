package ua.alexandroid1.alex.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ua.alexandroid1.alex.Entity.Student;
import ua.alexandroid1.alex.Service.StudentService;

import java.util.Collection;

/**
 * Created by Oleksandr on 09.01.2017.
 */

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}

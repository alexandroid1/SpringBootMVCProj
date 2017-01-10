package ua.alexandroid1.alex.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ua.alexandroid1.alex.Entity.Student;
import ua.alexandroid1.alex.Service.StudentService;

import java.awt.*;
import java.util.Collection;

/**
 * Created by Oleksandr on 09.01.2017.
 */

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // for getting all
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    // for choosing one by id
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id){
        return studentService.getStudentByID(id);
    }

    // for delete one by id
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable("id") int id){
        studentService.removeStudentById(id);
    }

    // for update one by id
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }
}

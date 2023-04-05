package uz.brogrammers.MyTesingSkillUnitMock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import uz.brogrammers.MyTesingSkillUnitMock.model.Student;
import uz.brogrammers.MyTesingSkillUnitMock.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAll() {
        return studentService.findAll();
    }

    @PostMapping("/new")
    public Student createStudent(@RequestBody Student student){
       return studentService.save(student);
    }

    @GetMapping("/student/{id}")
    public @ResponseBody Student getById(@PathVariable Long id){
        return studentService.findById(id);
    }

    @PostMapping("/remove/student")
    public void delete(@RequestBody Student student ){
        studentService.delete(student);
    }

    @PostMapping("/remove/{id}")
    public void deleteById(@PathVariable Long id, @Param("data") String data){
        System.out.println(data);
        studentService.deleteById(id);
    }
}

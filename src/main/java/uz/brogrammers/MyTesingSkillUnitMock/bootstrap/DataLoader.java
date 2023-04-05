package uz.brogrammers.MyTesingSkillUnitMock.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uz.brogrammers.MyTesingSkillUnitMock.model.Student;
import uz.brogrammers.MyTesingSkillUnitMock.service.StudentService;

@Component
public class DataLoader  {

   private final StudentService studentService;

    public DataLoader(StudentService studentService) {
        this.studentService = studentService;
    }


    public void run(String... args) throws Exception {
       int size=studentService.findAll().size();
       if (size==0){
           loadData();
       }

    }
    public void loadData(){
        studentService.save(new Student(1L,"khusniddin","khusniddinkhusanboyev@gmail.com"));
        studentService.save(new Student(2L,"abror","abrorErgashev@gmail.com"));
        studentService.save(new Student(3L,"javlonbek","javlonbektursunov@gmail.com"));
        System.err.println("data is loaded...");
    }
}

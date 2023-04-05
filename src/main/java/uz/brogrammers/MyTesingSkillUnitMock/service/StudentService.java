package uz.brogrammers.MyTesingSkillUnitMock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.brogrammers.MyTesingSkillUnitMock.model.Student;
import uz.brogrammers.MyTesingSkillUnitMock.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student save(Student student){
        return studentRepository.save(student);
    }

    public Student findById(Long id){
        return studentRepository.findById(id).orElse(null);
    }

    public void delete(Student student){
        studentRepository.delete(student);
    }
    public void deleteById(Long id){
        studentRepository.deleteById(id);
    }


}


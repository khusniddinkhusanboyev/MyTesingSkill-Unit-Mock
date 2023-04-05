package uz.brogrammers.MyTesingSkillUnitMock.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import uz.brogrammers.MyTesingSkillUnitMock.model.Student;
import uz.brogrammers.MyTesingSkillUnitMock.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

;import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class StudentServiceTest {
    private static final Long ID=1L;
    private static final String NAME="khusniddin";
    private static final String EMAIL="khusniddinkhusanboyev@gmail.com";

    @Mock
    StudentRepository studentRepository;

    @InjectMocks
    StudentService studentService;
    Student student;

    @BeforeEach
    void setUp() {
        student=Student.builder().id(ID).name(NAME).email(EMAIL).build();
    }

    @Test
    void findAll() {
        List<Student> students=new ArrayList<>();
        students.add(new Student(1L,"khusniddin","khusniddinkhusanboyev@gmail.com"));
        students.add(new Student(2L,"abror","abrorErgashev@gmail.com"));
        students.add(new Student(3L,"javlonbek","javlonbektursunov@gmail.com"));
        when(studentRepository.findAll()).thenReturn(students);

    }

    @Test
    void save() {
       Student student1= studentService.save(Student.builder().id(4L).name("ali").email("ali@gmail.com").build());
       assertNotNull(student1);
        when(studentRepository.save(any())).thenReturn(student);
    }

    @Test
    void findById() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }
}
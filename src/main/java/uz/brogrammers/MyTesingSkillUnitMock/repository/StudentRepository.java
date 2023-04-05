package uz.brogrammers.MyTesingSkillUnitMock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.brogrammers.MyTesingSkillUnitMock.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}

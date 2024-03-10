package kz.singularity.med.springPractice.repository;

import kz.singularity.med.springPractice.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findStudentsByFirstName(String firstName);
    List<Student> findByAge(Integer age);
 }

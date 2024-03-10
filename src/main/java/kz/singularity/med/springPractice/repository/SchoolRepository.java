package kz.singularity.med.springPractice.repository;

import kz.singularity.med.springPractice.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {

    School findSchoolByName(String name);
    @Query("select s.sumOfStudents from School s where s.id = :id")
    int getNumberOfStudentsById(Long id);
}

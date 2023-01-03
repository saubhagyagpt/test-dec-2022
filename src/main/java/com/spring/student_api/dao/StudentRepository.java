package com.spring.student_api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.student_api.entities.Student;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student , Long> {
    Optional<Student> findById(Long id);
}

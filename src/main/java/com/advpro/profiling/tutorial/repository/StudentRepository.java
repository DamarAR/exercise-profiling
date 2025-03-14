package com.advpro.profiling.tutorial.repository;

import com.advpro.profiling.tutorial.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author muhammad.khadafi
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findTopByOrderByGpaDesc();

    @Query(value = "SELECT STRING_AGG(name, ', ') FROM students", nativeQuery = true)
    String joinStudentNamesAggregate();
}
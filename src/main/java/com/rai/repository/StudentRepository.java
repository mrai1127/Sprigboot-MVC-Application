package com.rai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rai.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

package com.lawshiga.demoapplication.repository;

import com.lawshiga.demoapplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Integer> {
}

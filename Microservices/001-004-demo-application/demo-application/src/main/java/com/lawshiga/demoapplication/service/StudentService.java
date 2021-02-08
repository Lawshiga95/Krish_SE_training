package com.lawshiga.demoapplication.service;

import com.lawshiga.demoapplication.model.Student;

public interface StudentService {
    Student save(Student student);

    Student fetchStudentById(int id);
}

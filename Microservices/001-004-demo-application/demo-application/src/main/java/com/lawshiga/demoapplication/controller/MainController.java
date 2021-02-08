package com.lawshiga.demoapplication.controller;

import com.lawshiga.demoapplication.model.Student;
import com.lawshiga.demoapplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String greeting(){
        return "Hello from get";
    }

    @RequestMapping(value="/hello", method = RequestMethod.POST)
    public String greeting1(){
        return "Hello from post";
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ResponseEntity<Student> fetchStudent(@RequestParam int id){
        Student student = studentService.fetchStudentById(id);
        if(student==null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().body(student);
        }
    }
}

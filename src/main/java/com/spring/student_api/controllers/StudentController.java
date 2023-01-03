package com.spring.student_api.controllers;


import java.util.List;
import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.spring.student_api.entities.Student;
import com.spring.student_api.service.StudentService;


@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping(value = "/api")
public class StudentController {

    @Autowired
    private  StudentService studentService;

    // request for get all students in the database
    @GetMapping(value = "/getAllStudents")
    public ResponseEntity<List<Student>> getStudent(){
        List<Student> list = this.studentService.getAllStudent();
        if(list.size() == 0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }

    //  request for get Student with the help of Id
    @GetMapping(value = "/students/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id){

        Optional<Student> s = null;
        try{
            s = studentService.getStudentById(id);
            return ResponseEntity.of(s);
        }
        catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


    // request post for adding data inside the database
    @PostMapping("/students")
    public ResponseEntity<Void> addStudent(@RequestBody Student student){
        try{
            studentService.addStudent(student);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


    // request delete for delete Student data from the database
    @DeleteMapping("/students/{id}")
    public ResponseEntity<Void> deleteStudById(@PathVariable("id") Long id){
        try{
            
            this.studentService.deleteStudById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        
    }


    // put request for modification of Student Object in the database
    @PutMapping("/students/{id}")
    public ResponseEntity<Student> updateStudById(@RequestBody Student s, @PathVariable("id") Long id){
        try{
            this.studentService.updateStudById(s, id);
            return ResponseEntity.of(Optional.of(s));
        }
        catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}

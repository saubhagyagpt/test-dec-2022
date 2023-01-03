package com.spring.student_api.service;

import com.spring.student_api.dao.StudentRepository;
import com.spring.student_api.entities.Student;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    // Fetching all the Students Details
    public  List<Student> getAllStudent(){
        List<Student> ls = (List<Student>)this.studentRepository.findAll();
        return ls;
    }



    // Fetching Student by id
    public  Optional<Student> getStudentById(Long id){
        return  studentRepository.findById(id);
    }


    // Inserting the record of Student
    public void addStudent(Student student){
         this.studentRepository.save(student);
    }
    


    // deleting the record of student
    public void deleteStudById(Long id){
        this.studentRepository.deleteById(id);
    }



    // update the records of Students
    public void updateStudById(Student student, Long id){
        student.setScholar_id(id);
        this.studentRepository.save(student);
    }
}

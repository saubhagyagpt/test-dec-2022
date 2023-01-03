package com.spring.student_api;

import com.spring.student_api.config.ContainerEnvironment;
import com.spring.student_api.dao.StudentRepository;
import com.spring.student_api.entities.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = StudentApiApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StudentControllerTest extends ContainerEnvironment {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void When_GetStudents_Expect_EmptyList(){
        List<Student> list = studentRepository.findAll();
        assertEquals(0,list.size());
    }
}


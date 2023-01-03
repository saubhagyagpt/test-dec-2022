package com.spring.student_api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student_details")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class
Student {

    @Id
    private Long scholar_id;
    private String name;

    private String city;
    private String courseID;
    
//    public Student() {
//    }
    
//    public Student(int scholar_id, String name, String city, String course) {
//        this.scholar_id = scholar_id;
//        this.name = name;
//        this.city = city;
//        this.course = course;
//    }

//    public int getScholar_id() {
//        return scholar_id;
//    }
//    public void setScholar_id(int scholar_id) {
//        this.scholar_id = scholar_id;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getCity() {
//        return city;
//    }
//    public void setCity(String city) {
//        this.city = city;
//    }
//    public String getCourse() {
//        return course;
//    }
//    public void setCourse(String course) {
//        this.course = course;
//    }

//    @Override
//    public String toString() {
//        return "Student [scholar_id=" + scholar_id + ", name=" + name + ", city=" + city + ", course=" + course + "]";
//    }


}

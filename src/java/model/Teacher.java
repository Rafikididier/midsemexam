/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author sam
 */
@Entity
public class Teacher implements Serializable{
    
   @Id
    private String code;
    private String name;
    private String qualification;

    @Enumerated(EnumType.STRING)
    private EQualification teacherQualification;

    @ManyToMany
    @JoinTable(
        name = "Teacher_Course",
        joinColumns = @JoinColumn(name = "teacherCode"),
        inverseJoinColumns = @JoinColumn(name = "courseId")
    )
    private List<CourseDefinition> courses;
    
    // Constructors
    public Teacher() {}

    public Teacher(String code, String name, String qualification, EQualification teacherQualification) {
        this.code = code;
        this.name = name;
        this.qualification = qualification;
        this.teacherQualification = teacherQualification;
    }
    
    //GETER AND SETTER

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public EQualification getTeacherQualification() {
        return teacherQualification;
    }

    public void setTeacherQualification(EQualification teacherQualification) {
        this.teacherQualification = teacherQualification;
    }

    public List<CourseDefinition> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseDefinition> courses) {
        this.courses = courses;
    }
    
}

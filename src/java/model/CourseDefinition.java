/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author sam
 */
@Entity
public class CourseDefinition implements Serializable{
    @Id
    private String code;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "academicUnitCode")
    private AcademicUnit academicUnit;

    @ManyToMany(mappedBy = "courses")
    private List<Teacher> teachers;
    
  @ManyToMany
@JoinTable(
    name = "Course_Semester",
    joinColumns = @JoinColumn(name = "courseCode"),
    inverseJoinColumns = @JoinColumn(name = "semesterId")
)
private List<Semester> semesters;


    // Constructors
    public CourseDefinition() {}

    public CourseDefinition(String code, String name, String description, AcademicUnit academicUnit) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.academicUnit = academicUnit;
    }
    
    //GETTER AND SETTER

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AcademicUnit getAcademicUnit() {
        return academicUnit;
    }

    public void setAcademicUnit(AcademicUnit academicUnit) {
        this.academicUnit = academicUnit;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Semester> getSemesters() {
        return semesters;
    }

    public void setSemesters(List<Semester> semesters) {
        this.semesters = semesters;
    }
    
    
}

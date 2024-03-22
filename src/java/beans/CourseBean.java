/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author sam
 */
public class CourseBean implements Serializable{
    
    private Long id;
    private AcademicUnitBean academicUnit;
    private CourseDefinitionBean courseDefinition;
    private List<TeacherBean> teachers;
    private String errorMessage;
    private String infoMessage;
    
    public CourseBean() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AcademicUnitBean getAcademicUnit() {
        return academicUnit;
    }

    public void setAcademicUnit(AcademicUnitBean academicUnit) {
        this.academicUnit = academicUnit;
    }

    public CourseDefinitionBean getCourseDefinition() {
        return courseDefinition;
    }

    public void setCourseDefinition(CourseDefinitionBean courseDefinition) {
        this.courseDefinition = courseDefinition;
    }

    public List<TeacherBean> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<TeacherBean> teachers) {
        this.teachers = teachers;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getInfoMessage() {
        return infoMessage;
    }

    public void setInfoMessage(String infoMessage) {
        this.infoMessage = infoMessage;
    }
    
    

    
}

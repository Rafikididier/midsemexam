/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import model.CourseDefinition;
import model.EQualification;

/**
 *
 * @author sam
 */
public class TeacherBean implements Serializable{
    
    private String code;
    private String name;
    private String qualification;
    private EQualification teacherQualification;
    private List<CourseDefinition> courses;
    private String errorMessage;
    private String infoMessage;

            
    
    public TeacherBean(){
    }

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

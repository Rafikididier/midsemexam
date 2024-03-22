/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import model.CourseDefinition;

/**
 *
 * @author sam
 */
public class SemesterBean implements Serializable{
    
     private Long id;
    private String name;
    private Date startDate;
    private Date endDate;
    private List<CourseDefinition> courses;
    private String errorMessage;
    private String infoMessage;

    
    public SemesterBean(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

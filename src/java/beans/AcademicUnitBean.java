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
import javax.persistence.OneToMany;
import model.CourseDefinition;
import model.EAcademicUnit;

/**
 *
 * @author sam
 */
public class AcademicUnitBean implements Serializable{
   
    private String code;
    private String name;
    private EAcademicUnit academicUnitType;
    private List<CourseDefinition> courseDefinitions;
    private String errorMessage;
    private String infoMessage;
    
    public AcademicUnitBean(){
    
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

    public EAcademicUnit getAcademicUnitType() {
        return academicUnitType;
    }

    public void setAcademicUnitType(EAcademicUnit academicUnitType) {
        this.academicUnitType = academicUnitType;
    }

    public List<CourseDefinition> getCourseDefinitions() {
        return courseDefinitions;
    }

    public void setCourseDefinitions(List<CourseDefinition> courseDefinitions) {
        this.courseDefinitions = courseDefinitions;
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

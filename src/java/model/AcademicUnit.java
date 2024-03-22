package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author sam
 */
@Entity
public class AcademicUnit implements Serializable{
    @Id
    private String code;
    private String name;
    @Enumerated(EnumType.STRING)
    private EAcademicUnit academicUnitType;

    @OneToMany(mappedBy = "academicUnit")
    private List<CourseDefinition> courseDefinitions;

    //no args constructor
    public AcademicUnit(){
    }
    
    //constructor
      public AcademicUnit(String code, String name, EAcademicUnit academicUnitType) {
        this.code = code;
        this.name = name;
        this.academicUnitType = academicUnitType;
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
      
    
}

package utng.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="division")
public class Division implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_division")
    private Long idDivision;
    @Column(name="name_division", length=10)
    private String name;
    @Column(name="category",length=40)
    private String category;
    
    @Column(name="standard",length=40)
    private String standard;

    public Division(Long idDivision, String name, String category, String standard) {
        this.idDivision = idDivision;
        this.name = name;
        this.category = category;
        this.standard = standard;
    }
    
    public Division() {
        this.idDivision=0L;
    }
    public Long getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(Long idDivision) {
        this.idDivision = idDivision;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

   
    
    
   
   
    
}

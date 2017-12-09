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
@Table(name="salary")
public class Salary implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_salary")
    private Long idSalary;
    @Column(name="name_salary", length=10)
    private String name;

    public Salary(Long idSalary, String name) {
        this.idSalary = idSalary;
        this.name = name;
    }

   
    public Salary() {
        this.idSalary=0L;
    }

    public Long getIdSalary() {
        return idSalary;
    }

    public void setIdSalary(Long idSalary) {
        this.idSalary = idSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    
    
   
    
}

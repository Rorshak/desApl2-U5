package utng.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_employee")
    private Long idEmployee;
    
    @ManyToOne(cascade =CascadeType.REMOVE)
    @JoinColumn(name="id_salary")    
    private Salary salary;
    
    @Column(name="name",length=30)
    private String name;
    
    @Column(name="last_name",length=30)
    private String lastName;
    
    @Column(name="ocupation",length=30)
    private String ocupation;
   
    @Column(name="experience",length=30)
    private String experience;

    public Employee(Long idEmployee, Salary salary, String name, String lastName, String ocupation, String experience) {
        this.idEmployee = idEmployee;
        this.salary = salary;
        this.name = name;
        this.lastName = lastName;
        this.ocupation = ocupation;
        this.experience = experience;
    }

    
    
    
    
    
    public Employee() {
        this.idEmployee=0L;
    }

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOcupation() {
        return ocupation;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    

   
    
    
    
}

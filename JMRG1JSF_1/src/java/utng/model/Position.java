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
@Table(name="position")
public class Position implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_position")
    private Long idPosition;
    
    @ManyToOne(cascade =CascadeType.REMOVE)
    @JoinColumn(name="id_division")    
    private Division division;
    
    @Column(name="name",length=30)
    private String name;
    
    @Column(name="area",length=30)
    private String area;
    
    @Column(name="standard",length=30)
    private String standard;
   
    @Column(name="range",length=30)
    private String range;

    public Position(Long idPosition, Division division, String name, String area, String standard, String range) {
        this.idPosition = idPosition;
        this.division = division;
        this.name = name;
        this.area = area;
        this.standard = standard;
        this.range = range;
    }

    
    
    
    
    
    public Position() {
        this.idPosition=0L;
    }

    public Long getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(Long idPosition) {
        this.idPosition = idPosition;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    
    
}

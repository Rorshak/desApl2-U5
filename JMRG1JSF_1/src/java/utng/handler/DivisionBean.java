package utng.handler;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.data.DivisionDAO;
import utng.model.Division;

@ManagedBean
@SessionScoped
public class DivisionBean implements Serializable {
    private List<Division>divisions;
    private Division division;
    public DivisionBean(){}

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public List<Division> getDivisions() {
        return divisions;
    }

    public void setDivisiones(List<Division> divisions) {
        this.divisions = divisions;
    }
    
    public String toList(){
        DivisionDAO dao = new DivisionDAO();
        try {
            divisions=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Division";
    }
    
    public String remove(){
         DivisionDAO dao = new DivisionDAO();
        try {
            dao.delete(division);
            divisions=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Remove";//no me queda claro si este es es lo que devuelve 
    }
    
    public String start(){
        division= new Division();
        return "Start";
    }
    
    public String save(){
        DivisionDAO dao = new DivisionDAO();
        try {
            if(division.getIdDivision()!= 0){
                dao.update(division);
            }else {
                dao.insert(division);
            }
            divisions=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Save";
    }
    
    public String cancelar(){
    return "Cancelar";
    }
    
    public String edit(Division division){
        this.division=division;
        return "Edit";
    }
        
}

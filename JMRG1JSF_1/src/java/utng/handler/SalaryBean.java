package utng.handler;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.data.SalaryDAO;
import utng.model.Salary;

@ManagedBean
@SessionScoped
public class SalaryBean implements Serializable {
    private List<Salary>salaries;
    private Salary salary;
    public SalaryBean(){}

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public List<Salary> getSalaries() {
        return salaries;
    }

    public void setSalaries(List<Salary> salaries) {
        this.salaries = salaries;
    }
    
    public String toList(){
        SalaryDAO dao = new SalaryDAO();
        try {
            salaries=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Salary";
    }
    
    public String remove(){
         SalaryDAO dao = new SalaryDAO();
        try {
            dao.delete(salary);
            salaries=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Remove";//no me queda claro si este es es lo que devuelve 
    }
    
    public String start(){
        salary= new Salary();
        return "Start";
    }
    
    public String save(){
        SalaryDAO dao = new SalaryDAO();
        try {
            if(salary.getIdSalary()!= 0){
                dao.update(salary);
            }else {
                dao.insert(salary);
            }
            salaries=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Save";
    }
    
    public String cancel(){
    return "Cancel";
    }
    
    public String edit(Salary salary){
        this.salary=salary;
        return "Edit";
    }
        
}

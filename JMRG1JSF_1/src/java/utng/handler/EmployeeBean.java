package utng.handler;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.data.EmployeeDAO;
import utng.data.SalaryDAO;
import utng.model.Employee;
import utng.model.Salary;

@ManagedBean
@SessionScoped
public class EmployeeBean implements Serializable {
    private List<Employee>employees;
    private Employee employee;
    private List<Salary> salaries;
    public EmployeeBean(){
        employee = new Employee();
        employee.setSalary(new Salary());
    }

    public List<Salary> getSalaries(){
        return salaries;
    }
    
    public void setSalaries(List<Salary> salaries){
        this.salaries = salaries;
    }
    
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
    public String toList(){
        EmployeeDAO dao = new EmployeeDAO();
        try {
            employees=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Employee";
    }
    
    public String remove(){
         EmployeeDAO dao = new EmployeeDAO();
        try {
            dao.delete(employee);
            employees=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Remove";//no me queda claro si este es es lo que devuelve 
    }
    
    public String start(){
        employee= new Employee();
        employee.setSalary(new Salary());
        try{
            salaries = new SalaryDAO().getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Start";
    }
    
    public String save(){
        EmployeeDAO dao = new EmployeeDAO();
        try {
            if(employee.getIdEmployee()!= 0){
                dao.update(employee);
            }else {
                dao.insert(employee);
            }
            employees=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Save";
    }
    
    public String cancel(){
    return "Cancel";
    }
    
    public String edit(Employee employe){
        this.employee=employee;
        try{
            salaries = new SalaryDAO().getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Edit";
    }
        
}

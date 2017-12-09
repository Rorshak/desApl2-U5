package utng.data;

import org.hibernate.HibernateException;
import utng.model.Employee;


public class EmployeeDAO extends DAO<Employee> {
     public EmployeeDAO() {
        super(new Employee());
    }

    
    public Employee getOneById(Employee employee) throws HibernateException {
        return super.getOneById(employee.getIdEmployee()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

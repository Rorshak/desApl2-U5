/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.data;

import org.hibernate.HibernateException;
import utng.model.Salary;

/**
 *
 * @author sarai
 */

public class SalaryDAO extends DAO<Salary> {
     public SalaryDAO() {
        super(new Salary());
    }

    
    public Salary getOneById(Salary salary) throws HibernateException {
        return super.getOneById(salary.getIdSalary()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.data;

import org.hibernate.HibernateException;
import utng.model.Division;

/**
 *
 * @author sarai
 */

public class DivisionDAO extends DAO<Division> {
     public DivisionDAO() {
        super(new Division());
    }

    
    public Division getOneById(Division division) throws HibernateException {
        return super.getOneById(division.getIdDivision()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

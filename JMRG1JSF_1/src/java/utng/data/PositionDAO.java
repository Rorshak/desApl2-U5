package utng.data;

import org.hibernate.HibernateException;
import utng.model.Position;


public class PositionDAO extends DAO<Position> {
     public PositionDAO() {
        super(new Position());
    }

    
    public Position getOneById(Position position) throws HibernateException {
        return super.getOneById(position.getIdPosition()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

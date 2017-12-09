package utng.handler;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.data.PositionDAO;
import utng.data.DivisionDAO;
import utng.model.Position;
import utng.model.Division;

@ManagedBean
@SessionScoped
public class PositionBean implements Serializable {
    private List<Position>positions;
    private Position position;
    private List<Division> divisions;
    public PositionBean(){
        position = new Position();
        position.setDivision(new Division());
    }

    public List<Division> getDivisions(){
        return divisions;
    }
    
    public void setDivisons(List<Division> divisions){
        this.divisions = divisions;
    }
    
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }
    
    public String toList(){
        PositionDAO dao = new PositionDAO();
        try {
            positions=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Position";
    }
    
    public String remove(){
         PositionDAO dao = new PositionDAO();
        try {
            dao.delete(position);
            positions=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Remove";//no me queda claro si este es es lo que devuelve 
    }
    
    public String start(){
        position= new Position();
        position.setDivision(new Division());
        try{
            divisions = new DivisionDAO().getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Start";
    }
    
    public String save(){
        PositionDAO dao = new PositionDAO();
        try {
            if(position.getIdPosition()!= 0){
                dao.update(position);
            }else {
                dao.insert(position);
            }
            positions=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Save";
    }
    
    public String cancel(){
    return "Cancel";
    }
    
    public String edit(Position position){
        this.position=position;
        try{
            divisions = new DivisionDAO().getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Edit";
    }
        
}

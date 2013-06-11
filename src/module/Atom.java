/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package module;
import java.util.ArrayList;
import RabloExceptions.*;
/**
 *
 * @author Chong
 */
public class Atom {
    
    private Point base;
    private AtomType type;
    private ArrayList<Spoke> spokes; 
    
    public Atom(){
        this.type = AtomType.INSIDE;
        this.spokes = new ArrayList<Spoke>();
        this.base = null;
    }
    
    public Atom(double x, double y, Spoke... spokes) {
        this.base = new Point(x, y);
        for (Spoke s : spokes) {
            this.spokes.add(s);
        }
    }
    
    public double getX() {
        return base.getX();
    }
    
    public double getY() {
        return base.getY();
    }
    
    public AtomType getType() {
        return this.type;
    }
    
    public Spoke getUpperSpoke() {
        return spokes.get(0);
    }
    
    public Spoke getLowerSpoke() {
        return spokes.get(1);
    }
    
    public Spoke getMiddleSpoke() throws AtomException {
        try {
            return spokes.get(2);
        }
        catch (IndexOutOfBoundsException ioobe){
            throw new AtomException("the atom only has two spokes!");
        } 
    }
}

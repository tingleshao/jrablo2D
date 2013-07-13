/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package module;
import java.util.ArrayList;
import RabloExceptions.*;
import java.util.Arrays;
/**
 *
 * @author Chong
 */
public class Atom {
    
    private AtomPoint base;
    private AtomType type;
    private ArrayList<Spoke> spokes; 
    private AtomPoint atomPointDir;
    
    public Atom(){
        this.type = AtomType.INSIDE;
        this.spokes = new ArrayList<>();
        this.base = null;
    }
    
    public Atom(double x, double y, Spoke... spokes) {
        this.base = new AtomPoint(x, y);
        this.spokes = new ArrayList<>();
        this.spokes.addAll(Arrays.asList(spokes));
    }
    
    public Atom(double x, double y, ArrayList<Spoke> spokes) {
        this.base = new AtomPoint(x, y);
        this.spokes = new ArrayList<>();
        this.spokes = spokes;
    }
    
    public Atom(double x, double y) {
        this.spokes = new ArrayList<>();
        this.base = new AtomPoint(x, y);
    }    
    
    public double getX() {
        return base.getX();
    }
    
    public double getY() {
        return base.getY();
    }
    
    public int getXInt() {
        return base.getXInt();
    }
    
    public int getYInt() {
        return base.getYInt();
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
    
    public double getRadius() {
        return this.getUpperSpoke().getLength();
    }
    
    public Spoke getMiddleSpoke() throws AtomException {
        try {
            return spokes.get(2);
        }
        catch (IndexOutOfBoundsException ioobe){
            throw new AtomException("the atom only has two spokes!");
        } 
    }
    
    public void setUpperSpoke(Spoke s) {
        if (s == null) {
            System.out.print("spoke null");
            return;
        }
        System.out.print(s.getClass());
        this.spokes.add(0, s);
    }
    
    public void setLowerSpoke(Spoke s) {
        this.spokes.add(1, s);
    }
    
    public void setMiddleSpoke(Spoke s)  throws AtomException{
        if (this.type == AtomType.END) {
            this.spokes.add(2,s);
        }
        else {
            throw new AtomException("the atom should only have two spokes!");
        }
    }
    
    public void setSpokes(ArrayList<Spoke> spokes) {
        this.spokes = spokes;
    }
    
    public void setAtomLocusDir(AtomPoint p) {
    }
}

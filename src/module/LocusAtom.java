/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package module;

import java.awt.Color;

/**
 *
 * @author Chong
 */
public class LocusAtom {
    private Spoke interpolatedSpoke;
    private AtomPoint position;
    private Color color;
    
    public LocusAtom(int x, int y) {
        position = new AtomPoint(x, y);
        this.color = Color.BLACK;
    }
    
    public LocusAtom(int x, int y, Color c ) {
        this(x,y);
        this.color = c;
    }
    
    public double getX() {
        return this.position.getX();
    }
    
    public double getY() {
        return this.position.getY();
    } 
    
    public int getXInt() {
        return this.position.getXInt();
    }        
    
    public int getYInt() {
        return this.position.getYInt();
    }
    
    public Color getColor() {
        return this.color;
    }
    
    public Spoke getInterpolatedSpoke() {
        return this.interpolatedSpoke;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }
    
    public void setSpoke(Spoke s) {
        this.interpolatedSpoke = s;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package module;

/**
 *
 * @author Chong
 */
public class AtomPoint {
    
    private double x;
    private double y;
    
    public AtomPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public int getXInt() {
        return (int) this.x;
    }
    
    public int getYInt() {
        return (int) this.y;
    }
}
    
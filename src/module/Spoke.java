/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package module;

/**
 *
 * @author Chong
 */
public class Spoke {
    private double length = -1;
    private Point startingPoint;
    private Point endPoint;
    
    public Spoke(Point start, Point end) {
        this.startingPoint = start;
        this.endPoint = end;
    }
    
    public double getLength() {
        if (this.length == -1) {
            return 0.0;
        }
        return 0.0;
    }
            
}

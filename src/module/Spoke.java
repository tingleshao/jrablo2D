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
    private Point startPoint;
    private Point endPoint;
    
    public Spoke(Point start, Point end) {
        this.startPoint = start;
        this.endPoint = end;
    }
    
    public double getLength() {
        if (this.length == -1) {
            this.length = Math.sqrt(Math.pow((endPoint.getX() - this.startPoint.getX()),2)+ Math.pow(endPoint.getY() - this.startPoint.getY(),2));
        }
        return this.length;
    }
            
}

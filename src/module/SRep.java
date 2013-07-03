/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package module;

import java.util.ArrayList;
/**
 *
 * @author Chong
 */
public class SRep {
    private int index;
    
    private ArrayList<Atom> atoms;
    private boolean hasInterpolation;
    
    
    public SRep() {
        System.out.println("Srep initialized.");
        
    }
    public String getMessage() {
        return "srep1";
    }
    
    public ArrayList<Atom> getAtoms() {
        return this.atoms;
    }
    
    public boolean hasInterpolation() {
        return this.hasInterpolation;
    }
}

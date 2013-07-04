/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package module;

import java.awt.Color;
import java.util.ArrayList;
/**
 *
 * @author Chong
 */
public class SRep {
    private int index;
    
    private ArrayList<Atom> atoms = new ArrayList<Atom>();
    private boolean hasInterpolation;
    private Color color;
    
    public SRep() {
        System.out.println("Srep initialized.");
        this.color = Color.BLACK;
    }
    public String getMessage() {
        return "srep1";
    }
    
    public ArrayList<Atom> getAtoms() {
        return this.atoms;
    }
    
    public void setAtoms(ArrayList<Atom> atoms) {
        this.atoms = atoms;
    }
    
    public Color getColor() {
        return this.color;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }
    
    public void addAtom(Atom atom) {
        this.atoms.add(atom);
    }
    
    public boolean hasInterpolation() {
        return this.hasInterpolation;
    }
}

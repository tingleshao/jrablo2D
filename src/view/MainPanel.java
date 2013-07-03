/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Chong
 */

import javax.swing.*;        
import module.*;
import java.awt.*;
import java.util.*;

public class MainPanel extends JPanel {
    
    ArrayList<SRep> sreps;
    public MainPanel(ArrayList<SRep> sreps) {
         this.sreps = sreps;
         this.refresh((Graphics2D)this.getGraphics());
    }
    
    public void refresh(Graphics2D g) {
         if (sreps.isEmpty()) {
             return;
         }
         for (SRep s : this.sreps) {
             this.drawSRep(s, g);
         }
    }
    
    public void drawSRep(SRep s, Graphics2D g) {
         ArrayList<Atom> atoms = s.getAtoms();
         if (atoms.isEmpty()) {
             return;
         }
         for (Atom a : atoms) {
             this.drawAtom(a, g);
         }
    }
    
    public void drawAtom(Atom a, Graphics2D g) {
        g.fillOval((int)a.getX(), (int)a.getY(), 5, 5);
    }
    
}

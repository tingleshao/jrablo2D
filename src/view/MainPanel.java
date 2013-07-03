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
    }
    
    public void refresh() {
         for (SRep s : this.sreps) {
             this.drawSRep(s);
         }
    }
    
    public void drawSRep(SRep s) {
         ArrayList<Atom> atoms = s.getAtoms();
         for (Atom a : atoms) {
             
         }
    }
    
    
}

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
       // this.setSize(800,600);
         this.sreps = sreps;  
    }
    
    public void paintComponent(Graphics g) {
         super.paintComponent(g);
         Graphics2D g2 = (Graphics2D) g;
         
         g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         this.refresh(g2);
    }
    public void refresh(Graphics2D g) {
     ///    Graphics2D g = (Graphics2D)this.getGraphics();
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
  //     super.paintComponents(g);
         System.out.println("MainPanel is visible: " + Boolean.toString(this.isDisplayable()));
        
        System.out.println((int)a.getX());
        System.out.println((int)a.getY());
        System.out.println(g.toString());
        g.setPaint(Color.YELLOW);
        g.fillOval(100, 100, 100, 100);

    }
    
}

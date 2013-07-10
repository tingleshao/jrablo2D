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
import RabloExceptions.*;

public class MainPanel extends JPanel {
    
    ArrayList<SRep> sreps;
    public MainPanel(ArrayList<SRep> sreps) {
       // this.setSize(800,600);
         this.setLayout(new FlowLayout(FlowLayout.LEFT));
         this.sreps = sreps;  
         this.add(new JButton("Dilate"));
         this.add(new JButton("Reset"));
         this.add(new JButton("Check r-k File"));
         this.add(new JButton("Interpolate All Spokes"));
         // set color
         this.setBackground(Color.LIGHT_GRAY);
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
             g.setPaint(s.getColor());
             this.drawAtom(a, g, true);
         }
         if (s.hasInterpolation()) {
         
         
         }
    }
    
    public void drawAtom(Atom a, Graphics2D g, boolean displaySpoke)  {
  //     super.paintComponents(g);
         System.out.println("MainPanel is visible: " + Boolean.toString(this.isDisplayable()));
        
         System.out.println((int)a.getX());
         System.out.println((int)a.getY());
         System.out.println(g.toString());
    //     g.setPaint(Color.YELLOW);
         int upperLeftX = (int)(a.getX() - a.getRadius());
         int upperLeftY = (int)(a.getY() - a.getRadius());
         int diameter = (int)(a.getRadius() * 2);
         g.drawOval(upperLeftX, upperLeftY, diameter, diameter); 
         if (displaySpoke) {
             drawSpoke(a, a.getUpperSpoke(),g);
             drawSpoke(a, a.getLowerSpoke(),g);
             if (a.getType() == AtomType.END) {
                 try {
                     drawSpoke(a, a.getMiddleSpoke(),g);
                 }
                 catch(AtomException ae) {
                     System.out.println("atom exception happens in drawAtom()!!");
                 }
             }
         }
         g.fillOval(a.getXInt()-3,a.getYInt()-3,6,6);
    }    
    
    public void drawSpoke(Atom a, Spoke s, Graphics2D g) {
         int atomX = a.getXInt();
         int atomY = a.getYInt();
         a.getY();
         AtomPoint start = s.getStart();
         AtomPoint end = s.getEnd();
         g.drawLine(start.getXInt()+atomX, start.getYInt()+atomY, end.getXInt()+atomX, end.getYInt()+atomY);
         g.fillOval(end.getXInt()+atomX-3, end.getYInt()+atomY-3, 6, 6);
    }
}

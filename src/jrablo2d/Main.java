/**
 * wtf?
 */
package jrablo2d;
 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;        
import module.*;
import view.*;
import java.util.ArrayList;

public class Main {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Object in Context 2D");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        ArrayList<Atom> atomsForSrep1 = new ArrayList<>();
        Atom a1 = new Atom(100,100);
        a1.setUpperSpoke(new Spoke(new AtomPoint(0,0), new AtomPoint(70,0)));
        a1.setLowerSpoke(new Spoke(new AtomPoint(0,0), new AtomPoint(-70,0)));
        Atom a2 = new Atom(190,180);
        a2.setUpperSpoke(new Spoke(new AtomPoint(0,0), new AtomPoint(60,0)));
        a2.setLowerSpoke(new Spoke(new AtomPoint(0,0), new AtomPoint(-60,0)));
        Atom a3 = new Atom(230,300);
        a3.setUpperSpoke(new Spoke(new AtomPoint(0,0), new AtomPoint(60,0)));
        a3.setLowerSpoke(new Spoke(new AtomPoint(0,0), new AtomPoint(-60,0)));
        atomsForSrep1.add(a1);
        atomsForSrep1.add(a2);
        atomsForSrep1.add(a3);
        
        SRep srep1 = new SRep();
        srep1.setColor(Color.BLUE);
        srep1.addAtoms(atomsForSrep1);
        ArrayList<SRep> as = new ArrayList<>();
        srep1.interpolateSelfLocus();
        as.add(srep1);
        
        ArrayList<Atom> atomsForSrep2 = new ArrayList<>();
        Atom a6 = new Atom(600,300);
        a6.setUpperSpoke(new Spoke(new AtomPoint(0,0), new AtomPoint(70,0)));
        a6.setLowerSpoke(new Spoke(new AtomPoint(0,0), new AtomPoint(-70,0)));
        Atom a5 = new Atom(490,380);
        a5.setUpperSpoke(new Spoke(new AtomPoint(0,0), new AtomPoint(60,0)));
        a5.setLowerSpoke(new Spoke(new AtomPoint(0,0), new AtomPoint(-60,0)));
        Atom a4 = new Atom(450,450);
        a4.setUpperSpoke(new Spoke(new AtomPoint(0,0), new AtomPoint(60,0)));
        a4.setUpperSpoke(new Spoke(new AtomPoint(0,0), new AtomPoint(-60,0)));
        atomsForSrep2.add(a4);
        atomsForSrep2.add(a5);
        atomsForSrep2.add(a6);
        
        SRep srep2 = new SRep();
        srep2.setColor(Color.yellow);
        srep2.addAtoms(atomsForSrep2);
        srep2.interpolateSelfLocus();
        as.add(srep2);
         
        
        frame.setVisible(true);
     //   frame.setSize(800, 600);
     //   JLabel label = new JLabel(srep.getMessage());
     //   frame.getContentPane().add(label);
        MainPanel mp = new MainPanel(as);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        mp.setPreferredSize(new Dimension(screenSize.width-77,screenSize.height));
        frame.add(mp);
        mp.setVisible(true);
       // mp.refresh();
        System.out.println("Frame is visible: " + Boolean.toString(frame.isDisplayable()));
        System.out.println("MainPanel is visible: " + Boolean.toString(mp.isDisplayable()));
        frame.pack();
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() { 
                createAndShowGUI();
            }
        });
    }
}
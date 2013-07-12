/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package module;

import java.awt.Color;
import java.util.ArrayList;
import org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction;
import org.apache.commons.math3.exception.OutOfRangeException;
import toolbox.JRabloSplineInterpolator;
/**
 *
 * @author Chong
 */
public class SRep {
    private int index;
    
    private PolynomialSplineFunction locusFunction = null;
    private ArrayList<LocusAtom> locus = new ArrayList<>();
    private JRabloSplineInterpolator interpolator = new JRabloSplineInterpolator();
    private ArrayList<Atom> atoms = new ArrayList<>();
    private boolean hasInterpolation;
    private Color color;
    
    public SRep() {
        System.out.println("Srep initialized.");
        this.color = Color.BLACK;
    }
    
    public SRep(int index) {
        this();
        this.index = index;
    }
    
    public void interpolateSelfLocus() {
        if (this.atoms.size() > 1) {
            // construct xs and ys array for interpolation 
            double[] xs = new double[atoms.size()];
            double[] ys = new double[atoms.size()];
            int i = 0;
            for (Atom a : this.atoms) {
                xs[i] = a.getX();
                ys[i] = a.getY();
                i++;
            }
            this.locusFunction = this.interpolator.interpolate(xs, ys);
            this.hasInterpolation = true;
            // this has a problem, check the Ruby code or using polar coordinate? 
            
            /**
             * may be design an algorithm, that works by dividing the atoms into groups that has monotornic increasing relation
            **/
            
            double stepSize = ((atoms.get(atoms.size()-1)).getX() - (atoms.get(0)).getX()) / 100.0;
            double currX = atoms.get(0).getX();
            double currY;
            for (int j = 0; j < 100; j++) {
                currX = currX + stepSize;
                currY = this.evaluate(currX);
                System.out.println(currY);
                locus.add(new LocusAtom((int)currX, (int)currY, this.color));
            }
            System.out.println("Interpolation done!");
          
        }
    }
    
    private double evaluate(double x) {
        double lastValue = 0.0;
        try {
            if (this.hasInterpolation) {
                lastValue = this.locusFunction.value(x);
                 return lastValue;

            }
        }
        catch(OutOfRangeException e) {
            return lastValue;
        }
        return 0.0;
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
    
    public ArrayList<LocusAtom> getLocus() {
        return this.locus;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }
    
    public void addAtom(Atom atom) {
        this.atoms.add(atom);
    }
    
    public void addAtoms(ArrayList<Atom> atoms) 
    {
        for (Atom a : atoms) {
            this.atoms.add(a);
        }
    }
    
    public boolean hasInterpolation() {
        return this.hasInterpolation;
    }
}

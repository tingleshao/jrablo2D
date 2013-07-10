/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package toolbox;
import org.apache.commons.math3.analysis.interpolation.SplineInterpolator;
import org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction;
/**
 *
 * @author Chong
 */
public class JRabloSplineInterpolator {
    
    private SplineInterpolator si;
    
    public JRabloSplineInterpolator() {
        this.si = new SplineInterpolator();
    }
    
    public PolynomialSplineFunction interpolate(double[] x, double[] y) {
        PolynomialSplineFunction psf = this.si.interpolate(x, y);
        return psf;
    }
    
}

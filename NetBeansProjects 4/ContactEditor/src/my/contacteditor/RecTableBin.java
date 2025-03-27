/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.contacteditor;
import java.io.Serializable;

/**
 *
 * @author Rjk15
 */
public class RecTableBin implements Serializable{   
    private static final long serialVersionUID = 1L;
    
    private double vp;
    private double np;
    private double st;
    private double result;

    public RecTableBin(double vp, double np, double st, double result) throws ErrRecIntegralVal {
        if (vp < 0.000001 || vp > 1000000 ||
            np < 0.000001 || np > 1000000 ||
            st < 0.000001 || st > 1000000) {
            
        }
        this.vp = vp;
        this.np = np;
        this.st = st;
        this.result = result;
    }
    
    public RecTableBin(double vp, double np, double st) throws ErrRecIntegralVal {
        if (vp < 0.000001 || vp > 1000000 ||
            np < 0.000001 || np > 1000000 ||
            st < 0.000001 || st > 1000000) {
            
        }
        this.vp = vp;
        this.np = np;
        this.st = st;
        this.result = result;
    }
    
      public double getVP() {
        return vp;
    }

    public double getNP() {
        return np;
    }

    public double getST() {
        return st;
    }

    public double getRES() {
        return result;
    }
}

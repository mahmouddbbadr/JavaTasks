/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circletrainglecalc;

/**
 *
 * @author M-AZMY
 */
public class calc {
    public void CicleArea(double r){
    double result = 3.14*r*r;
        System.out.println("circle area is: " +result);
    }
     public void CicleCircum(double r){
    double result = 2*3.14*r;
        System.out.println("circle circum is: " +result);
    }
      public void TraingleArea(double base, double hieght){
    double result = 0.5*base*hieght;
        System.out.println("traingle area is: " +result);
    }
 public void TraingleCireum(double rib1,double rib2,double rib3){
    double result = rib1+rib2+rib3;
        System.out.println("traingle circum is: " +result);
    }


}

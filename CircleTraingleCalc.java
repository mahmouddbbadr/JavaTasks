/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circletrainglecalc;

import java.util.Scanner;

/**
 *
 * @author M-AZMY
 */
public class CircleTraingleCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner input = new Scanner(System.in);
        calc c1 = new calc();
        System.out.println("1. to calculate circle area");
        System.out.println("2. to calculate circle circum");
        System.out.println("3. to calculate traingle area");
        System.out.println("4. to calculate traingle circum");
        int count = input.nextInt();
        
        switch(count){
            case 1:
                System.out.println("enter circle radius");
                double r = input.nextDouble();
                c1.CicleArea(r);
                break;
            case 2:
                System.out.println("enter circle radius");
                double rr= input.nextDouble();
                c1.CicleCircum(rr);
                break;
            case 3:
                System.out.println("enter traingle base and hieght");
                double base = input.nextDouble();
                double hieght = input.nextDouble();
                c1.TraingleArea(base, hieght);
                break;
            case 4:
                System.out.println("enter traingle three ribs");
                double r1 = input.nextDouble();
                double r2 = input.nextDouble();     
                double r3 = input.nextDouble();
                c1.TraingleCireum(r1, r2, r3);
                break;          
                
        }
    }
    
}

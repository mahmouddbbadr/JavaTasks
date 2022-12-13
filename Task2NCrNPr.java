/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2.ncr.npr;
import java.util.Scanner;
/**
 *
 * @author M-AZMY
 */
public class Task2NCrNPr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter n and r values");
        int n = input.nextInt();
        int r = input.nextInt();
        System.out.println("1. nCr process");
        System.out.println("2. nPr process");
        int count = input.nextInt();
        switch(count){
            case 1:
               int result = fact(n)/(fact(n-r)*fact(r));
                System.out.println("nCr resulr = "+result);
                break;
            case 2:
                int resultt = fact(n)/fact(n-r);
                System.out.println("nCr resulr = "+resultt);
                break;
        }
                 
    }
    public static int fact(int x){
    int f=1;
    for(int i=1; i<=x; i++)
        f=f*i;
    return f;
    
    }
    
}

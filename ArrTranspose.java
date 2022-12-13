/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrtranspose;
import java.util.Scanner;
/**
 *
 * @author M-AZMY
 */
public class ArrTranspose {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        Scanner input = new Scanner(System.in);
        System.out.println("enter no.of rows and coloms of array");
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("fill the array up");
        for (int i=0; i<arr.length; i++) 
            for (int j = 0; j<arr[i].length; j++) 
                arr[i][j] = input.nextInt();
         System.out.println("arr is: ");
         for (int i=0; i<arr.length; i++) {
            for (int j = 0; j<arr[i].length; j++)
                 System.out.print(arr[i][j] +"  ");
             System.out.println(" ");}
         
        int[][] ArrTranspose = new int[n][m];
         for (int i=0; i<arr.length; i++) 
            for (int j = 0; j < arr[i].length; j++) 
                ArrTranspose[j][i] = arr[i][j];
         System.out.println("arr transpose is: ");

        for (int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr.length; j++) 
                System.out.print(ArrTranspose[i][j] +"  ");
            System.out.println("  ");}
     
              
    }
 
}

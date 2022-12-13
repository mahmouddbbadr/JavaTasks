/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrmax;
import java.util.Scanner;
/**
 *
 * @author M-AZMY
 */
public class ArrMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = input.nextInt();
        int[] arr = new int[n];
        int max=0;
        System.out.println("fill the array up");
        for(int i=0; i<arr.length; i++)
            arr[i]=input.nextInt();
        for(int i=0; i<arr.length; i++){
            if(arr[i]> max)
                max = arr[i];
        }
        System.out.println("maximum number in the array is " +max);
            
            

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commareplace;
import java.util.Scanner;
/**
 *
 * @author M-AZMY
 */
public class CommaReplace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the string: ");
        String s = input.nextLine();
        System.out.println("the new string is:");
        System.out.println(s.replace(",", ""));
        
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii.pkgchar;
import java.util.Scanner;
/**
 *
 * @author M-AZMY
 */
public class AsciiChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter ascii code you want to convert");
        char ch = (char)input.nextInt();
        System.out.println("the character is "+ch);    }
    
}

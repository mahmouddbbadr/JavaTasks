/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;
import java.util.Scanner;
/**
 *
 * @author M-AZMY
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter size of the array: ");
        int size = input.nextInt();
        int []arr = new int[size];
        System.out.println("fill array up");
        for(int i=0; i<arr.length; i++)
            arr[i]=input.nextInt();
        System.out.println("array before sorting");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] +" ");
        System.out.println("");
        
        QuickSort(arr, 0, arr.length-1);
        System.out.println("array after sorting");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] +" ");
        System.out.println("");        
    }
    
    
    
    public static void QuickSort(int[]arr, int low, int high){
    if(low>=high)
        return;
    int mid = low+(high-low)/2;
    int pivot = arr[mid];
    int i =low, j=high;
    while(i<j){
        while(arr[i]<pivot)
        {
            i++;
        }
        while(arr[j]>pivot)
        {
        j--;
        }
        if(i<=j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
        }
    }   
    if(low<j)
        QuickSort(arr, low, j);
    if(high>i)
        QuickSort(arr, i, high);
              
    }
    
}

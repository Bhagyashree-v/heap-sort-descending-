import java.util.Arrays;

import java.util.Comparator;
import java.util.Scanner;

public class ImplSortDEC2 {

	
	 static void printArray(Integer arr[], int n) 
	    { 
	        for (int i = 0; i < n; ++i) 
	            System.out.print(arr[i] + " "); 
	            System.out.println(); 
	    } 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter Number Of Elements You Want or Size Of Array:");
		 Integer e=sc.nextInt();
		  
		Integer[] arr2 = new Integer[e] ;
		//Integer[] arr2 = new Integer[] {2, 10, 3, 1,4,8,5,6,11,9};
		
		System.out.println("Elements::  ::");
		 for (Integer i = 0; i < arr2.length; i++)
		    {
		        System.out.println("Please enter number:");
		        arr2[i] = sc.nextInt();
		    }
		
		Arrays.sort(arr2, Comparator.reverseOrder());
		
		
		Integer n=arr2.length;
		System.out.println("===========================================");
		 printArray(arr2 , n); 
		System.out.println("===========================================");
	}

}

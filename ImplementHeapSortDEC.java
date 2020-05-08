import java.util.Scanner;

public class ImplementHeapSortDEC {

	// To heapify a subtree rooted with node i which is ...
    // an index in arr[]. n is size of heap ...
    static void heapify(Integer arr[], Integer n, Integer i) 
    { 
        Int smallest = i;      // Initialize smalles as root ...
        Int l = 2 * i + 1;     // left = 2*i + 1 ...
        Int r = 2 * i + 2;     // right = 2*i + 2 ...
  
        // If left side is smaller than root... 
        if (l < n && arr[l] < arr[smallest]) 
            smallest = l; 
  
        // If right child is smaller than smallest so far... 
        if (r < n && arr[r] < arr[smallest]) 
            smallest = r; 
  
        // If smallest is not root... 
        if (smallest != i) { 
            Int temp = arr[i]; 
            arr[i] = arr[smallest]; 
            arr[smallest] = temp; 
  
            // Recursively heapify the affected sub-tree 
            heapify(arr, n, smallest); 
        } 
    } 
  
    // Method to do heap sort...
    static void heapSort(Int arr[], Int n) 
    { 
        // Build heap (rearrange array) ...
        for (Int i = n / 2 - 1; i >= 0; i--) 
            heapify(arr, n, i); 
  
        // One by one extract an element from heap... 
        for (Int i = n - 1; i >= 0; i--) { 
              
            // Move current root to end 
            Int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
  
            // Call max heapify on the reduced heap... 
            heapify(arr, i, 0); 
        } 
    } 
  
    /* Method for print array size n ... */
    static void printArray(Int arr[], Integer n) 
    { 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
    
    
    
  	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc= new Scanner(System.in);    //With the help of Scanner class We can pass values at run time... 
		 System.out.println("Enter Number Of Elements You Want or Size Of Array:");
		 Int e=sc.nextInt();
		  
		Int[] arr = new Integer[e] ;
		//Int[] arr = new Int[] {2, 10, 3, 1,4,8,5,6,11,9};   
		
		 System.out.println("Elements::  ::");
		 for (Int i = 0; i < arr.length; i++)
		    {
		        System.out.println("Please enter number:");
		        arr[i] = sc.nextInt();
		    }
		 
		 
		 
		 
		 
	        Int n = arr.length; //To find length...
	  
	        heapSort(arr, n); 
	  
	        System.out.println("Sorted array is: "); 
	        System.out.println("========================================================");
	      
	        printArray(arr, n); 
	        
	        System.out.println("========================================================");
	}

}

import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;

// This program will read a file and load 
// the numbers in a sorted array.
public class SortedArray {
	 
	public static void main (String[] args) throws FileNotFoundException  { 
		
		 int [] arr= new int[100]; 
		 int [] arr2 = new int [10];
		 // declare and read both files
		 File f1 = new File("BS_Nums1.txt");
		 File f2 = new File("BS_Nums2.txt");
		 Scanner input = new Scanner(f1);
		 Scanner input2 = new Scanner(f2);
		 
		 // put all integers in the first file into an array
		 for (int i=0; i< arr.length; i++) {
			 arr[i] = input.nextInt();
		 }
		 
		 Arrays.sort(arr);
		 // show the sorted array
		 System.out.println("These are the 100 integers sorted out:");
		 for (int i=0; i< arr.length; i++) {
			 System.out.println(arr[i]);
		 }
		 System.out.println("----------------------------------------------------------------------------------------");
		 
		 
		 int foundIndex;
		 // iterate through the second file, put into array 
		 // check to see if each of the 10 integers are in the first file
		 for (int i = 0; i < arr2.length; i++) {
			 // put next integer into arr2 at index i
			 arr2[i] = input2.nextInt();
			 // search for arr2[i] in arr
			 foundIndex = Arrays.binarySearch(arr, arr2[i]);
			 
			 if (foundIndex < 0) {
				 System.out.println("Number " + arr2[i] + " is not found");
			 }
			 else {
				 System.out.println("Number " + arr2[i] + " is Found");
			 }
		 }
		 
		 
		 input.close();
		 input2.close();
		 
		 

	}	
}	


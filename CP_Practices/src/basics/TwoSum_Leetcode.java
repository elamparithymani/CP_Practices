package basics;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum_Leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	      System.out.println("Enter the length of the array:");
	      int length = s.nextInt();
	      int [] myArray = new int[length];
	      System.out.println("Enter the elements of the array:");

	      for(int i=0; i<length; i++ ) {
	         myArray[i] = s.nextInt();
	      }
	      System.out.println("Enter target element:");
	      int target = s.nextInt();
	      for(int i = 0; i<length ; i++) {
	    	  for(int j = 0; j<length; j++) {
	    		  if(myArray[i] + myArray[j] == target) {
	    			  System.out.println("[" + myArray[i] + "] , ["+ myArray[j] + "]");
	    		  }
	    	  }
	      }
	}

}

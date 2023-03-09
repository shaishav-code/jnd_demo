package DemoProject.DemoProject;

import java.util.ArrayList;
import java.util.Scanner;

public class pattern {
		public static void main(String[] args) {
			 // Create a new ArrayList of Strings
	        ArrayList<String> names = new ArrayList<String>();

	        // Add some elements to the list
	        names.add("jeet");
	        names.add("parth");
	        names.add("viraj");

	        // Iterate over the list and print each element
	        for (String name : names) {
	            System.out.println(name);
	        }

	        // Create a new object of a custom class
	       // Person p = new Person("jay", "yog");
	        
	        // Print the object properties
	        System.out.println("Below given names are add in array");
	       // System.out.println(p.getFirstName());
	        //System.out.println(p.getLastName());
	        
	        System.out.println("===========================================================");
	       for (int i =0; i<7; i++) {
	    	   
	    	   for (int j=0;j<i;j++) {
	    		   System.out.print("* ");
	    	   }
	    	   System.out.println("");
	    	   
	       }
	       for(int k=7;k>0;k--) {
	       	for (int l=k;l>1;l--) {
	       		System.out.print("* ");
	       		
	       	}
	       	
	       	System.out.println(" ");
				
	       }
	        System.out.println("=====================================================");
	        
	        for(int k=7;k>0;k--) {
	        	for (int l=k;l>1;l--) {
	        		System.out.print("* ");
	        		
	        	}
	        	
	        	System.out.println(" ");
				
	        }
			
			
		}
		

}

package Assignments;

public class Factorial {
public static void main(String[] args) {
	int a=6;
	//Declare a new variable and assign value as 1 to store the answer
    int fact = 1; 
		//Find the factorial using for 		    
		for (int i = a ; i >= 1 ; i--){		        
		 	fact = fact * i;	    
		}
		    
		System.out.println("Factorial" + a + " = " + fact);		    	  	
}
}

package Assignments;

import java.util.Arrays;

public class DuplicateElement {
	public static void main(String[] args) {
		//Declare the integer array with values
		int[] Age= {23,25,21,23,21};
		//Arrange age into ascending order
		Arrays.sort(Age);
		//iterate the values from 0 to length of the array
		for (int i = 0; i < Age.length; i++) {
			//use nested for loop to compare the values
			for (int j =i+1; j < Age.length; j++) {
		//compare i value with i+1 	
			if(Age[i]==Age[j]) {
				System.out.println(Age[i]);
			}
			
		}
	}}

}

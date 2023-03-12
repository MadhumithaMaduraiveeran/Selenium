package Assignments;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		//Declare a integer array with values
		int[] num= {1,3,4,5};
		//Arrange into ascending order
		Arrays.sort(num);
		//iterate the loop from 0 to length of the array
		for (int i = 0; i < num.length; i++) {
		//check condition whether number of i is not equal to i+1
			if(num[i]!=i+1) {
			System.out.println(i+1);
			//when condition is true break the loop
		break;
		}
	}

}}

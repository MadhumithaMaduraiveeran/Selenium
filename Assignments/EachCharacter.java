package Assignments;

public class EachCharacter {
	public static void main(String[] args) {
		//declare the variable
		String name="madhumitha";
		//convert string into character
		char[] text=name.toCharArray();
		//iterate from o to length of an array
		for (int i = 0; i < text.length; i++) {
			//print the value
			System.out.println(text[i]);
			
		}
	}

}

package Assignments;

public class Palindrome {
public static void main(String[] args) {
	//declare the variable 
	String name="amma";
	//initialize of empty string to store reverse value
	String rev="";
	//convert string into char array
	char[] ch=name.toCharArray();
	//iterate the characters using for loop
	for (int  i=ch.length-1;i>=0; i--) {
		//store the character into reverse string
		rev=rev+ch[i];}
			System.out.println(rev);
		 //comparism the strings
			if(name.equals(rev)) {
			System.out.println("It is palindrome");
		}
			//if condition is not true go for else 
		 else {
			System.out.println("It is  not palindrome");
		}
		
	}
}
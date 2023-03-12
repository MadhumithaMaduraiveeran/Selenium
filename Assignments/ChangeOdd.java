package Assignments;

public class ChangeOdd {
	public static void main(String[] args) {
		String name="madhumitha";
		//Convert the String into Character
		char[] ch=name.toCharArray();
		//Iterate the character from o to Array length
		for(int i=0;i<ch.length;i++){
		//check condition whether it is odd
		if(i%2==1){
		//to change the name to UpperCase
		char oddIndex=Character.toUpperCase(ch[i]);
		System.out.print(oddIndex);
		}else{
		//print the character
		System.out.print(ch[i]);
		}}
		}
		}

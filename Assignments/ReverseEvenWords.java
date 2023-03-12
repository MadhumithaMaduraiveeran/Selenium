package Assignments;

public class ReverseEvenWords {
	public static void main(String[] args) {
		//declare the sentence in string
		String text="I am a QA Engineer";
System.out.println(text);
		//convert the string into array
		char[] ch=text.toCharArray();
		//iterate the value from backwards (ch.length to index value)
		for (int  i =ch.length-1;i>=0 ;i--) {
			//print the value
			System.out.println(ch[i]);
			
			
		}
	}

}

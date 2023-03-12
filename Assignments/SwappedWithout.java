package Assignments;

public class SwappedWithout {
	public static void main(String[] args) {
		//declare two variables
		int a=20;
		int b=10;
		a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("swappedvalueofa:"+a);
	System.out.println("swappedvalueofb:"+b);
	}
}

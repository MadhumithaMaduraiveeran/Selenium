package week1Day3;

public class Calculator {
	public void addTwoNumber(int a,int b) {
	int c=a+b;
	System.out.println(c);
	}
	public void subTwoNumber(int a,int b) {
		int c=a-b;
		System.out.println(c);
		}
	public void multiTwoNumber(int a,int b) {
		int c=a*b;
		System.out.println(c);
		}
	public void divideTwoNumber(int a,int b) {
		int c=a/b;
		System.out.println(c);
		}
	
	public static void main(String[] args) {
		Calculator calci=new Calculator();
		
		calci.addTwoNumber(15,12);
		calci.subTwoNumber(15,12);
		calci.multiTwoNumber(15,12);
		calci.divideTwoNumber(15,12);
	}
}

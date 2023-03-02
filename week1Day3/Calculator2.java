package week1Day3;

public class Calculator2 {
	public int addTwoNumber(int a,int b) {
	int c=a+b;
	
	return c;
}
public void subTwoNumber(int sum,int b) {
	int c=sum-b;
	System.out.println(c);
}
public static void main(String[] args) {
Calculator2 calc=new Calculator2();
int sum = calc.addTwoNumber(250, 350);
System.out.println(sum);
calc.subTwoNumber(sum,20);
}
}


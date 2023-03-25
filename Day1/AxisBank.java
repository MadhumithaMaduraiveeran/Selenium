package week5.Day1;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("deposit amount"); 
	}
	public static void main(String[] args) {
		AxisBank abank=new AxisBank();
		abank.deposit();
		abank.savings();
		abank.fixed();
		abank.deposit();
	
	} 

}

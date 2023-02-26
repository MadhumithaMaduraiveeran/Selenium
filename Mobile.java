
public class Mobile {
	String mobileBrandName ="vivo";
	char mobileLogo='o';
	short noOfMobilePiece=898;
	int modelNumber=222345;
	long mobileImeiNumber=86658845469L;
	float mobilePrice=33333.33F;
	boolean isDamaged=true;
	public static void main(String[] args) 
	{
		Mobile mob=new Mobile();
		System.out.println(mob.mobileBrandName);
		System.out.println("Mobile logo ="+mob.mobileLogo);
		System.out.println("No. of mobile piece "+" ="+mob.noOfMobilePiece);
		System.out.println("Mobile Price "+" ="+mob.mobilePrice);
		System.out.println("Damaged "+" ="+mob.isDamaged);
	}
}
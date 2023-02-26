
public class TwoWheeler {
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=9837485764373L;
	boolean isPunctured=false;
	String bikeName="Pulsar";
	double runningKM=2000.20;

	public static void main(String[] args) {
		TwoWheeler bike=new TwoWheeler();
		   System.out.println("No.of mirrors ="+bike.noOfMirrors);
		   System.out.println("chassis Number "+" ="+bike.chassisNumber);
		   System.out.println("No.of wheels ="+bike.noOfWheels);
		   System.out.println("Bike Name ="+bike.bikeName);
		   System.out.println(bike.isPunctured);
		   System.out.println("runningKM "+" ="+bike.runningKM);
	}
}

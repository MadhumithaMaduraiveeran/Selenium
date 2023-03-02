package week1Day3;

public class EmployeeDetails {
		public void getEmployeeName (String empName) {
			System.out.println(empName);
		}
		public void getEmployeeId (int empId)	{
			System.out.println(empId);
		}
		public void getEmployeeAddress (String empAddress)	{
			System.out.println(empAddress);
		}
		public void printEmployeeSalary(double empSalary)	{
			System.out.println(empSalary);
		}
		public void printEmployeePhnNumber(long phnNumber)	{
			System.out.println(phnNumber);
		}
		public static void main(String[] args) {
			EmployeeDetails emp=new EmployeeDetails();
			emp.getEmployeeName("Madhu");
			emp.getEmployeeName("21141");
			emp.getEmployeeAddress("Chennai");
			emp.printEmployeeSalary(45000);
			emp.printEmployeePhnNumber(37647281028l);
		}
}
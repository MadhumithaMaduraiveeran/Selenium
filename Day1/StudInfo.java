package week5.Day1;

public class StudInfo extends Students {
	public void getStudentInfo(String stumail){
		System.out.println(stumail);
	}
	
public static void main(String[] args) {
	Students stu=new Students();
	stu.getStudentsInfo("madhu");
	stu.getStudentsInfo(21018);
	stu.getStudentInfo(948463734);
stu.getStudentInfo("ComputerScience");
stu.getStudentInfo("Madurai");
stu.getStudentInfo("madhumithaec@gmail.com");
}
}

package org.student;

import org.department.Department;

public class Student extends Department{
	public void StudentName()
	{
		System.out.println("Student Name: Madhumitha");
	}
	public void StudentDept()
	{
		System.out.println("Student Dep:Cs");
	}
	public void StudentId()
	{
		System.out.println("E18CS141");
	}
	public static void main(String[] args) {
	Student stu=new Student();
		stu.CollegeName();
		stu.CollegeCode();
		stu.CollegeRank();
		stu.Deptname();
		stu.StudentName();
		stu.StudentDept();
		stu.StudentId();
		
	}
}

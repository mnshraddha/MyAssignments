package org.student;
import org.department.Department;

public class Student extends Department  {
	public void studentName()
	{
		System.out.println("Shraddha");
	}
	public void studentDept()
	{
		System.out.println("Student department Computers");
	}
	public void studentId()
	{
		System.out.println("Student id 221");
	}
	public static void main(String[] args) {
		Student stud = new Student();
		System.out.println("Student Information::");
		stud.studentId();
		stud.studentName();
		stud.studentDept();
		stud.deptName();
		System.out.println("College Information for student::");
		stud.collegeName();
		stud.collegeCode();;
		stud.collegeRank();
			

	}

}

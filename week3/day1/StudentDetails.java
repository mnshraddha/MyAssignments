package week3.day1;

public class StudentDetails {
public void getStudentInfo(String name)
{
	System.out.println(name);
}
public void getStudentInfo(int studId)
{
	System.out.println(studId);
}
public void getStudentInfo(int studId,String name)
{
	System.out.println(studId);
	System.out.println(name);
}
	public static void main(String[] args) {
		
		StudentDetails studDetails = new StudentDetails();
		studDetails.getStudentInfo("Shraddha");
		studDetails.getStudentInfo(1222);
	}

}

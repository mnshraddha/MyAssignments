package week3.day1;
//Method overloading example
public class Students {
	public void getStudentInfo(int id)
	{
		System.out.println("Student id: "+id);
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Student id: "+id+" Student name: "+name);
	}
	public void getStudentInfo(String email,String phoneNumber)
	{
		System.out.println("Student email: "+email+" Student Phonenumber: "+phoneNumber);
	}
	public static void main(String[] args) {
		Students stud  =  new Students();
		stud.getStudentInfo(12);
		stud.getStudentInfo(22, "Shraddha");
		stud.getStudentInfo("test@gmail.com","425965726");
	}

}

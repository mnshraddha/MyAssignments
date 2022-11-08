package week1.day1;

//Program to find whether a number is an Armstrong number or not

public class ArmstrongNumber {
	
	//Method to check if number is an Armstrong number
 public void FindArmstrongNumber(int inputNum)
 {
	 	int calculated = 0,remainder,original;
		
	 	original = inputNum;
	 	
	 	while(original != 0)
	 	{
	 		remainder = original % 10;
	 		calculated = calculated + (remainder*remainder*remainder);
	 		original = original /10;
	 	}
	 	
	 	if(calculated==inputNum)
	 	{
	 		System.out.println("Given number "+inputNum+" is an Armstrong number");
	 	}
	 	else
	 		System.out.println("Given number "+inputNum+" is not an Armstrong number");
 }
	public static void main(String[] args) {
		
		int inputNum = 371;
		ArmstrongNumber ArmStgNum = new ArmstrongNumber();
		ArmStgNum.FindArmstrongNumber(inputNum);	

	};

}

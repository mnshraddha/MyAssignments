package week1.day1;

//Program to convert negative Number to Positive Number

public class ConvertANegativeNumberToPositiveNumber {

	//Method to convert negative number to positive Number
	public int convertNegativeToPositive(int negativeNum)
	{
		int positiveNum = negativeNum * -1;
		return positiveNum;
	}
	public static void main(String[] args) {
		
		int num = -40;
		ConvertANegativeNumberToPositiveNumber ConvertNToP = new ConvertANegativeNumberToPositiveNumber();
		if(num < 0)
		{
			System.out.println("The positive Number Is\t"+ ConvertNToP.convertNegativeToPositive(num));
		}
		else 
			System.out.println("The number is not negative");
	}

}

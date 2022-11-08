package week1.day1;

//Program to Check given number positive or negative

public class CheckIfTheNumberIsPositiveOrNegative {

	//Method to check number positive or Negative
	public String checkPositiveOrNegative(int inputNum)
	{
		if(inputNum > 0)
		{
			return "positive" ;
		}
		else if(inputNum < 0)
		{
			return "negative";
		}
		else
			
			return "neither positive nor negative";
	}

	public static void main(String[] args) {
		
		int num = 35;
		
		CheckIfTheNumberIsPositiveOrNegative IsPosOrNeg = new CheckIfTheNumberIsPositiveOrNegative();
		
		System.out.println("The number\t"+num+ "\tis\t" + IsPosOrNeg.checkPositiveOrNegative(num));
		

	}

}

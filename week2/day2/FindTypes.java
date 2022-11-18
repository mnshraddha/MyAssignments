package week2.day2;
//Program to find the types of special 
//character,digit,letter in given string

public class FindTypes {

	public static void main(String[] args) {
		
	 String testStr = "$$ Welcome to 2nd Class of Automation $$ ";
	 
	 //Initializing counter for letter,space,number and special char
	 int  letter = 0, space = 0, num = 0, specialChar = 0;
	 
	 char[] charStr = testStr.toCharArray();
	 
	 for(int i = 0;i<charStr.length;i++)
	 {
		if(Character.isLetter(charStr[i]))
		{
			 letter++;
		}
		 else if(Character.isDigit(charStr[i]))
		 {
			 num++;
		 }
		 else if(Character.isSpaceChar(charStr[i]))
		 {
			 space++;
		 }
		 else
			 specialChar++;
		 
	 }
	 
	 //Printing the output
	 System.out.println("Number of Letters in given string ::"+letter);
	 System.out.println("Number of Digits in given string ::"+num);
	 System.out.println("Number of space in given string ::"+space);
	 System.out.println("Number of Special character in given string ::"+specialChar);
	 
	}

}

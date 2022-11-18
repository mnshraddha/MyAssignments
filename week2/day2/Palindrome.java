package week2.day2;

public class Palindrome {

	public boolean checkforPalidrome(String str)
	{
		//initializing empty string to store reverse string
		String revString = "";
		boolean isPalidrome;
		
		//storing input string in reverse in empty string
		for(int i=str.length()-1; i>=0;i--)
		{
			revString = revString + str.charAt(i);
		}
		//checking if both string are same
		if(str.equals(revString)) {
			isPalidrome = true;
		}
		else 
		{
			isPalidrome = false;
		}
		
		return isPalidrome;
		
	}
	
	public static void main(String[] args) {
		//input string
		String inputString = "radar";
		boolean chkstr;
		
		Palindrome checkPalindrome = new Palindrome(); 
		chkstr = checkPalindrome.checkforPalidrome(inputString);
		if(chkstr == true)
		{
			System.out.println(inputString + " is Palindrome");
		}
		else
			System.out.println(inputString + " is not Palindrome");
	}

}

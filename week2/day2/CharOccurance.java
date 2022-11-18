package week2.day2;

public class CharOccurance {

	public static void main(String[] args) {
		
		String inputStr = "welcome to chennai";
		char chkchar = 'e';
		int cnt = 0; //variable to store number of occurrence
		
		char[] strArray = inputStr.toCharArray();
		
		for(int i = 0;i<strArray.length;i++)
		{
			if (strArray[i] == chkchar)
			{
				cnt ++;
			}
		}
		
		System.out.println("Number of occurance of "+chkchar+" in " +inputStr+" is " +cnt);
	}

}

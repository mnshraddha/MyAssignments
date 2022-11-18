package week2.day2;

import java.util.Arrays;
//program to check if given strings are Anagram
public class Anagram {

	public static void main(String[] args) {
		String inputStr1 = "stops";
		String inputStr2 = "potss";
		
		char[] inputStr1Arr = inputStr1.toCharArray();
		char[] inputStr2Arr = inputStr2.toCharArray();
		
		if(inputStr1.length() == inputStr2.length())
		{
			Arrays.sort(inputStr1Arr);
			Arrays.sort(inputStr2Arr);
			
			/*System.out.println(inputStr1Arr);
			System.out.println(inputStr2Arr);*/
			
			if (String.valueOf(inputStr1Arr).equalsIgnoreCase(String.valueOf(inputStr2Arr)))				
				System.out.println(inputStr1 + " and " + inputStr2 +" are Anagrams");
			else
				System.out.println(inputStr1 + " and " + inputStr2 +" are not Anagrams");
		}
		else
			System.out.println(inputStr1 + " and " + inputStr2 +" are of different length so no Anagrams ");
	}

}

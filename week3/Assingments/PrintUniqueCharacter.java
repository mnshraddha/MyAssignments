package week3.day2.Assingments;
//PrintUniqueCharacter
	/*
	 * Problem
	 * 
	 * a) Take your name as input
	 * b) Print all unique characters only (any order)
	 * 
	 * Input:  babu
	 * Output: a u 
	 * 
	 */

	/*
	 * Psuedocode
	 * 
	 * a) Convert String to Character array
	 * b) Create a new Set -> HashSet
	 * c) Add each character to the Set and if it is already there, remove it
	 * d) Finally, print the set
	 * 
	 */
import java.util.HashSet;
import java.util.Set;


//Program to print unique characters
public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String nameStr="shraddha";
		
		char[] charArray =nameStr.toCharArray();
		System.out.println("Input String:: ");
		System.out.println(charArray);
		
		Set<Character> uniqueCharSet = new HashSet<Character>();
		
		for (int i = 0; i < nameStr.length(); i++) 
		{
			for(int j =0;j<nameStr.length();j++) {
			
			if(nameStr.charAt(i)== nameStr.charAt(j)&& i != j)
			{
				uniqueCharSet.remove(charArray[i]);
				break;				
			}
			uniqueCharSet.add(charArray[i]);
			}
			
		}
		
		//print output
		System.out.println("Output String of Unique Charater:: ");	
		System.out.println(uniqueCharSet.toString().replace("[", "").replace("]", ""));

	}

}

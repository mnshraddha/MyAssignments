package week3.day2.Assingments;
/*
 * Pseudo code 
 * a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";
 *
 *Output= We learn java basics as part of sessions in week1
 *
 * Psuedocode
 *
 * b) Split the String based on white spaces and save as String Array ,Then iterate the Array	  
 * c) Create a empty Set 
 * d) Iterate the String array
             d.1) add each word into Set
 * e) Print the Set values which is having unique words
 */
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWord {

		public static void main(String[] args) {
		String inputStr = "We learn java basics as part of java sessions in java week1";
		//using Hashset to remove duplicate data
		Set<String> setStr = new LinkedHashSet<String>();
		//split the given string
		String[] splitStr = inputStr.split(" ");
		
		for(String str:splitStr)
		{
			setStr.add(str);
			
		}
		//print output
		String newStr = setStr.toString().replace("[","").replace("]","").replace(",","");
		
		System.out.println("The original String::");
		System.out.println(inputStr);
		System.out.println("\nThe String after removing duplicate words::");
		System.out.println(newStr);	
	}

}

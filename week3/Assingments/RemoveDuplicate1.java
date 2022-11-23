package week3.day2.Assingments;


import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Pseudo code 
 
 * a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";		
 * b) Initialize an integer variable as count	  
 * c) Split the String into array and iterate over it 
 * d) Initialize another loop to check whether the word is there in the array
 * e) if it is available then increase and count by 1. 
 * f) if the count > 1 then replace the word as "" 
 
 * g) Displaying the String without duplicate words	
 */
public class RemoveDuplicate1 {

	public static void main(String[] args) {
			//input string
				String inputStr = "We learn java basics as part of java sessions in java week1";
				System.out.println("Input String:\n");
				System.out.println(inputStr);
		   //split the string
				String[] inputString = inputStr.split(" ");

		   Set<String> strSet = new LinkedHashSet<String>();

			for (int i = 0; i < inputString.length; i++) {

				strSet.add(inputString[i]);

				}

				//Printing output
			  System.out.println("\nOutput String after removing duplicate words::\n");
				for (String str : strSet) {

					System.out.print(str + " ");

				}

	}

}

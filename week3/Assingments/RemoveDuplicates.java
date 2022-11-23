package week3.day2.Assingments;
/*Declare a String as PayPal India
Convert it into a character array
Declare a Set as charSet for Character
Declare a Set as dupCharSet for duplicate Character
Iterate character array and add it into charSet
if the character is already in the charSet then, add it to the dupCharSet
Check the dupCharSet elements and remove those in the charSet
Iterate using charSet
Check the iterator variable isn't equals to an empty space
print it*/

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String inputStr ="PayPal India";
		System.out.println("Input String:\n"+inputStr);
		inputStr = inputStr.replace(" ","");
		
		char[] inputCharArr = inputStr.toCharArray();
		
		Set<Character> charSet = new HashSet<Character>();
		Set<Character> dupCharSet = new HashSet<Character>();
		
		for(int i = 0;i<inputCharArr.length;i++)
		{
			
			for(int j = 0 ;j<inputCharArr.length;j++)
			{
				if(inputStr.charAt(i)== inputStr.charAt(j)&& i != j)
				{
					dupCharSet.add(inputCharArr[i]);
					break;
					
				}
				charSet.add(inputCharArr[i]);
				} 
			}
			
		
		System.out.println("Duplicate Character in given string:\n"+dupCharSet.toString().replace("[","").replace("]", ""));

}
	

}

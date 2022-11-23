package week3.day2.Assingments;
/*
 * Problem 
 * 
 * There will be running number between 1 to 10
 * One of the unique number will be missing
 * Find the missing number
 * 
 * 
 */

/*
 * Psuedocode
 * 
 * a) Remove the duplicates using Set
 * b) Make sure the set is in the ascending order
 * c) Iterate from the starting number and verify the next number is + 1
 * d) If did not match, that is the number
 * 
 */

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumber {
	//Method to find missing elements
		public int findMissingNumber(int[]inputArr)
		{
			
			HashSet<Integer> setArry = new HashSet<Integer>();
			
			System.out.println("Given Array:: ");
			System.out.println(Arrays.toString(inputArr));
			System.out.println("\nArray without duplicate:: ");
			for (int i :inputArr) {
				setArry.add(i);
			}
			System.out.println(setArry);
			int n =inputArr.length+1;
			for(int j=0;j<n;j++)
			{
				if(!setArry.contains(j))
				{
				 return j;
				}
			}
			
			
			return -1;
		}
		
	public static void main(String[] args) {
		int[] inputArr = {9, 6, 4, 2, 3, 8, 0, 1,10};
		
		
		MissingNumber missingElement = new MissingNumber();
		System.out.println("Missing elements from given Array:: "+missingElement.findMissingNumber(inputArr));
		
	}

}

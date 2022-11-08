package week1.day2;

import java.util.Arrays;
//program to find missing elements from given Array
public class MissingElementInAnArray {

	//Method to find missing elements
	public void findMissingNumber(int []arr)
	{
		int arrDiff = arr[0]-0;
		
		System.out.println("\nMissing Elements from Array:: ");
		for(int i = 0;i <arr.length;i++)
		{
			if (arr[i] - i!=arrDiff)
			{
				while(arrDiff<arr[i]-i) {
					System.out.print("  "+(arrDiff+i));
					arrDiff++;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,7,6,8,10,11,14};
		
		Arrays.sort(arr);
		System.out.println("Given Array:: ");
		for(int cnt=0;cnt<arr.length;cnt++)
		{
			System.out.print(" "+arr[cnt]);
		}		
		MissingElementInAnArray missingElement = new MissingElementInAnArray();
		missingElement.findMissingNumber(arr);
		
		 
	}

}

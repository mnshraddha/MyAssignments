package week1.day2;

import java.util.Arrays;
//Program to find second largest number from array

public class FindSecondLargest {
	//Method for sorting array and fining second largest number
	public  int FindSecondLargestOfArray(int[] data)
	{
		int i;
		Arrays.sort(data);
		System.out.println("***The sorted Array****");
		for(i =0;i<data.length;i++)
		{
			System.out.println(data[i]);
		}
		return data[data.length-2];
	}

	public static void main(String[] args) {
		
		
		int data[] = {3,2,11,4,6,7,234,99,113};
		FindSecondLargest findSecondLargenum = new FindSecondLargest();
		
		System.out.println("\nSecond largest number of array is ::"+findSecondLargenum.FindSecondLargestOfArray(data));
	}

}

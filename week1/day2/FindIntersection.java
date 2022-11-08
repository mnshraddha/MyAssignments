package week1.day2;
import java.util.Arrays;

public class FindIntersection {

	public void findingIntersection(int[]firstArray,int[]secondArray)
	{
		
		//sorted input array
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		
		//Printing firstArray
		System.out.println("First Array:: ");
		for(int cnt=0;cnt<firstArray.length;cnt++)
		{
			System.out.print("\t"+firstArray[cnt]);
		}
		//Printing SecondArray
		System.out.println("\nSecond Array:: ");
		for(int cnt1=0;cnt1<secondArray.length;cnt1++)
		{
			System.out.print("\t"+secondArray[cnt1]);
		}
		
		////Printing Intersection
		System.out.println("\nIntersection of given array::");
		
		for(int i = 0;i<firstArray.length;i++) 
		{
			
			for(int j = 0;j<secondArray.length;j++)
			{
				
				if(firstArray[i]==secondArray[j])
				{
					System.out.print("\t"+firstArray[i]);
					
				}
				
				
				}
			}
		
				
	}
	
	public static void main(String[] args) {
		int firstArray[] = {2,5,66,77,92,90,13,46,6,23};
		int secondArray[] = {1,3,44,77,89,90,65,45,60,9,8,10};
		
		FindIntersection fInterSection = new FindIntersection();
		fInterSection.findingIntersection(firstArray, secondArray);
		
	}

}

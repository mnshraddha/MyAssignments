package week3.day2.Assingments;

import java.util.Arrays;

public class MajorityElements {
public int findingMajority(int inputarr[])
{
	int cnt = 0;
	int sizeArr = inputarr.length;
	 for(int i = 0;i<sizeArr;i++)
	 {
		 for(int j =0;j<sizeArr;j++)
		 {
			 if(inputarr[i]==inputarr[j])
			 {
				 cnt++;
			 }
			 
		 }
		 if(cnt>(sizeArr/2))
		 {
			 return inputarr[i];
		 }
		 cnt = 0;
	 }
	return -1;
}
	public static void main(String[] args) {
		// input Array  
        int inputarr[] = {2,2,1,1,1,2,2};  
        int inputarr1[] = {3,2};
        MajorityElements majorele = new MajorityElements();
        System.out.println("Input Array:: "+Arrays.toString(inputarr));
        if(majorele.findingMajority(inputarr)!=-1)
        {
        	System.out.println("The Majority Element of Array:: "+majorele.findingMajority(inputarr));
        }
        else
        {
        	System.out.println("No Majority element in Array");
        }
        System.out.println("Input Array:: "+Arrays.toString(inputarr1));
        if(majorele.findingMajority(inputarr1)!=-1)
        {
        	System.out.println("The Majority Element of Array:: "+majorele.findingMajority(inputarr1));
        }
        else
        {
        	System.out.println("No Majority element in Array");
        }
        
	}

}

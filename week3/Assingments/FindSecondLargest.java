package week3.day2.Assingments;
import java.util.ArrayList;
import java.util.List;
/*
 * Pseudo Code: 
 * a) Create a empty Set Using TreeSet
 * b) Declare for loop iterator from 0 to data.length and add into Set 
 * c) converted Set into List
 * d) Print the second last element from List
 * 
 * 
 */
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> treeSet = new TreeSet<Integer>();
		for(int i=0;i<data.length;i++) 
		{
			treeSet.add(data[i]);
		}
		System.out.println("Input data: ");
		System.out.println(treeSet);
		 
		 List<Integer> listData= new ArrayList<Integer>(treeSet);
		 
		 //Printing second largest number
		 int secondLargest = listData.get(listData.size()-2);
		 System.out.println("The second largest element :"+secondLargest);
	}

}

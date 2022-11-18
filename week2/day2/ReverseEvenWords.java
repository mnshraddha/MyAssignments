package week2.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String inputStr = "I am a software tester";
		String finalstr = "";
		
		//split the given string
		String[] splitArray = inputStr.split(" ");
		
		for (int i = 0; i < splitArray.length; i++) {
			
			//using mod operator to find odd index
			if(i % 2 == 1)
			{ 	
				//reversing the string
				String reverseStr = "";
				for(int j = splitArray[i].length() - 1 ; j >=0 ; j--)			
					reverseStr = reverseStr + String.valueOf(splitArray[i].charAt(j));
				
				//Adding space at end of string
				finalstr = finalstr + reverseStr + " ";
				}
			else
				finalstr = finalstr + String.valueOf(splitArray[i]) + " ";
		
		}
		
		//printing output
		System.out.println(finalstr);
	}

}

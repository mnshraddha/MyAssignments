package week1.day1;

//Program to find fibbonaci series for given range
public class FibonacciSeries {
	//Method for finding fibbonaci series
	public void findFibbonaci(int range)
	{
		int firstNum = 0;
		int secondNum = 1;
		int sum = 0;
		
		while (sum < range)
		{
			System.out.println(firstNum +"\t");
			int thirdNum  = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = thirdNum;
			sum = sum + 1;
		}
	}
	public static void main(String[] args) {
		
		int range = 10;
		FibonacciSeries FibSeries = new FibonacciSeries();
		System.out.println("Fibbonaci series for range "+range+" is::");
		FibSeries.findFibbonaci(range);
	}

}

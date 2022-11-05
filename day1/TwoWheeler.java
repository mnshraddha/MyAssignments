package week1.day1;

public class TwoWheeler {
	//Global Variables	
		public int noOfWheels = 4;
		public short noOfMirrors = 3;
		public long chassisNumber = 20000000;
		public boolean isPunctured = false;
		String bikeName = "Hyndai";
		public double krunningKM = 10000;
		

	public static void main(String[] args) {
		
		TwoWheeler twoWheel = new TwoWheeler();
		System.out.println("###TwoWheeler Information##");
		System.out.println("----------------------------");
		System.out.println("noOfWheels:: "+ twoWheel.noOfWheels);
		System.out.println("noOfMirrors:: "+ twoWheel.noOfMirrors);
		System.out.println("chassisNumber:: "+twoWheel.chassisNumber);
		if(twoWheel.isPunctured==false) {
		
			System.out.println("Your TwoWheeler is not Punctured");
		}
		else 
		{
			System.out.println("Your TwoWheeler is Punctured");
		}
		System.out.println("bikeName:: "+twoWheel.bikeName);
		System.out.println("krunningKM:: "+twoWheel.krunningKM);
	}

}

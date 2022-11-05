package week1.day1;

public class Mobile {
	//Global Variables	
	        String mobileBrandName="Iphone11";
	        char mobileLogo = 'A';
			public short noOfMobilePiece=10;
			public int modelNumber=123456;
			public long mobileImeiNumber= 2147483649L;
			public float mobilePrice= 100000000;
			public boolean isDamaged= true;
			
	/*public void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("Calling my Mobile");
	}*/
public void sendMsg() {
	System.out.println("####My mobile information###");
	System.out.println("----------------------------");
}
	public static void main(String[] args) {
		
		Mobile myMobile = new Mobile();
		//myMobile.makeCall();
		myMobile.sendMsg();
		
		System.out.println("mobileBrandName:: "+ myMobile.mobileBrandName);
		System.out.println("mobileLogo:: "+ myMobile.mobileLogo);
		System.out.println("noOfMobilePiece:: "+ myMobile.noOfMobilePiece);
		System.out.println("modelNumber:: "+ myMobile.modelNumber);
		System.out.println("mobileImeiNumber:: "+ myMobile.mobileImeiNumber);
		System.out.println("mobilePrice:: "+ myMobile.mobilePrice);
		if(myMobile.isDamaged==true) {
		
			System.out.println("Mobile is damaged");
		}
		else 
		{
			System.out.println("Mobile is not damaged");
		}
		
	}

}

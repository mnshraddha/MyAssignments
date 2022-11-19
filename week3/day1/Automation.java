package week3.day1;

public class Automation extends MultipleLangauge{
    
	public static void main(String[] args) {
		Automation automation = new Automation();
		automation.python();
		automation.Java();
		automation.ruby();
		automation.Selenium();
		
	}
	//Implementing method from abstract class
	public void ruby() {
    	System.out.println("Learning ruby");
    }

}

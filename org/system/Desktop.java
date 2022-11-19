package org.system;

public class Desktop extends Computer {
public void desktopSize()
{
	System.out.println("Desktop size is 11inch");
}
	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		//Calling method of inherited class
		desktop.computerModel();
		desktop.desktopSize();
		
	}

}

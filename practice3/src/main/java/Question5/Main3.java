package Question5;

public class Main3 implements Main2,main1{  //by using implements we can solve the multiple 
	                                         // inheritance problem in java 

	@Override
	public void display() {
		// TODO Auto-generated method stub
		main1.super.display();
	}

	public static void main(String args[])   
	{  
	Main3 obj = new Main3();  
	obj.display();  
	}
}

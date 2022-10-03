package Question3;

public class Polymorphism {

	
	 int mul(int a,int b) {
		 return a*b;
	 }
	 int mul(int a,int b,int c) {
		 return a*b*c;
	 }
	 
	 public static void main(String [] args) {
		 Polymorphism ad=new Polymorphism();
		 int ans=ad.mul(8,9);
		 int answ=ad.mul(1,8,2);
		 
		 System.out.println(ans);
		 System.out.println(answ);
		 
		 
		 
	 }
}


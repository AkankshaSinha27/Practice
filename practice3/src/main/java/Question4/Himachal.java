package Question4;

public class Himachal extends States{

	@Override
	String Area() {
		// TODO Auto-generated method stub
		return "Himachal";
	}

	@Override
	String Dance() {
		// TODO Auto-generated method stub
		return "bhangra";
	}

	
	public static void main(String args[]) {
		Himachal h = new Himachal();
		String Area = h.Area();
		String Dance = h.Dance();
		System.out.println(Area);
		System.out.println(Dance);
}}

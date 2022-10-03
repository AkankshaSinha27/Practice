package Question4;

public class Rajasthan extends States{

	@Override
	String Area() {
		// TODO Auto-generated method stub
		return "Rajasthan";
	}

	@Override
	String Dance() {
		// TODO Auto-generated method stub
		return "Ghummar";
	}

	public static void main(String args[]) {
		Rajasthan d = new Rajasthan();
		String Area = d.Area();
		String Dance = d.Dance();
		System.out.println(Area);
		System.out.println(Dance);
	
}}

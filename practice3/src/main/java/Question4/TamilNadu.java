package Question4;

public class TamilNadu extends States{

	@Override
	String Area() {
		// TODO Auto-generated method stub
		return "Tamil Nadu";
	}

	@Override
	String Dance() {
		// TODO Auto-generated method stub
		return "Khuchuouri";
	}

	public static void main(String args[]) {
		TamilNadu c = new TamilNadu();
		String Area = c.Area();
		String Dance = c.Dance();
		System.out.println(Area);
		System.out.println(Dance);

}}

package Question4;

public class Bihar extends States{

	@Override
	String Area() {
		// TODO Auto-generated method stub
		return "Bihar";
	}

	@Override
	String Dance() {
		// TODO Auto-generated method stub
		return "Normal";
	}

	public static void main(String args[]) {
		Bihar bi = new Bihar();
		String Area = bi.Area();
		String Dance = bi.Dance();
		System.out.println(Area);
		System.out.println(Dance);

}
}
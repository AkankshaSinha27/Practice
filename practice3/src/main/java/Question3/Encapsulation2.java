package Question3;

public class Encapsulation2 {

	public static void main(String[] args) {

		Encapsulation acc = new Encapsulation();

		acc.get_fee(756);
		acc.setName("Ram");

		acc.setAmount(90000f);

		System.out.println(acc.get_ID());

		System.out.println(acc.getName());
		System.out.println(acc.getAmount());

	}
}

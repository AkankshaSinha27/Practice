package Question3;

public class Inheritance {

	void Earth() {
		System.out.println("living being");
	}
}

class World extends Inheritance {
	void area() {
		System.out.println("Land air water");
	}
}

class land extends Inheritance {
	void air() {
		System.out.println("for survival");
	}
}




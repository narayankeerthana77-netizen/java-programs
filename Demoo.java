package kee.ram;

class Atm {
	void withdraw() {
		System.out.println(" withdraw logic");
	}
	void depoiste() {
		System.out.println(" depositte logic");
	}
}
public class Demoo extends Atm {

	public static void main(String[] args) {
		Demoo ff = new Demoo();
		ff.withdraw();
		ff.depoiste();
	}
}
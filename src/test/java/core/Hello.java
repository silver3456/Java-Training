package core;

public class Hello {
	public static void main(String[] args) {
		hello("Alex");

		double l = 5;
		System.out.println("Square " + l + " = " + area(l));

		double a = 5;
		double b = 6;
		System.out.println("Rectangle " + a + " and " + b + " = " + area(a, b));

	}

	public static void hello(String somebody) {
		System.out.println("Hello " + somebody);
	}

	public static double area(double len) {
		return len * len;
	}

	public static double area(double a, double b) {
		return a * b;
	}

}

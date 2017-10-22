package core;

public class MyFirstProgram {
	public static void main(String[] args) {
		hello("Alex");

		Square s = new Square(5);
		System.out.println("Square " + s.l + " = " + area(s));

		Rectangle r = new Rectangle(5, 6);
		System.out.println("Rectangle " + r.a + " and " + r.b + " = " + area(r));

	}

	public static void hello(String somebody) {
		System.out.println("Hello " + somebody);
	}

	public static double area(Square s) {
		return s.l * s.l;
	}

	public static double area(Rectangle r) {
		return r.a * r.b;
	}

}

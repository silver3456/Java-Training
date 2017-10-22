package core;

public class MyFirstProgram {
	public static void main(String[] args) {
		hello("Alex");

		Square s = new Square(5);
		System.out.println("Square " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(5, 6);
		System.out.println("Rectangle " + r.a + " and " + r.b + " = " + r.area());

	}

	public static void hello(String somebody) {
		System.out.println("Hello " + somebody);
	}



}

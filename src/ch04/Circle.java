package ch04;

public class Circle {
	int radius;
	String name;
	public Circle() {
		radius =1; name="";
	}
	
	public Circle(int r, String n) {
		radius = r; name = n;
	}
	
	double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza = new Circle(10,"자바피자");
		
		
	}

}

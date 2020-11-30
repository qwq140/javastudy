package ch04;

public class CalculatorApp {
	public static void main(String[] args) {
		Calculator m = new Calculator();
		int result;
		result=m.add(10,5);
		result=m.multi(result, 20);
		result=m.divid(result, 5);
		result=m.minus(result,100);
		System.out.println(result);
	}
}

package ch02;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //buffer는 String만 , Scanner는 원하는 타입으로 변경가능
		
		System.out.println("금액을 입력하시오");
		
		final int money = sc.nextInt(); // 상수 (변하지 않는 수)
		int rMoney = money;
		int change = 0;
		
		if (money >= 50000) {
			change=rMoney/50000;
			rMoney=rMoney%50000;
			System.out.println("오만원권 "+change+"매");
		}
		if (money >= 10000) {
			change=rMoney/10000;
			rMoney=rMoney%10000;
			System.out.println("만원권 "+change+"매");
		} 
		if (money >= 1000) {
			change=rMoney/1000;
			rMoney=rMoney%1000;
			System.out.println("천원권 "+change+"매");
		} 
		if (money >= 500) {
			change=rMoney/500;
			rMoney=rMoney%500;
			System.out.println("오백원 "+change+"개");
		} 
		if (money >= 100) {
			change=rMoney/100;
			rMoney=rMoney%100;
			System.out.println("백원 "+change+"개");
		} 
		if (money >= 50) {
			change=rMoney/50;
			rMoney=rMoney%50;
			System.out.println("오십원 "+change+"개");
		}
		if (money >= 10) {
			change=rMoney/10;
			rMoney=rMoney%10;
			System.out.println("십원 "+change+"개");
		} 
		if (rMoney >= 1){
			System.out.println("일원 "+rMoney+"개");
		}

	}

}

package ch02;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //buffer�� String�� , Scanner�� ���ϴ� Ÿ������ ���氡��
		
		System.out.println("�ݾ��� �Է��Ͻÿ�");
		
		final int money = sc.nextInt(); // ��� (������ �ʴ� ��)
		int rMoney = money;
		int change = 0;
		
		if (money >= 50000) {
			change=rMoney/50000;
			rMoney=rMoney%50000;
			System.out.println("�������� "+change+"��");
		}
		if (money >= 10000) {
			change=rMoney/10000;
			rMoney=rMoney%10000;
			System.out.println("������ "+change+"��");
		} 
		if (money >= 1000) {
			change=rMoney/1000;
			rMoney=rMoney%1000;
			System.out.println("õ���� "+change+"��");
		} 
		if (money >= 500) {
			change=rMoney/500;
			rMoney=rMoney%500;
			System.out.println("����� "+change+"��");
		} 
		if (money >= 100) {
			change=rMoney/100;
			rMoney=rMoney%100;
			System.out.println("��� "+change+"��");
		} 
		if (money >= 50) {
			change=rMoney/50;
			rMoney=rMoney%50;
			System.out.println("���ʿ� "+change+"��");
		}
		if (money >= 10) {
			change=rMoney/10;
			rMoney=rMoney%10;
			System.out.println("�ʿ� "+change+"��");
		} 
		if (rMoney >= 1){
			System.out.println("�Ͽ� "+rMoney+"��");
		}

	}

}

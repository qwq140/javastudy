package ch03;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		// 데몬 ( Daemon Process ) : 계속돌아가는것 - 웹서버
		int check=0;
		while(check >= 0) {
			int num = sc.nextInt();
			System.out.println("받은 값 : "+num);
			
			check = num;
//			if (num < 0) {
//				break;
//			}
		}
		
	}

}

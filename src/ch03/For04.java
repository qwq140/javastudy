package ch03;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 101; i++) {
			if (i%3==0) {
				sum=sum+i;
			} 			
		}
		System.out.println("sum : "+sum);
	}

}

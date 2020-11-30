package ch07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Hash02 {

	public static void main(String[] args) {
		//랜덤으로 숫자를 생성해주는 클래스
		Random r = new Random();
		HashSet<Integer> lotto = new HashSet<>(6);
		
		while(true) {
			int num = r.nextInt(45)+1; // 0부터 시작
			System.out.println(num);
			
			lotto.add(num);
			
			if(lotto.size()==6)
				break;
		}
		
		Iterator<Integer> it = lotto.iterator(); // 컬렉션 순차 검색
		
		//9, 10, 20, 30, 40, 41
		while(it.hasNext()) { // 값이 있으면 true, 없으면 false
			System.out.print(it.next()+ " ");//현재 인덱스의 값을 리턴 + 인덱스 증가
		}
		
	}

}

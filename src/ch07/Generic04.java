package ch07;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

// 응답 : 성공  (Data)
// 응답 : 실패 (Error)

public class Generic04 {

	List<?> getData(){// ? : 데이터 타입을 미리 정하지 않는다.
		return new ArrayList<String>();
	}
	
	
	
	public static void main(String[] args) {
		

	}

}

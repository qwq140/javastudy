package ch07;

import java.util.HashMap;

public class Hash01 {

	public static void main(String[] args) {
		// 해쉬맵은 key, value로 값을 입력할 수 있음.
		// 찾을 때는 key 값으로 찾을 수 있음.
		HashMap<String, String> hash = new HashMap<>(); //여러 데이터 타입을 받고 싶을때는 Object		
		hash.put("name", "홍길동");
		hash.put("username", "ssar");
		hash.put("phone", "01011112222"); 
		
		//어떤 데이터 타입으로 찾을지 모르기 때문에 Object를 사용
		System.out.println(hash.get("phone"));
		System.out.println(hash.containsKey("name")); 
		System.out.println(hash.containsValue("홍길동"));
	}

}

package ch07;

import lombok.Data;

@Data
class ResponseDto<T>{ // 통신 응답 받을 오브젝트 // T : 정해지지 않은 타입 // 대문자는 규칙
	private int statusCode; // 200(성공), 300(다시 요청), 400(잘못된 요청)
	private T data;
}
// Object 타입을 쓰면 꺼내쓰기가 힘들다.

public class Generic01 {

	public static void main(String[] args) {
		ResponseDto<String> dto = new ResponseDto(); // <String> : T ----> String 타입
		dto.setStatusCode(200);
		dto.setData("사과"); // 데이터 타입을 모르는 상황
		
		
		System.out.println(dto.getStatusCode());
		
		if(dto.getStatusCode()==200) {
			System.out.println(dto.getData());
		}
	}

}

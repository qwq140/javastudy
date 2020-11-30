package ch07;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class Error {
	private String msg;
}

@AllArgsConstructor
@Data
class User {
	private int id;
	private String username;
}

@AllArgsConstructor
@Data
class RespDto<T> { // T : ��Ÿ�ӽ�(new �� ��) ������ Ÿ�� ���� 
	private int code; // 200(����), 400(����) // enum���� �����
	private T data;
}

public class Generic05 {
	
	static RespDto<?> getData(String username) { // ? : �Լ��� ȣ���Ҷ� ������ Ÿ�� ����
		if(username.equals("ssar")) {
			RespDto<User> dto = new RespDto(200, new User(1, "ssar"));
			return dto;
		}else {
			RespDto<Error> dto = new RespDto(400, new Error("���̵� Ʋ�Ƚ��ϴ�."));
			return dto;
		}
	}
	
	public static void main(String[] args) {
		RespDto<?> dto = getData("ssar");
		System.out.println(dto.getCode());
		System.out.println(dto.getData());
	}
}



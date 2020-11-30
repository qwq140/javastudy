package ch07;

import lombok.Data;

@Data
class ResponseDto<T>{ // ��� ���� ���� ������Ʈ // T : �������� ���� Ÿ�� // �빮�ڴ� ��Ģ
	private int statusCode; // 200(����), 300(�ٽ� ��û), 400(�߸��� ��û)
	private T data;
}
// Object Ÿ���� ���� �������Ⱑ �����.

public class Generic01 {

	public static void main(String[] args) {
		ResponseDto<String> dto = new ResponseDto(); // <String> : T ----> String Ÿ��
		dto.setStatusCode(200);
		dto.setData("���"); // ������ Ÿ���� �𸣴� ��Ȳ
		
		
		System.out.println(dto.getStatusCode());
		
		if(dto.getStatusCode()==200) {
			System.out.println(dto.getData());
		}
	}

}

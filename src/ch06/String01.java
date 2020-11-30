package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//DTO = Data Transfer Object = 통신에서 많이 사용됨.
class UserDto{
	private int id;
	private String name;
}

public class String01 {

	public static void main(String[] args) {
		String data = "id:1,name:홍길동";
		
		//파싱 parsing(구문 분석)
		String s[]=data.split(",");
		String d1[]=s[0].split(":");
		String d2[]=s[1].split(":");
		
		int id =Integer.parseInt(d1[1]);
		String name = d2[1];
		UserDto dto = new UserDto();
		dto.setId(id);
		dto.setName(name);
		System.out.println(dto);
	}

}

package jsonex;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Comment{
	private int id;
	private String comment;
}

public class Json01 {

	public static void main(String[] args) {
		Comment ct1 = new Comment(1,"댓글1");
		// 자바 -> JSON(String)
		Gson gson = new Gson();
		String ct1Json = gson.toJson(ct1);
		System.out.println(ct1Json);
		
		// JSON(String) -> 자바
		Comment ct2 = gson.fromJson(ct1Json, Comment.class);
		System.out.println(ct2.getId());
		System.out.println(ct2.getComment());
	}

}

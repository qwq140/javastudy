package jsonex;

import com.google.gson.Gson;

class Comment2{
	private int id;
	private String comment;
	
	public Comment2(int id, String comment) {
		this.id = id;
		this.comment = comment;
	}
	
	public Comment2() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}


public class Json02 {

	public static void main(String[] args) {
		Comment2 ct1 = new Comment2(1,"댓글1");
		//자바 -> JSON
		Gson gson = new Gson();
		String ct1Json = gson.toJson(ct1);
		System.out.println(ct1Json);
		//JSON -> 자바
		Comment2 ct2 = gson.fromJson(ct1Json, Comment2.class);
		System.out.println(ct2.getId());
		System.out.println(ct2.getComment());
	}

}

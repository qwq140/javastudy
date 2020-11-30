package sms;

public class Response {
	String group_id;
	String error_list;
	String success_count;
	String error_count;
	
	
	public static void main(String[] args) {
		String data = "{\"group_id\":\"R2GsGHirXX5RQ6Vc\",\"error_list\":{\"1\":\"1062\"},\"success_count\":0,\"error_count\":1}";
		

		
//		System.out.println(data.indexOf("{"));
//		System.out.println(data.lastIndexOf("}"));
		
		String r=data.substring(data.indexOf("{")+1,data.lastIndexOf("}"));
		
		String str = r.replaceAll("\"","");
//		System.out.println(str);
		
		System.out.println();
		
		String s[]=str.split(",");
//		for (int i = 0; i < s.length; i++) {
//			System.out.println(s[i]);
//		}
		
		String d1[] =s[0].split(":");
		String d2[] =s[1].split(":");
		String d3[] =s[2].split(":");
		String d4[] =s[3].split(":");
		
		for (int i = 0; i < d1.length; i++) {
			System.out.println(d1[i]);
		}
		System.out.println();
		for (int i = 0; i < d2.length; i++) {
			System.out.println(d2[i]);
		}
		System.out.println();
		for (int i = 0; i < d3.length; i++) {
			System.out.println(d3[i]);
		}
		System.out.println();
		for (int i = 0; i < d4.length; i++) {
			System.out.println(d4[i]);
		}
		

	
//		res.group_id = group_id;
//		res.error_list = error_list;
//		res.success_count = success_count;
//		res.error_count = error_count;
		
	}
}

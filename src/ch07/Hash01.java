package ch07;

import java.util.HashMap;

public class Hash01 {

	public static void main(String[] args) {
		// �ؽ����� key, value�� ���� �Է��� �� ����.
		// ã�� ���� key ������ ã�� �� ����.
		HashMap<String, String> hash = new HashMap<>(); //���� ������ Ÿ���� �ް� �������� Object		
		hash.put("name", "ȫ�浿");
		hash.put("username", "ssar");
		hash.put("phone", "01011112222"); 
		
		//� ������ Ÿ������ ã���� �𸣱� ������ Object�� ���
		System.out.println(hash.get("phone"));
		System.out.println(hash.containsKey("name")); 
		System.out.println(hash.containsValue("ȫ�浿"));
	}

}

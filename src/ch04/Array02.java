package ch04;
class Police extends Job{
	String name = "����";
	
}

class Doctor extends Job{
	String name = "�ǻ�";
}

class Job{
	
}

public class Array02 {

	public static void main(String[] args) {
		Job[] j = new Job[2];
		j[0] = new Doctor();
		j[1] = new Police();
		
	}
}

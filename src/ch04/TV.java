package ch04;
//�ǽ����� 1
public class TV {
	private String name;
	private int year;
	private int inch;
	public TV(String name, int year, int inch) {
		this.name = name;
		this.year = year;
		this.inch = inch;
	}
	public TV() {
	
	}
	void show() {
		System.out.println(name+"���� ���� "+year+"���� "+inch+"��ġ TV");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	
}

package ch04;

public class Song {
	private String title;
	private String artist;
	private int year;
	private String country;
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	public Song() {
	
	}
	void show() {
		System.out.println(year+"�� "+country+"������ "+artist+"�� �θ� "+title);
	}
	
}

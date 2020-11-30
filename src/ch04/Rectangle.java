package ch04;

public class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public Rectangle() {
	}
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	void show() {
		System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
	}
	
	int square() {
		return width*height;
	}
	
//	boolean contains(Rectangle r) {
//		if((x<r.x)&&(y<r.y))
//			if(((x+width)>(r.x+r.width))&&((y+height)>(r.y+r.width)))
//				return true;
//	}
	
}

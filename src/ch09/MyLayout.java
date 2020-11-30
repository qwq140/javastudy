package ch09;


// new ¾ÈµÊ.
public enum MyLayout {
	WEST("West"), 
	EAST("East"), 
	SOUTH("South"),
	NORTH("North"),
	CENTER("Center");
	
	String value;
	
	private MyLayout(String value) {
		this.value = value;
	}
	
}

package star1;

class Marine {
	// field : property 는 private로 만든다. 마법x
	private String name;
	private int hp;
	private int attack;
	
	// this는 heap을 가르킨다.
	public Marine(String name, int hp, int attack) {
		this.name = name; 
		this.hp = hp;
		this.attack = attack;
	}
	
	public Marine() {}
}

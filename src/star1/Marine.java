package star1;

class Marine {
	// field : property �� private�� �����. ����x
	private String name;
	private int hp;
	private int attack;
	
	// this�� heap�� ����Ų��.
	public Marine(String name, int hp, int attack) {
		this.name = name; 
		this.hp = hp;
		this.attack = attack;
	}
	
	public Marine() {}
}

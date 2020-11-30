package star2;

interface StarUnit {
	// hp수정, hp값 호출, attack값 호출, name 값 호출
	public abstract void setHp(int hp);
	public abstract int getHp();
	public abstract int getAttack();
	public abstract String getName();
}

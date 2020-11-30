package composite;

//다형성 성립 : 상속 , 다형성 성립x : 콤포지션
public class BigBurger extends Burger{
	
	public BigBurger() {
		this(2000,"빅버거"); // 밑 생성자 때림
	}
	public BigBurger(int price, String desc) {
		super(price, desc); // 부모를 때림
	}
}

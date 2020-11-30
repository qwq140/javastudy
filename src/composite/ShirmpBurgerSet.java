package composite;

public class ShirmpBurgerSet {
	
	private ShrimpBurger shrimpburger;
	private Potato potato;
	private Coke coke;
	
	public ShirmpBurgerSet() {
		this(
				
				new ShrimpBurger(),
				new Potato(),
				new Coke()
				
				);
		
	}

	public ShirmpBurgerSet(ShrimpBurger shrimpburger, Potato potato, Coke coke) {
		this.shrimpburger = shrimpburger;
		this.potato=potato;
		this.coke = coke;
		
	}
}

package virtualpets.amok;

public class OrganicDog extends Dog implements OrganicPet {

	private int hunger;
	private int thirst;
	private int wasteLevel;
	private int boredom;

	public OrganicDog(String name, int hunger, int thirst) {
		super(name);
		this.hunger = hunger;
		this.thirst = thirst;
		wasteLevel = 10;
		boredom = 30;
	}

	public OrganicDog(String name, int hunger, int thirst, int wasteLevel, int boredom) {
		super(name);
		this.hunger = hunger;
		this.thirst = thirst;
		this.wasteLevel = wasteLevel;
		this.boredom = boredom;
	}

	@Override
	public int feed() {
		hunger -= 10;
		if (hunger < 0) {
			hunger = 0;
		}
		return hunger;
	}

	@Override
	public int water() {
		thirst -= 10;
		if (thirst < 0) {
			thirst = 0;
		}
		return thirst;
	}

	@Override
	public void tick() {
		hunger += 5;
		thirst += 5;
		wasteLevel += 5;
		boredom += 5;
	}

	@Override
	public int walk() {
		boredom -= 20;
		if (boredom < 0) {
			boredom = 0;
		}
		return boredom;

	}

}

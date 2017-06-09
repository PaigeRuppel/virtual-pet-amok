package virtualpets.amok;

public class OrganicCat extends Cat implements OrganicPet {

	private int hunger;
	private int thirst;
	private int wasteLevel;

	public OrganicCat(String name, int hunger, int thirst) {
		super(name);
		this.hunger = hunger;
		this.thirst = thirst;
		wasteLevel = 10;
	}

	@Override
	public int feed() {
		hunger -= 10;
		if (hunger < 10) {
			hunger = 10;
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
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

}

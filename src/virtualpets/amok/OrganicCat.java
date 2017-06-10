package virtualpets.amok;

public class OrganicCat extends Cat implements OrganicPet {

	private int hunger;
	private int thirst;
	private int litterboxWaste;
	private int boredom;

	public OrganicCat(String name, int hunger, int thirst) {
		super(name);
		this.hunger = hunger;
		this.thirst = thirst;
		litterboxWaste = 0;
		boredom = 10;
		setHealth();
	}

	@Override
	public int setHealth() {
		health = (100 - (hunger + thirst + litterboxWaste + boredom) / 4);
		return health;
	}

	@Override
	public int feed() {
		hunger -= 15;
		if (hunger < 0) {
			hunger = 0;
		}
		setHealth();
		return hunger;
	}

	@Override
	public int water() {
		thirst -= 15;
		if (thirst < 0) {
			thirst = 0;
		}
		setHealth();
		return thirst;
	}

	@Override
	public void tick() {
		hunger += 5;
		thirst += 5;
		litterboxWaste += 5;
		boredom += 5;
		setHealth();
	}

	public int cleanLitterBox() {
		setHealth();
		return litterboxWaste = 0;
	}
	
	@Override
	public int play() {
		boredom -= 10;
		if (boredom < 0) {
			boredom = 0;
		}
		setHealth();
		return boredom;
	}

	public int getLitterboxWaste() {
		return litterboxWaste;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	@Override
	public String detailedPetStats() {
		return getName() + "\t\t\t | \t " + hunger + "\t\t\t | \t " + thirst + "\t\t\t | \t " + boredom + "\t\t\t | \t "
				+ litterboxWaste;
	}

}

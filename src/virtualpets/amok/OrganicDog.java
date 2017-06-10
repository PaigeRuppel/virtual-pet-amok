package virtualpets.amok;

public class OrganicDog extends Dog implements OrganicPet {

	private int hunger;
	private int thirst;
	private int cageWasteLevel;
	private int boredom;

	public OrganicDog(String name, int hunger, int thirst) {
		super(name);
		this.hunger = hunger;
		this.thirst = thirst;
		cageWasteLevel = 10;
		boredom = 30;
		setHealth();
	}

	public OrganicDog(String name, int hunger, int thirst, int wasteLevel, int boredom) {
		super(name);
		this.hunger = hunger;
		this.thirst = thirst;
		this.cageWasteLevel = wasteLevel;
		this.boredom = boredom;
		setHealth();
	}

	@Override
	public int setHealth() {
		health = (100 - ((hunger + thirst + cageWasteLevel + boredom) / 4));
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

	public int getHunger() {
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
		cageWasteLevel += 5;
		boredom += 5;
		setHealth();
	}

	@Override
	public int walk() {
		boredom -= 20;
		if (boredom < 0) {
			boredom = 0;
		}
		setHealth();
		return boredom;
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

	public int getBoredom() {
		return boredom;
	}

	public int getThirst() {
		return thirst;
	}

	public int cleanCage() {
		setHealth();
		return cageWasteLevel = 0;
	}

	public int getCageWasteLevel() {
		return cageWasteLevel;
	}

	@Override
	public String detailedPetStats() {
		return getName() + "\t\t\t | \t " + hunger + "\t\t\t | \t " + thirst + "\t\t\t | \t " + boredom + "\t\t\t | \t "
				+ cageWasteLevel;
	}

}

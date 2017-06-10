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
		setHealthNeed();
	}
	
	public OrganicDog(String name, int hunger, int thirst, int wasteLevel, int boredom) {
		super(name);
		this.hunger = hunger;
		this.thirst = thirst;
		this.cageWasteLevel = wasteLevel;
		this.boredom = boredom;
		setHealthNeed();
	}

	@Override
	public int setHealthNeed() {
		return ((hunger + thirst + cageWasteLevel + boredom) / 4);
	}

	@Override
	public int feed() {
		hunger -= 10;
		if (hunger < 0) {
			hunger = 0;
		}
		setHealthNeed();
		return hunger;
	}

	public int getHunger() {
		return hunger;
	}

	@Override
	public int water() {
		thirst -= 10;
		if (thirst < 0) {
			thirst = 0;
		}
		setHealthNeed();
		return thirst;
	}

	@Override
	public void tick() {
		hunger += 5;
		thirst += 5;
		cageWasteLevel += 5;
		boredom += 5;
		setHealthNeed();
	}

	@Override
	public int walk() {
		boredom -= 20;
		if (boredom < 0) {
			boredom = 0;
		}
		setHealthNeed();
		return boredom;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getThirst() {
		return thirst;
	}

	public int cleanCage() {
		setHealthNeed();
		return cageWasteLevel = 0;
	}

	public int getCageWasteLevel() {
		return cageWasteLevel;
	}

	@Override
	public String detailedPetStats() {
		return getName() + "\t\t | \t " + hunger + "\t\t\t | \t " + thirst + "\t\t | \t " + boredom;
	}
	


}

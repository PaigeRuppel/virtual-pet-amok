package virtualpets.amok;

public class OrganicCat extends Cat implements OrganicPet {

	private int hunger;
	private int thirst;
	private int litterboxWaste;

	public OrganicCat(String name, int hunger, int thirst) {
		super(name);
		this.hunger = hunger;
		this.thirst = thirst;
		litterboxWaste = 10;
		setHealthNeed();
	}

	@Override
	public int setHealthNeed() {
		return ((hunger + thirst + litterboxWaste) / 3);
	}

	@Override
	public int feed() {
		hunger -= 10;
		if (hunger < 10) {
			hunger = 10;
		}
		setHealthNeed();
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
		litterboxWaste += 5;
		setHealthNeed();
	}

	public int cleanLitterBox() {
		setHealthNeed();
		return litterboxWaste = 0;
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
		return getName() + "\t\t | \t " + hunger + "\t\t\t | \t " + thirst + "\t\t | \t " + litterboxWaste;
	}

}

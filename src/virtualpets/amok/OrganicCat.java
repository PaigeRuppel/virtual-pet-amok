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
		litterboxWaste += 5;
	}

	public int cleanLitterBox() {
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
	public String indPetStats() {
		return getName() + "\t\t | \t " + hunger + "\t\t\t | \t " + thirst + "\t\t | \t " + litterboxWaste;
	}

}

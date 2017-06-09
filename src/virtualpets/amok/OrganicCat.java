package virtualpets.amok;

public class OrganicCat implements OrganicPet {

	private String name;
	private int hunger;
	private int thirst;

	public OrganicCat(String name, int hunger, int thirst) {
		this.name = name;
		this.hunger = hunger;
		this.thirst = thirst;
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

}

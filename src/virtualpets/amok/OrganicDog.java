package virtualpets.amok;

public class OrganicDog extends Dog implements OrganicPet {

	private String name;
	private int hunger;
	private int thirst;

	public OrganicDog(String name, int hunger, int thirst) {
		super(name);
		this.hunger = hunger;
		this.thirst = thirst;
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

}

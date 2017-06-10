package virtualpets.amok;

public abstract class VirtualPet {

	private String name;
	protected int health;
	// scale of 0 - 100, with 100 being in desperate need/probably dead

	public VirtualPet(String name) {
		this.name = name;
		health = 0;
	}

	@Override
	public String toString() {
		return getName() + " " + getClass().getSimpleName();
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public abstract int setHealth();

	public abstract void tick();

//	public abstract String detailedPetStats();

	public String generalPetHealthOnlyStats() {
		return getName() + "\t\t\t | \t " + this.getClass().getSimpleName() + "\t\t | \t " + getHealth();
	}
}

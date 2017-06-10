package virtualpets.amok;

public abstract class VirtualPet {

	private String name;
	protected int healthNeed;
	// scale of 0 - 100, with 100 being in desperate need/probably dead

	public VirtualPet(String name) {
		this.name = name;
		healthNeed = 0;
	}

	@Override
	public String toString() {
		return getName() + " " + getClass().getSimpleName();
	}

	public String getName() {
		return name;
	}

	public int getHealthNeed() {
		return healthNeed;
	}

	public void setHealthNeed(int healthNeed) {
		this.healthNeed = healthNeed;
	}

	public abstract void tick();
	
	public abstract String indPetStats();

}

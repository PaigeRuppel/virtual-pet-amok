package virtualpets.amok;

public abstract class VirtualPet {

	private String name;

	public VirtualPet(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return getName() + " " + getClass().getSimpleName();
	}

	public String getName() {
		return name;
	}
	
	public abstract void tick();

}

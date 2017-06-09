package virtualpets.amok;

public class VirtualPet {

	private String name;

	public VirtualPet(String name) {
		this.name = name;
	}

	public String toString() {
		return getName() + " " + getClass().getSimpleName();
	}

	public String getName() {
		return name;
	}

}

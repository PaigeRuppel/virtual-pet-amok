package virtualpets.amok;

public abstract class Dog extends VirtualPet {

	public Dog(String name) {
		super(name);
	}

	public String woof() {
		return "woof!! I am " + getName();
	}
}

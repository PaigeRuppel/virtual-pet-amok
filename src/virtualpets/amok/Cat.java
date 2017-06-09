package virtualpets.amok;

public abstract class Cat extends VirtualPet {

	public Cat(String name) {
		super(name);
	}

	public String meow() {
		return "meow!! I am " + getName();
	}
}

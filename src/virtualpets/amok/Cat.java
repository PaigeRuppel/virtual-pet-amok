package virtualpets.amok;

public abstract class Cat extends VirtualPet {

	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public String meow() {
		return "meow!! I am " + name;
	}
}

package virtualpets.amok;

public class OrganicDog implements OrganicPet {

	private String name;
	private int hunger;
	private int thirst;
	
	public OrganicDog(String name, int hunger, int thirst) {
		this.name = name;
		this.hunger = hunger;
		this.thirst = thirst;
	}

	@Override
	public int feed() {
		hunger -= 10;
		
		return hunger;
	}
	
}

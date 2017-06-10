package virtualpets.amok;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	// show roster of all pets
	Map<String, VirtualPet> allPets = new HashMap<>();
	// walk all dogs
	Map<String, Dog> allDogs = new HashMap<>();
	// play all cats
	Map<String, Cat> allCats = new HashMap<>();
	// feed/water all organic pets
	Map<String, OrganicPet> allOrganicPets = new HashMap<>();
	// oil/maintain all robotic pets
	Map<String, RoboticPet> allRoboticPets = new HashMap<>();
	// clean litterbox
	Map<String, OrganicCat> organicCats = new HashMap<>();
	Map<String, OrganicDog> organicDogs = new HashMap<>();

	public void intake(VirtualPet pet) {
		allPets.put(pet.getName().toLowerCase(), pet);
		String className = pet.getClass().getSimpleName();
		if (className.equals("OrganicCat")) {
			organicCats.put(pet.getName().toLowerCase(), (OrganicCat) pet);
			allCats.put(pet.getName().toLowerCase(), (Cat) pet);
			allOrganicPets.put(pet.getName().toLowerCase(), (OrganicCat) pet);
		}
		if (className.equals("OrganicDog")) {
			organicDogs.put(pet.getName().toLowerCase(), (OrganicDog) pet);
			allDogs.put(pet.getName().toLowerCase(), (Dog) pet);
			allOrganicPets.put(pet.getName().toLowerCase(), (OrganicDog) pet);
		}
		if (className.equals("RoboCat")) {
			allCats.put(pet.getName().toLowerCase(), (Cat) pet);
			allRoboticPets.put(pet.getName().toLowerCase(), (RoboCat) pet);
		}
		if (className.equals("RoboDog")) {
			allDogs.put(pet.getName().toLowerCase(), (Dog) pet);
			allRoboticPets.put(pet.getName().toLowerCase(), (RoboDog) pet);
		}
	}

	public VirtualPet getPet(String name) {
		return allPets.get(name.toLowerCase());
	}

	public String getMaps() {
		String message = "All pets " + allPets.entrySet() + "\nAll cats " + allCats.entrySet() + "\nAll dogs "
				+ allDogs.entrySet() + "\nAll organic pets " + allOrganicPets.entrySet() + "\nAll robotic pets "
				+ allRoboticPets.entrySet() + "\nAll organic cats " + organicCats.entrySet() + "\nAll organic dogs " + organicDogs.entrySet();
		return message;
	}

	public void walkDogs() {
		for (Dog current : allDogs.values()) {
			current.walk();
		}
	}

	public void feedOrganicPets() {
		for (OrganicPet current : allOrganicPets.values()) {
			current.feed();
		}
	}

	public void waterOrganicPets() {
		for (OrganicPet current : allOrganicPets.values()) {
			current.water();
		}
	}

	public void oilRoboticPets() {
		for (RoboticPet current : allRoboticPets.values()) {
			current.applyOil();
		}
	}

	public void maintainRoboticPets() {
		for (RoboticPet current : allRoboticPets.values()) {
			current.maintain();
		}
	}

	public void cleanLitterBoxes() {
		for (OrganicCat current : organicCats.values()) {
			current.cleanLitterBox();
		}
	}
	
	public void cleanCages() {
		for (OrganicDog current : organicDogs.values()) {
			current.cleanCage();
		}
	}

}

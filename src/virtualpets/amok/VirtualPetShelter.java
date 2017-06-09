package virtualpets.amok;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> allPets = new HashMap<>();

	Map<String, Dog> allDogs = new HashMap<>(); // walk all dogs

	Map<String, Cat> allCats = new HashMap<>(); // play all cats

	Map<String, OrganicPet> allOrganicPets = new HashMap<>();

	Map<String, RoboticPet> allRoboticPets = new HashMap<>();

	public void intake(VirtualPet pet) {
		allPets.put(pet.getName().toLowerCase(), pet);
		String className = pet.getClass().getSimpleName();
		if (className.equals("OrganicCat")) {
			allCats.put(pet.getName().toLowerCase(), (Cat) pet);
			allOrganicPets.put(pet.getName().toLowerCase(), (OrganicCat) pet);
		}
		if (className.equals("OrganicDog")) {
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
				+ allRoboticPets.entrySet();
		return message;
	}

}

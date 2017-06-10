package virtualpets.amok;

import java.util.Scanner;

public class VirtualPetShelterAmokApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPetShelter myShelter = new VirtualPetShelter();

		callInstructions();

		writeLine("Are you ready to begin the game? Type \"Yes\" to begin: ");
		String begin = input.nextLine();

		if (begin.toLowerCase().equals("yes")) {
			writeLine("Great! Here are the current pets in the shelter: ");
		} else {
			writeLine("Please come back to the shelter soon!");
			System.exit(0);
		}

		VirtualPet bear = new OrganicDog("Bear", 20, 40, 15, 20);
		myShelter.intake(bear);

		VirtualPet guy = new OrganicDog("Guy", 40, 10, 10, 15);
		myShelter.intake(guy);

		VirtualPet kali = new OrganicCat("Kali", 40, 30);
		myShelter.intake(kali);

		VirtualPet fern = new OrganicCat("Fern", 10, 50);
		myShelter.intake(fern);

		VirtualPet tiny = new RoboCat("Tiny", 20, 20);
		myShelter.intake(tiny);

		VirtualPet sam = new RoboCat("Sam", 20, 20);
		myShelter.intake(sam);

		VirtualPet sue = new RoboDog("Sue", 30, 30);
		myShelter.intake(sue);

		VirtualPet gia = new RoboDog("Gia", 25, 30);
		myShelter.intake(gia);

		while (!myShelter.allPets.isEmpty()) {

			writeLine("Here are the current pets in Paige's Pet Palace: ");
			writeLine(myShelter.allPetsHealthMenu());

			writeLine("What would you like to do with the pets?");

			callInitialOptionsMenu();
			String intialCommand = input.nextLine();
			// checkForQuit() - need to write this method
			switch (intialCommand) {
			case ("1"):
				writeLine(myShelter.roboPetsHealthMenu());
				callCommandMenu();
				break;
			case ("2"):
				writeLine(myShelter.organicPetsHealthMenu());
				callCommandMenu();
				break;
			case ("3"):
				callCommandMenu();
				break;
			}

			String secondCommand = input.nextLine();
			switch (secondCommand) {
			case ("1"):
				myShelter.feedOrganicPets();
				break;
			case ("2"):
				myShelter.waterOrganicPets();
				break;
			case ("3"):
				myShelter.walkDogs();
				break;
			case ("4"):
				myShelter.cleanLitterBox();
				break;
			case ("5"):
				myShelter.cleanCages();
				break;
			case ("6"):
				myShelter.playWithOrganicPets();
			case ("7"):
				myShelter.oilRoboticPets();
				break;
			case ("8"):
				myShelter.maintainRoboticPets();
				break;
			}

			writeLine("Time is advancing, and all of your pets needs are increasing!");
			myShelter.tick();

		}

		input.close();

	}

	public static void callInstructions() {
		writeLine("Welcome to Paige's Pet Palace!");
		writeLine("- This is a virtual pet shelter - the goal is to care for all of these homeless pets.");
		writeLine("- In this shelter, you must care for both organic cats and dogs and robotic cats and dogs");
		writeLine(" - Robotic and Organic pets have different individual needs");
		writeLine(
				" - All Pets have a general health status - 100 is perfect health and 0 means that pet will run AMOK!");
		writeLine(" - The health status is negatively impacted as other needs increase");
		writeLine("- Caring for the pets is carried out by following the command menus");
		writeLine("\n\n");
	}

	public static void writeLine(String message) {
		System.out.println(message);
	}

	public static void callInitialOptionsMenu() {
		writeLine("To choose an option, type the number next to your desired action: ");
		writeLine("1. View expanded stats for Robotic Pets");
		writeLine("2. View expanded stats for Organic Pets");
		writeLine("3. Choose a command to care for pets without seeing expanded stats");
	}

	public static void callCommandMenu() {
		writeLine("To choose an option, type the number next to your desired action: ");
		writeLine("1. Feed all the organic pets (decreases hunger)");
		writeLine("2. Water all the organic pets (decreases thirst)");
		writeLine(
				"3. Walk all the dogs (decreases boredom for organic dogs, lubricates (decreases oil need) for robotic dogs)");
		writeLine("4. Clean the organic cats' litterbox (resets cleanliness to 0)");
		writeLine("5. Clean the organic dogs' cages (resets cleanliness to 0)");
		writeLine("6. Play with the organic dogs and give the organic cats catnip (decreases boredom)");
		writeLine("7. Oil all of the robotic pets (decreases oil need)");
		writeLine("8. Perform maintenance on all of the robotic pets (decreases maintenance need)");
	}
}

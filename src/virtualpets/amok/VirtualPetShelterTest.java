package virtualpets.amok;


import org.junit.Assert;
import org.junit.Test;

public class VirtualPetShelterTest {

	@Test
	public void shouldReturnSimbaInAllPetsAllCatsAllOrganic() {
		// arrange
		VirtualPet underTest = new OrganicCat("Simba", 20, 20);
		VirtualPetShelter testShelter = new VirtualPetShelter();
		// act
		testShelter.intake(underTest);
		String response = testShelter.getMaps();
		// assert
		Assert.assertEquals( "All pets [simba=Simba OrganicCat]"
		+ "\nAll cats [simba=Simba OrganicCat]"
		+ "\nAll dogs []"
		+ "\nAll organic pets [simba=Simba OrganicCat]"
		+ "\nAll robotic pets []", response);		
	}
	
	@Test
	public void shouldReturnFidoInAllPetsAllDogsAllRobotic() {
		VirtualPet underTest = new RoboDog("Fido", 10, 10);
		VirtualPetShelter testShelter = new VirtualPetShelter();
		testShelter.intake(underTest);
		String response = testShelter.getMaps();
		Assert.assertEquals( "All pets [fido=Fido RoboDog]"
		+ "\nAll cats []"
		+ "\nAll dogs [fido=Fido RoboDog]"
		+ "\nAll organic pets []"
		+ "\nAll robotic pets [fido=Fido RoboDog]", response);	
	}
	
	@Test
	public void shouldReturnKitInAllPetsAllCatsAllRobotic() {
		VirtualPet underTest = new RoboCat("Kit", 10, 10);
		VirtualPetShelter testShelter = new VirtualPetShelter();
		testShelter.intake(underTest);
		String response = testShelter.getMaps();
		Assert.assertEquals( "All pets [kit=Kit RoboCat]"
		+ "\nAll cats [kit=Kit RoboCat]"
		+ "\nAll dogs []"
		+ "\nAll organic pets []"
		+ "\nAll robotic pets [kit=Kit RoboCat]", response);	
	}
	
	@Test
	public void shouldReturnSnoopyInAllPetsAllDogsAllOrganic() {
		VirtualPet underTest = new OrganicDog("Snoopy", 10, 10);
		VirtualPetShelter testShelter = new VirtualPetShelter();
		testShelter.intake(underTest);
		String response = testShelter.getMaps();
		Assert.assertEquals( "All pets [snoopy=Snoopy OrganicDog]"
		+ "\nAll cats []"
		+ "\nAll dogs [snoopy=Snoopy OrganicDog]"
		+ "\nAll organic pets [snoopy=Snoopy OrganicDog]"
		+ "\nAll robotic pets []", response);	
	}
	
	@Test
	public void shouldReturnOrganicDogWithBoredom10AfterWalk() {
		VirtualPet underTest = new OrganicDog("Snoopy", 10, 10);
		VirtualPetShelter testShelter = new VirtualPetShelter();
		testShelter.intake(underTest);
		testShelter.walkDogs();
		int boredomAfterWalk = ((OrganicDog) underTest).getBoredom();
		Assert.assertEquals( 10, boredomAfterWalk);	
	}
	
	@Test
	public void shouldReturnRoboDogWithOil10AfterWalk() {
		VirtualPet underTest = new RoboDog("Fido", 15, 15);
		VirtualPetShelter testShelter = new VirtualPetShelter();
		testShelter.intake(underTest);
		testShelter.walkDogs();
		int oilNeedAfterWalk = ((RoboDog) underTest).getOilNeed();
		Assert.assertEquals( 10, oilNeedAfterWalk);	
	} 
	
	@Test
	public void shouldReturnOrgDogWithHunger10AfterFeed() {
		VirtualPet underTest = new OrganicDog("Snoopy", 20, 20);
		VirtualPetShelter testShelter = new VirtualPetShelter();
		testShelter.intake(underTest);
		testShelter.feedOrganicPets();
		int hungerAfterFeed = ((OrganicDog) underTest).getHunger();
		Assert.assertEquals( 10, hungerAfterFeed);	
	} 
	
	@Test
	public void shouldReturnOrgCatWithHunger10AfterFeed() {
		VirtualPet underTest = new OrganicCat("Simba", 20, 20);
		VirtualPetShelter testShelter = new VirtualPetShelter();
		testShelter.intake(underTest);
		testShelter.feedOrganicPets();
		int hungerAfterFeed = ((OrganicCat) underTest).getHunger();
		Assert.assertEquals( 10, hungerAfterFeed);	
	} 

}

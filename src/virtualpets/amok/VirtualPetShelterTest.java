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

}

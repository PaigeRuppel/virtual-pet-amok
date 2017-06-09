package virtualpets.amok;

import org.junit.Assert;
import org.junit.Test;

public class OrganicDogTest {

	@Test
	public void shouldReturnHunger10() {
		// arrange
		OrganicDog underTest = new OrganicDog("Rover", 20, 20);
		// act
		int hungerReturn = underTest.feed();
		// assert
		Assert.assertEquals(10, hungerReturn);		
	}
	
	@Test
	public void shouldReturnHunger0() {
		// arrange
		OrganicDog underTest = new OrganicDog("Rover", 5, 5);
		// act
		int hungerReturn = underTest.feed();
		// assert
		Assert.assertEquals(0, hungerReturn);		
	}
	
	@Test
	public void shouldReturnThirst10() {
		// arrange
		OrganicDog underTest = new OrganicDog("Rover", 20, 20);
		// act
		int thirstReturn = underTest.water();
		// assert
		Assert.assertEquals(10, thirstReturn);		
	}
	
	@Test
	public void shouldReturnThirst0() {
		// arrange
		OrganicDog underTest = new OrganicDog("Rover", 5, 5);
		// act
		int thirstReturn = underTest.water();
		// assert
		Assert.assertEquals(0, thirstReturn);		
	}
	
	@Test
	public void shouldReturnWoofRover() {
		OrganicDog underTest = new OrganicDog("Rover", 20, 20);
		String response = underTest.woof();
		Assert.assertEquals("woof!! I am Rover", response);
	}
	
	@Test
	public void shouldReturnRoverOrganicDog() {
		OrganicDog underTest = new OrganicDog("Rover", 20, 20);
		String response = underTest.toString();
		Assert.assertEquals("Rover OrganicDog", response);
	}
}

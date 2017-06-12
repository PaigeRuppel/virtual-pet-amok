package virtualpets.amok;

import org.junit.Assert;
import org.junit.Test;

public class OrganicDogTest {

	@Test
	public void shouldReturnHunger10() {
		// arrange
		OrganicDog underTest = new OrganicDog("Rover", 25, 25);
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
		OrganicDog underTest = new OrganicDog("Rover", 25, 25);
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

	@Test
	public void shouldReturnBoredom10AfterWalk() {
		OrganicDog underTest = new OrganicDog("Rover", 20, 20);
		int boredomAfterWalk = underTest.walk();
		Assert.assertEquals(10, boredomAfterWalk);
	}

	@Test
	public void shouldReturnBoredom0AfterWalk() {
		OrganicDog underTest = new OrganicDog("Rover", 20, 20, 10, 0);
		int boredomAfterWalk = underTest.walk();
		Assert.assertEquals(0, boredomAfterWalk);
	}

	@Test
	public void shouldReturnHealthNeed85() {
		OrganicDog underTest = new OrganicDog("Rover", 20, 20, 20, 0);
		int healthNeed = underTest.getHealth();
		Assert.assertEquals(85, healthNeed);
	}
}

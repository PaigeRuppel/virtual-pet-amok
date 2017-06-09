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
}

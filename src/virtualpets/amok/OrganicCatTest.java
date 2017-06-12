package virtualpets.amok;

import org.junit.Assert;
import org.junit.Test;

public class OrganicCatTest {

	@Test
	public void shouldReturnHunger10() {
		// arrange
		OrganicCat underTest = new OrganicCat("Simba", 25, 25);
		// act
		int hungerReturn = underTest.feed();
		// assert
		Assert.assertEquals(10, hungerReturn);		
	}
	
	@Test
	public void shouldReturnHunger0() {
		// arrange
		OrganicCat underTest = new OrganicCat("Simba", 5, 5);
		// act
		int hungerReturn = underTest.feed();
		// assert
		Assert.assertEquals(0, hungerReturn);		
	}
	
	@Test
	public void shouldReturnThirst10() {
		// arrange
		OrganicCat underTest = new OrganicCat("Simba", 25, 25);
		// act
		int thirstReturn = underTest.water();
		// assert
		Assert.assertEquals(10, thirstReturn);		
	}
	
	@Test
	public void shouldReturnThirst0() {
		// arrange
		OrganicCat underTest = new OrganicCat("Simba", 5, 5);
		// act
		int thirstReturn = underTest.water();
		// assert
		Assert.assertEquals(0, thirstReturn);		
	}
	
	@Test
	public void shouldReturnHunger20FromTick() {
		// arrange
		OrganicCat underTest = new OrganicCat("Simba", 18, 18);
		// act
		underTest.tick();
		int hungerReturn = underTest.getHunger();
		// assert
		Assert.assertEquals(20, hungerReturn);		
	}
	
	@Test
	public void shouldReturnThirst20FromTick() {
		// arrange
		OrganicCat underTest = new OrganicCat("Simba", 18, 18);
		// act
		underTest.tick();
		int thirstReturn = underTest.getThirst();
		// assert
		Assert.assertEquals(20, thirstReturn);		
	}
}

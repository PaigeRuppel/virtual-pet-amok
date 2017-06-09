package virtualpets.amok;

import org.junit.Assert;
import org.junit.Test;

public class RoboDogTest {

	@Test
	public void shouldReturnOilLevel1() {
		// arrange
		RoboDog underTest = new RoboDog();
		// act
		int oilLevel = underTest.getOilLevel();
		// assert
		Assert.assertEquals(1, oilLevel);
	}
	
	@Test 
	public void shouldReturnOilLevel() {
		//arrange
		RoboDog underTest = new RoboDog();
		//act
		int oilLevel = underTest.getOilLevel();
		//assert
		Assert.assertEquals(oilLevel, oilLevel);
	}
}

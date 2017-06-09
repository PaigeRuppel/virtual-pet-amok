package virtualpets.amok;

import org.junit.Assert;
import org.junit.Test;

public class RoboDogTest {

	@Test
	public void shouldReturnOilLevel10() {
		// arrange
		RoboDog underTest = new RoboDog("Bill", 20, 20);
		// act
		int newOilLevel = underTest.applyOil();
		// assert
		Assert.assertEquals(10, newOilLevel);
	}
}

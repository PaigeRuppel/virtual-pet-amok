package virtualpets.amok;

import org.junit.Assert;
import org.junit.Test;

public class RoboCatTest {

	@Test
	public void shouldReturnOilLevel10() {
		// arrange
		RoboCat underTest = new RoboCat("Kit", 20, 20);
		// act
		int newOilLevel = underTest.applyOil();
		// assert
		Assert.assertEquals(10, newOilLevel);
	}

	@Test
	public void shouldReturnMaintenanceLevel10() {
		// arrange
		RoboCat underTest = new RoboCat("Kit", 20, 20);
		// act
		int newMaintenanceLevel = underTest.maintain();
		// assert
		Assert.assertEquals(10, newMaintenanceLevel);
	}
}

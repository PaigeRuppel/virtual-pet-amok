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

	@Test
	public void shouldReturnMaintenanceLevel10() {
		// arrange
		RoboDog underTest = new RoboDog("Bill", 20, 20);
		// act
		int newMaintenanceLevel = underTest.maintain();
		// assert
		Assert.assertEquals(10, newMaintenanceLevel);
	}
	
	@Test
	public void shouldReturnOilLevel0() {
		RoboDog underTest = new RoboDog("Bill", 5, 5);
		int newMaintenanceLevel = underTest.maintain();
		Assert.assertEquals(0,  newMaintenanceLevel);
	}
	
	@Test
	public void shouldReturnMaintenanceLevel0() {
		RoboDog underTest = new RoboDog("Bill", 5, 5);
		int newOilLevel = underTest.applyOil();
		Assert.assertEquals(0, newOilLevel);
	}
}

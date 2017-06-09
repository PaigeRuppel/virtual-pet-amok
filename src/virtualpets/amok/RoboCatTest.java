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

	@Test
	public void shouldReturnOilLevel0() {
		RoboCat underTest = new RoboCat("Kit", 5, 5);
		int newMaintenanceLevel = underTest.maintain();
		Assert.assertEquals(0, newMaintenanceLevel);
	}

	@Test
	public void shouldReturnMaintenanceLevel0() {
		RoboCat underTest = new RoboCat("Kit", 5, 5);
		int newOilLevel = underTest.applyOil();
		Assert.assertEquals(0, newOilLevel);
	}

	@Test
	public void shouldReturnMeowKit() {
		RoboCat underTest = new RoboCat("Kit", 20, 20);
		String response = underTest.meow();
		Assert.assertEquals("meow!! I am Kit", response);
	}
}

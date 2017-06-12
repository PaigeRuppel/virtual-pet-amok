package virtualpets.amok;

import org.junit.Assert;
import org.junit.Test;

public class RoboDogTest {

	@Test
	public void shouldReturnOilLevel10() {
		// arrange
		RoboDog underTest = new RoboDog("Bill", 30, 30);
		// act
		int newOilLevel = underTest.applyOil();
		// assert
		Assert.assertEquals(10, newOilLevel);
	}

	@Test
	public void shouldReturnMaintenanceLevel10() {
		// arrange
		RoboDog underTest = new RoboDog("Bill", 30, 30);
		// act
		int newMaintenanceLevel = underTest.maintain();
		// assert
		Assert.assertEquals(10, newMaintenanceLevel);
	}

	@Test
	public void shouldReturnOilLevel0() {
		RoboDog underTest = new RoboDog("Bill", 5, 5);
		int newMaintenanceLevel = underTest.maintain();
		Assert.assertEquals(0, newMaintenanceLevel);
	}

	@Test
	public void shouldReturnMaintenanceLevel0() {
		RoboDog underTest = new RoboDog("Bill", 5, 5);
		int newOilLevel = underTest.applyOil();
		Assert.assertEquals(0, newOilLevel);
	}

	@Test
	public void shouldReturnOilLevel20FromTick() {
		RoboDog underTest = new RoboDog("Bill", 18, 18);
		underTest.tick();
		int oilNeedAfterTick = underTest.getOilNeed();
		Assert.assertEquals(20, oilNeedAfterTick);
	}
	
	@Test
	public void shouldReturnMaintenanceLevel20FromTick() {
		RoboDog underTest = new RoboDog("Bill", 18, 18);
		underTest.tick();
		int maintenanceNeedAfterTick = underTest.getMaintenanceNeed();
		Assert.assertEquals(20, maintenanceNeedAfterTick);
	}
	
	@Test
	public void shouldReturnOilNeed20AfterWalk() {
		RoboDog underTest = new RoboDog("Bill", 25, 25);
		int oilNeedAfterWalk = underTest.walk();
		Assert.assertEquals(20, oilNeedAfterWalk);
	}
	
	@Test
	public void shouldReturnOilNeed0AfterWalk() {
		RoboDog underTest = new RoboDog("Bill", 0, 0);
		int oilNeedAfterWalk= underTest.walk();
		Assert.assertEquals(0, oilNeedAfterWalk);
	}
}

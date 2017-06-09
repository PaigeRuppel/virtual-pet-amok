package virtualpets.amok;

import org.junit.Assert;
import org.junit.Test;

public class RoboCat implements RoboticPet {

	private String name;
	private int oilNeed;
	private int maintenanceNeed;

	public RoboCat(String name, int oilNeed, int maintenanceNeed) {
		this.name = name;
		this.oilNeed = oilNeed;
		this.maintenanceNeed = maintenanceNeed;
	}

	@Override
	public int maintain() {
		maintenanceNeed -= 10;
		if (maintenanceNeed < 0) {
			maintenanceNeed = 0;
		}
		return maintenanceNeed;
	}

	@Override
	public int applyOil() {
		oilNeed -= 10;
		if (oilNeed < 0) {
			oilNeed = 0;
		}
		return oilNeed;
	}
}
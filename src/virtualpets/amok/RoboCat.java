package virtualpets.amok;

public class RoboCat extends Cat implements RoboticPet {

	
	private int oilNeed;
	private int maintenanceNeed;

	public RoboCat(String name, int oilNeed, int maintenanceNeed) {
		super(name);
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
	
	@Override
	public void tick() {
		oilNeed += 5;
		maintenanceNeed += 5;
	}
}

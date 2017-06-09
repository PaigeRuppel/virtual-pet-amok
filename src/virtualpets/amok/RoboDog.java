package virtualpets.amok;

public class RoboDog extends Dog implements RoboticPet {

	
	private int oilNeed;
	private int maintenanceNeed;

	public RoboDog(String name, int oilNeed, int maintenanceNeed) {
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

}

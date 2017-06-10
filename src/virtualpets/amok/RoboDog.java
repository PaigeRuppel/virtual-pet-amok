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

	@Override
	public void tick() {
		oilNeed += 5;
		maintenanceNeed += 5;
	}

	public int getOilNeed() {
		return oilNeed;
	}

	public int getMaintenanceNeed() {
		return maintenanceNeed;
	}

	@Override
	public int walk() {
		oilNeed -= 5;
		if (oilNeed < 0) {
			oilNeed = 0;
		}
		return oilNeed;
	}

	@Override
	public String indPetStats() {
		return getName() + "\t\t | \t " + oilNeed + "\t\t\t | \t " + maintenanceNeed + "\t\t | \t ";
	}

}

package virtualpets.amok;

public class RoboDog extends Dog implements RoboticPet {

	private int oilNeed;
	private int maintenanceNeed;

	public RoboDog(String name, int oilNeed, int maintenanceNeed) {
		super(name);
		this.oilNeed = oilNeed;
		this.maintenanceNeed = maintenanceNeed;
		setHealth();
	}

	@Override
	public int setHealth() {
		health = (100 - (oilNeed + maintenanceNeed) / 2);
		return health;
	}



	@Override
	public int maintain() {
		maintenanceNeed -= 20;
		if (maintenanceNeed < 0) {
			maintenanceNeed = 0;
		}
		setHealth();
		return maintenanceNeed;

	}

	@Override
	public int applyOil() {
		oilNeed -= 20;
		if (oilNeed < 0) {
			oilNeed = 0;
		}
		setHealth();
		return oilNeed;
	}

	@Override
	public void tick() {
		oilNeed += 5;
		maintenanceNeed += 5;
		setHealth();
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
		setHealth();
		return oilNeed;
	}

	@Override
	public String detailedPetStats() {
		return getName() + "\t\t\t | \t " + oilNeed + "\t\t\t\t | \t " + maintenanceNeed;
	}

}

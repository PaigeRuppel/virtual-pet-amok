package virtualpets.amok;

public class RoboCat extends Cat implements RoboticPet {

	private int oilNeed;
	private int maintenanceNeed;

	public RoboCat(String name, int oilNeed, int maintenanceNeed) {
		super(name);
		this.oilNeed = oilNeed;
		this.maintenanceNeed = maintenanceNeed;
		setHealth();
	}

	@Override
	public int setHealth() {
		if (oilNeed +maintenanceNeed == 0) {
			health = 100;
		}
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
		oilNeed += 2;
		maintenanceNeed += 2;
		setHealth();
	}

	@Override
	public String detailedPetStats() {
		return getName() + "\t\t\t | \t " + oilNeed + "\t\t\t\t | \t " + maintenanceNeed;
	}
}

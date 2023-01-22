
public class ElectricVehicle extends Vehicle {
	
	private Integer batteryCapacity;
	private Integer chargeLevel;

	public Integer getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(Integer batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public Integer getChargeLevel() {
		return chargeLevel;
	}

	public void setChargeLevel(Integer chargeLevel) {
		this.chargeLevel = chargeLevel;
	}

	public void charge() {
		chargeLevel++;

	}

	@Override
	public void driveVehicle(int milesDriven) {
		System.out.println("Electric vehicle driven " + milesDriven + " miles");

}}

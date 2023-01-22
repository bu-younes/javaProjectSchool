
public class Car extends Vehicle  {
	
    public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	int numberOfDoors;

    public void openTrunk() {
        System.out.println("Trunk opened.");
    }

}

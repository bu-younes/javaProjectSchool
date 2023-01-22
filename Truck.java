
public class Truck extends Vehicle  {
	
	  int numberOfAxles;
	    public int getNumberOfAxles() {
		return numberOfAxles;
	}

	public void setNumberOfAxles(int numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}

	public int getCapacityInTons() {
		return capacityInTons;
	}

	public void setCapacityInTons(int capacityInTons) {
		this.capacityInTons = capacityInTons;
	}

		int capacityInTons;

	    public void load(double weight) {
	        System.out.println("Loaded" + weight+" tons");
	    }

}

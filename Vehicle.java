
public class Vehicle   extends Engine implements Honkable{
	
	 String make;
	    String model;
	    int year;
	    String color;
	    int numberOfWheels;
	    int weight;

	    public void start() {
	        System.out.println("Vehicle started.");
	    }

	    public void stop() {
	        System.out.println("Vehicle stopped.");
	    }

	    public void drive(int miles) {
	        System.out.println("Vehicle driven X miles" );
	    }

	    public void honk() {
	        System.out.println("Honk Honk!");
	    }
	
	    public String getMake() {
			return make;
		}

		public void setMake(String make) {
			this.make = make;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public int getNumberOfWheels() {
			return numberOfWheels;
		}

		public void setNumberOfWheels(int numberOfWheels) {
			this.numberOfWheels = numberOfWheels;
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Vehicle vehicle1 = new Vehicle();
		
        Car myCar = new Car();
	    Truck myTruck = new Truck();

	    myCar.start(); 
	    myTruck.stop(); 
	    myCar.drive(10); 
	    myTruck.honk(); 

		vehicle1.setMake("BMW"); 
		vehicle1.setModel("sedan"); 
		vehicle1.setColor("blue"); 

		Car car1 = new Car();
		car1.setNumberOfDoors(4);
		System.out.println("This car has " + car1.getNumberOfDoors() + " Doors ");

		Truck truck1 = new Truck();
		truck1.setNumberOfAxles(10); 
		truck1.setCapacityInTons(6000);
		System.out.println("This Truck has " + truck1.getNumberOfAxles() + " Axles " + " and " + truck1.getCapacityInTons()
				+ " capacity In  Tons ");


	

	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		
	}

	public void driveVehicle(int milesDriven) {
		// TODO Auto-generated method stub
		
	}

	

}


public class punto2 {
	package vehicles;

	public class Vehicle {
	    public static String MAKE = "Augur";
	    public static int numVehicles = 0;

	    private String chassisNo;
	    private String model;

	    public Vehicle(String model) {
	        numVehicles++;
	        this.chassisNo = "ch" + numVehicles;
	        this.model = model;
	        System.out.println("Vehicle manufactured");
	    }

	    public String getChassisNo() {
	        return chassisNo;
	    }

	    public void setChassisNo(String chassisNo) {
	        this.chassisNo = chassisNo;
	    }

	    public String getModel() {
	        return model;
	    }

	    public void setModel(String model) {
	        this.model = model;
	    }

	    public void setMake(String make) {
	        MAKE = make;
	    }

	    public String toString() {
	        return "The vehicle is manufactured by: " + MAKE +
	                "\nThe model type is " + model +
	                "\nThe chassis number is " + chassisNo;
	    }
	}


	package vehicles;

	public static class TestVehicle {
	    public static void main(String[] args) {
	        System.out.println("Manufacturer: " + Vehicle.MAKE);
	        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);

	        // Create a vehicle instance
	        Vehicle vehicle1 = new Vehicle("Vision");

	        // Access instance variables using dot notation
	        System.out.println("The chassis number is " + vehicle1.getChassisNo());
	        System.out.println(vehicle1.toString());

	        // Create a second vehicle instance
	        Vehicle vehicle2 = new Vehicle("Edict");

	        // Access instance variables using dot notation
	        System.out.println("The chassis number is " + vehicle2.getChassisNo());
	        System.out.println(vehicle2.toString());

	        // Correct the value of the static variable using an instance of the class
	        vehicle2.setMake("Seer");

	        // Print the contents of both instances
	        System.out.println(vehicle1.toString());
	        System.out.println(vehicle2.toString());

	        // Display the total number of vehicles manufactured
	        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
	    }
	}

}

package taller10;

public class punto1 {
	package vehicles;

	public class Vehicle {
	    public static String MAKE = "Augur";
	    public static int numVehicles = 0;

	    private String chassisNo;
	    private String model;

	    public Vehicle(String model) {
	        numVehicles++;
	        chassisNo = "ch" + numVehicles;
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

	    @Override
	    public String toString() {
	        return "The vehicle is manufactured by: " + MAKE + "\nThe model type is " + model + "\nThe chassis number is " + chassisNo;
	    }
	}
	package vehicles;

	public class TestVehicle {
	    public void main(String[] args) {
	        // Output static variables
	        System.out.println("Manufacturer: " + Vehicle.MAKE);
	        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);

	        // Create an instance of Vehicle and output instance variables
	        Vehicle vehicle1 = new Vehicle("Vision");
	        System.out.println(vehicle1.toString());

	        // Create another instance of Vehicle and output instance variables
	        Vehicle vehicle2 = new Vehicle("Edict");
	        System.out.println(vehicle2.toString());

	        // Output total number of vehicles manufactured
	        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
	    }
	}
	

}

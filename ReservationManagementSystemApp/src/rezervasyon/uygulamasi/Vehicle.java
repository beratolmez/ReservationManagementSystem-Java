
package rezervasyon.uygulamasi;

public abstract class Vehicle {
    protected String vehicleId;
    protected String fuelType;
    protected int capacity;
    protected int tripNumber;
    protected String vehicleType;

    public Vehicle(String vehicleId, String fuelType, int capacity, int tripNumber, String vehicleType) {
        this.vehicleId = vehicleId;
        this.fuelType = fuelType;
        this.capacity = capacity;
        this.tripNumber = tripNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTripNumber() {
        return tripNumber;
    }
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setTripNumber(int tripNumber) {
        this.tripNumber = tripNumber;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    
    public abstract int calculateFuelCost();
    public abstract int calculateMaxRevenue();
}
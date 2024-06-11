
package rezervasyon.uygulamasi;

public class Reservation {
    private Passenger passenger;
    private Vehicle vehicle;
    private int seatNumber;

    public Reservation(Passenger passenger, Vehicle vehicle, int seatNumber) {
        this.passenger = passenger;
        this.vehicle = vehicle;
        this.seatNumber = seatNumber;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    

}
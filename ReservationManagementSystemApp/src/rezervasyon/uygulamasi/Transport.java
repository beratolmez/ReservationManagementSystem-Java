
package rezervasyon.uygulamasi;

import java.util.ArrayList;
import java.util.List;

public class Transport {
    private List<Company> companies;
    private List<Trip> trips;
    private List<Reservation> reservations;

    public Transport(List<Company> companies, List<Trip> trips, List<Reservation> reservations) {
        this.companies = companies;
        this.trips = trips;
        this.reservations = reservations;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    

    public void makeReservation(Passenger passenger, Vehicle vehicle, int seatNumber) {
    }

}
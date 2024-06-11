
package rezervasyon.uygulamasi;

public class Passenger extends Person {
    private String reservationInfo;

    public Passenger(String firstName, String lastName, String reservationInfo) {
        super(firstName, lastName);
        this.reservationInfo = reservationInfo;
    }

    public String getReservationInfo() {
        return reservationInfo;
    }

    public void setReservationInfo(String reservationInfo) {
        this.reservationInfo = reservationInfo;
    }

    

}
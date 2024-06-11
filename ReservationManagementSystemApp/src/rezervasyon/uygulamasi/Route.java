
package rezervasyon.uygulamasi;

public class Route {
    private String departureLocation;
    private String arrivalLocation;
    private double distance;

    public Route(String departureLocation, String arrivalLocation, double distance) {
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.distance = distance;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    

}

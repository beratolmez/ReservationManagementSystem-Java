
package rezervasyon.uygulamasi;

public class Trip {
    private Vehicle vehicle;
    private Route route;
    private String date;
    private double price;

    public Trip(Vehicle vehicle, Route route, String date, double price){
        this.vehicle = vehicle;
        this.route = route;
        this.date = date;
        this.price = price;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

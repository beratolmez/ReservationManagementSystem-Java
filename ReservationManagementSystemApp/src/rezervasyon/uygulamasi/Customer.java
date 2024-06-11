
package rezervasyon.uygulamasi;

public class Customer {
    private String customerId;
    private String name;
    private String birthday;

    public Customer(String customerId, String name, String birthday) {
        this.customerId = customerId;
        this.name = name;
        this.birthday = birthday;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void makeReservation(Trip trip) {
        
    }

    public void cancelReservation(Trip trip) {
       
    }

}

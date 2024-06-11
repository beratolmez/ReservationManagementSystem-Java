
package rezervasyon.uygulamasi;

import java.util.ArrayList;
import java.util.List;

class Company extends User {
    private String companyName;
    private int serviceFee;
    private List<Bus> buss;
    private List<Train> trains;
    private List<Airplane> airplanes;

    public Company(String username, String password, String companyName, int serviceFee) {
        super(username, password);
        this.companyName = companyName;
        this.serviceFee = serviceFee;
        this.buss = new ArrayList<>();
        this.trains = new ArrayList<>();
        this.airplanes = new ArrayList<>();
    }
    
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public int getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(int serviceFee) {
        this.serviceFee = serviceFee;
    }
    
    public void addBus(Bus bus) {
        this.buss.add(bus);
    }
    
    public void addTrain(Train train) {
        this.trains.add(train);
    }
        
    public void addAirplane(Airplane airplane) {
        this.airplanes.add(airplane);
    }

    public List<Bus> getBuss() {
        return buss;
    }

    public List<Train> getTrains() {
        return trains;
    }

    public List<Airplane> getAirplanes() {
        return airplanes;
    }
}
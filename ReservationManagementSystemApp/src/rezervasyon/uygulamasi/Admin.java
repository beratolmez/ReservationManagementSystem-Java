
package rezervasyon.uygulamasi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Admin extends User {
    private List<Company> firmalar;

    public Admin(String username, String password) {
        super(username, password);
        this.firmalar = new ArrayList<>();
    }

    public void addCompany(String companyName, String companyUsername, 
            String companyPassword, int companyServiceFee) {
        
        Company newCompany = new Company(companyName, companyUsername,
                companyPassword, companyServiceFee);
        firmalar.add(newCompany);
    }
    
    public void deleteCompany(String companyName) {
        for (Iterator<Company> iterator = firmalar.iterator(); iterator.hasNext();) {
            Company company = iterator.next();
            if (company.getCompanyName().equals(companyName)) {
                iterator.remove();
                return;
            }
        }
    }
    
    public List<Company> getCompany() {
        return firmalar;
        }
    
    public void addBusToCompany(String companyUsername, Bus bus) {
            
        Company company = findCompanyByUsername(companyUsername);

        if (company != null) {
            company.addBus(bus);
        }
    }
    public void addTrainToCompany(String companyUsername, Train train) {
            
        Company company = findCompanyByUsername(companyUsername);

        if (company != null) {
            company.addTrain(train);
        }
    }
    
    public void addAirplaneToCompany(String companyUsername, Airplane airplane) {
            
        Company company = findCompanyByUsername(companyUsername);

        if (company != null) {
            company.addAirplane(airplane);
        }
    }
    
    public void deleteBusFromCompany(String companyUsername, String vehicleId) {
        
        Company company = findCompanyByUsername(companyUsername);
        List<Bus> buss = company.getBuss();
            for (Iterator<Bus> iterator = buss.iterator(); iterator.hasNext();) {
                Bus bus = iterator.next();
                if (bus.getVehicleId().equals(vehicleId)) {
                    iterator.remove();
                    return;
                }
            }
    }
    
    public void deleteTrainFromCompany(String companyUsername, String vehicleId) {
        
        Company company = findCompanyByUsername(companyUsername);
        List<Train> trains = company.getTrains();
            for (Iterator<Train> iterator = trains.iterator(); iterator.hasNext();) {
                Train train = iterator.next();
                if (train.getVehicleId().equals(vehicleId)) {
                    iterator.remove();
                    return;
                }
            }
    }
    
    public void deleteAirplaneFromCompany(String companyUsername, String vehicleId) {
        
        Company company = findCompanyByUsername(companyUsername);
        List<Airplane> airplanes = company.getAirplanes();
            for (Iterator<Airplane> iterator = airplanes.iterator(); iterator.hasNext();) {
                Airplane airplane = iterator.next();
                if (airplane.getVehicleId().equals(vehicleId)) {
                    iterator.remove();
                    return;
                }
            }
    }
    public Company findCompanyByUsername(String companyUsername) {
        for (Company company : firmalar) {
            if (company.getUsername().equals(companyUsername)) {
                return company;
            }
        }
        return null;
    }
    
    public void updateTripNumberForVehicle(String companyUsername, String vehicleId, int newTripNumber) {
        for (Company company : firmalar) {
            if (company.getUsername().equals(companyUsername)) {
                for (Bus bus : company.getBuss()) {
                    if (bus.getVehicleId().equals(vehicleId)) {
                        bus.setTripNumber(newTripNumber);
                        return;
                    }
                }

                for (Train train : company.getTrains()) {
                    if (train.getVehicleId().equals(vehicleId)) {
                        train.setTripNumber(newTripNumber);
                        return;
                    }
                }

                for (Airplane airplane : company.getAirplanes()) {
                    if (airplane.getVehicleId().equals(vehicleId)) {
                        airplane.setTripNumber(newTripNumber);
                        return;
                    }
                }
            }
        }
    }   
}

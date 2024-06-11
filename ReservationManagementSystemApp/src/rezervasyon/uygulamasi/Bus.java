
package rezervasyon.uygulamasi;

public class Bus extends Vehicle {

    public Bus(String vehicleId, String fuelType, int capacity, int tripNumber, String vehicleType) {
        super(vehicleId, fuelType, capacity, tripNumber, vehicleType);
    }

    @Override
    public int calculateFuelCost() {
        int deger = 0;
        switch (fuelType){
            case "Motorin" :
                if(tripNumber == 3){
                  deger = 6*4000;  
                }
                else{
                    deger = 6*2400;
                }
                break;
            case "Benzin" :
                if(tripNumber == 3){
                    deger = 10*4000;
                }
                else{
                    deger = 10*2400;
                }
                break;
        }
        return deger;
    }
    
    @Override
    public int calculateMaxRevenue(){
        int deger = 0;
        switch (vehicleType){
            case "Otobüs 1":
                if(tripNumber == 3){
                    deger = capacity * 3600;
                }
                else{
                    deger = capacity * 1200;
                }
                
            case "Otobüs 2":
                if(tripNumber == 3){
                    deger = capacity * 3600;
                }
                else{
                    deger = capacity * 1200;
                }
        }
        return deger;
    } 
    
}
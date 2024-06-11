
package rezervasyon.uygulamasi;

public class Airplane extends Vehicle {

    public Airplane(String vehicleId, String fuelType, int capacity, int tripNumber, String vehicleType) {
        super(vehicleId, fuelType, capacity, tripNumber, vehicleType);
    }

    @Override
    public int calculateFuelCost() {
        int deger;
        if(tripNumber == 5){
            deger = 20*1200;
        }
        else{
            deger = 20*1000;
        }
        return deger;
    }
    
    @Override
    public int calculateMaxRevenue(){
        int deger;
        if(tripNumber == 5){
            deger = capacity * 4800;
        }
        else{
            deger = capacity * 4000;
        }
        return deger;
    }
}

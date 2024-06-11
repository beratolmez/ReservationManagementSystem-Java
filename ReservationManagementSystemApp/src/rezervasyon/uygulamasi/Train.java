
package rezervasyon.uygulamasi;

public class Train extends Vehicle {

    public Train(String vehicleId, String fuelType, int capacity, int tripNumber, String vehicleType) {
        super(vehicleId, fuelType, capacity, tripNumber, vehicleType);
    }

    @Override
    public int calculateFuelCost() {
        int deger = 0;
        if(tripNumber == 1){
            deger = 3*1500;
        }
        else{
            deger = 3*1800;
        }
        return deger;
    }
    
    @Override
        public int calculateMaxRevenue(){
        int deger;
                if(tripNumber == 1){
                    deger = capacity * 1200;
                }
                else{
                    deger = capacity * 1400;
                }
                return deger;
    }
}
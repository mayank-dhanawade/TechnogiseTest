/**
 * Created by mayank on 26/6/17.
 */
public class VehicleFactory {

    public Calculate getVehicle(RegisterationCard registerationCard){
        switch (registerationCard.getNumberOfWheels()){
            case 2: return new TwoWheeler();
            case 3: return new ThreeWheeler();
            case 4: return this.VehicleType(registerationCard);
            case 6: return new SixWheeler();

        }
        return null;
    }

    private Calculate VehicleType(RegisterationCard registerationCard){
        if(registerationCard.getVehileType() == 1)
            return new FourWheelerLTV();
        return new FourWheelerTransport();
    }
}

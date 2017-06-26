import java.util.Scanner;

/**
 * Created by mayank on 26/6/17.
 */
public class Toll {

    public static void main(String[] args) {
        Toll validate = new Toll();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Vehicle Number :");
        String vehicleNumber =scan.next();
        validate.ValidateSameStateVehicle(vehicleNumber);
        System.out.println("Transport type \n 1)Transport \n 2)Non Transport");
        Integer TransportType = scan.nextInt();
        System.out.println("Number of wheels:");
        Integer numberOfWheels = scan.nextInt();
            System.out.println("Number of Axels:");
            Integer numberOfAxels = scan.nextInt();

            RegisterationCard registerationCard = new RegisterationCard(vehicleNumber,TransportType,numberOfWheels,numberOfAxels);

        VehicleFactory vehile = new VehicleFactory();
        Calculate toll = vehile.getVehicle(registerationCard);

        int actualToll = toll.CalculateToll();
        int additionalToll = validate.ComputeAdditionalCharges(numberOfAxels);
        int FinalToll = actualToll + additionalToll;
        System.out.println(FinalToll);
    }

    public boolean ValidateSameStateVehicle(String VehicleNumber){
        if(VehicleNumber.indexOf("MH") > 0)
            return true;
        else{
            System.out.println("Vehicle is from same state. No Toll.");
            System.exit(0);
        }

        return false;
    }

    private int ComputeAdditionalCharges(Integer NumberOfAxels){
        if(NumberOfAxels >=2){
            return (NumberOfAxels - 2) * 100;
        }
        return 0;
    }
}

/**
 * Created by mayank on 26/6/17.
 */
public class RegisterationCard {

    private String vehileNumber;
    private Integer vehileType;
    private Integer numberOfWheels;

    public String getVehileNumber() {
        return vehileNumber;
    }

    public Integer getVehileType() {
        return vehileType;
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public Integer getNumberOfAxle() {
        return numberOfAxle;
    }

    private Integer numberOfAxle;

    public RegisterationCard(String vehileNumber,Integer vehileType,Integer numberOfWheels, Integer numberOfAxle){
        this.vehileNumber = vehileNumber;
        this.vehileType = vehileType;
        this.numberOfWheels = numberOfWheels;
        this.numberOfAxle = numberOfAxle;
    }
}

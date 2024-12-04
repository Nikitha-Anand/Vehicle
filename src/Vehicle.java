public class Vehicle {
    private String ID;
    private Integer MaxSpeed;
    private Integer CurrentSpeed;
    private Integer IncreaseAmount;
    private Integer HorizontalPosition;

    public Vehicle(String ID, Integer MaxSpeed, Integer IncreaseAmount){
        this.ID = ID;
        this.MaxSpeed = MaxSpeed;
        this.IncreaseAmount = IncreaseAmount;
        CurrentSpeed = 0;
        HorizontalPosition = 0;
    }

    public Integer GetCurrentSpeed() {
        return CurrentSpeed;
    }

    public Integer GetIncreaseAmount() {
        return IncreaseAmount;
    }

    public Integer GetMaxSpeed() {
        return MaxSpeed;
    }

    public Integer GetHorizontalPosition() {
        return HorizontalPosition;
    }

    public void SetCurrentSpeed(Integer currentSpeed) {
        CurrentSpeed = currentSpeed;
    }

    public void SetHorizontalPosition(Integer horizontalPosition) {
        HorizontalPosition = horizontalPosition;
    }

    public void IncreaseSpeed(){
        if (GetCurrentSpeed() + GetIncreaseAmount() <= GetMaxSpeed()) {
            SetCurrentSpeed(GetCurrentSpeed() + GetIncreaseAmount());
            SetHorizontalPosition(GetHorizontalPosition() + GetCurrentSpeed());
        }
    }

    public void PrintVehicle(){
        System.out.println("Horizontal Position: " + GetHorizontalPosition() + ", Speed of the Vehicle: " + GetCurrentSpeed());
    }
}

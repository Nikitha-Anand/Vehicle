public class Helicopter extends Vehicle{
    private Integer VerticalPosition;
    private Integer VerticalChange;
    private Integer MaxHeight;
    public Helicopter(String ID, Integer MaxSpeed, Integer IncreaseAmount, Integer VerticalChange, Integer MaxHeight) {
        super(ID, MaxSpeed, IncreaseAmount);
        this.VerticalChange = VerticalChange;
        this.MaxHeight = MaxHeight;
        VerticalPosition = 0;
    }

    @Override
    public void IncreaseSpeed() {
        if (VerticalChange + VerticalPosition <= MaxHeight && GetCurrentSpeed() + GetIncreaseAmount() <= GetMaxSpeed()) {
            VerticalPosition = VerticalChange + VerticalPosition;
            SetCurrentSpeed(GetCurrentSpeed() + GetIncreaseAmount());
            SetHorizontalPosition(GetHorizontalPosition() + GetCurrentSpeed());
        }
    }

    @Override
    public void PrintVehicle() {
        System.out.println("Horizontal Position: " + GetHorizontalPosition() + ", Vertical Position: " + VerticalPosition + ", Speed of the Vehicle: " + GetCurrentSpeed());
    }


}

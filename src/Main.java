public class Main {
    public static void main(String[] args){
        Vehicle Car = new Vehicle("Tiger", 100, 20);

        Helicopter helicopter = new Helicopter("Lion", 350, 40, 3, 100);

        Car.IncreaseSpeed();
        Car.IncreaseSpeed();
        Car.PrintVehicle();

        helicopter.IncreaseSpeed();
        helicopter.IncreaseSpeed();
        helicopter.PrintVehicle();
    }
}

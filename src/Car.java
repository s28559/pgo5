public class Car extends Vehicle {
    public int numberOfSeats;

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void start() {
        System.out.println("Auto startuje.");
    }
    @Override
    public void stop() {
        System.out.println("Auto się zatrzymuje.");
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}

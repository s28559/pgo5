public class Main {
    public static void main(String[] args) {
        //zad 1 i zad 2
        Car BMW = new Car(5);
        BMW.start();
        BMW.stop();

        int numberOfSeats = BMW.getNumberOfSeats();
        System.out.println("Liczba miejsc w pojeździe: " + numberOfSeats);

        //zad 3 i zad 4
        Animal lew = new Lion();
        lew.roam();
        lew.makeNoise();
        lew.sleep();

        Animal wilk = new Wolf();
        wilk.roam();
        wilk.makeNoise();
        wilk.sleep();

        Animal kot = new Cat();
        kot.roam();
        kot.makeNoise();
        kot.sleep();

        Animal pies = new Dog();
        pies.roam();
        pies.makeNoise();
        pies.sleep();

    }
}
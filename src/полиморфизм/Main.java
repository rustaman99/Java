package полиморфизм;

public class Main {
    void useCar(Car car) {
        car.driving();
        System.out.println(car.numOfSeets);

    }
    public static void main(String[] args) {
Main main = new Main();
main.useCar(new Car());
Toyota toyota = new Toyota();
toyota.driving();
        System.out.println(toyota.getNumOfSeets);

    }
}

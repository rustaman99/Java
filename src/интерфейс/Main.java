package интерфейс;

import полиморфизм.Car;

public class Main implements SomeInterface,Some {
    @Override
    public void someMethod() {
        System.out.println("Hello");
    }

    @Override
    public void bounce() {
        System.out.println("word");

    }

    public static void main(String[] args) {

        Main car1 = new Main();
       car1.bounce();
       car1.someMethod();
       Main car2 = new Main();
        System.out.println(" ");
       car2.someMethod();
       car2.bounce();
    }

    @Override
    public void start() {
        System.out.println("Car starting now");
    }

    @Override
    public void stop() {
        System.out.println("Car is stop");

    }
}

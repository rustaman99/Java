package наследование;

public class Main {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        toyota.color="White";
        System.out.println(toyota.color);
        toyota.car(4,5);
        System.out.println(toyota.getMaxSpeed());
    }
}

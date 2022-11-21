package полиморфизм;

public class ПерегрузкаМетода {
    int addTwo(int a, int b) {
        return a + b;
    }

    double addTwo(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        ПерегрузкаМетода перегрузкаМетода = new ПерегрузкаМетода();
        System.out.println( перегрузкаМетода.addTwo(5,6));
        System.out.println( перегрузкаМетода.addTwo(5.5,6));
    }
}


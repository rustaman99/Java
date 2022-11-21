package операторыЦиклы;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите пароль");
        int num = scanner.nextInt();
        int num1 = 555;
        for (int i = 0; i != num1; i--) {
            num1 = scanner.nextInt();
            if (num1 == 555) {
                System.out.println("Привет админ");
            } else {
                System.out.println("Введите другое число");
            }
        }
    }
}

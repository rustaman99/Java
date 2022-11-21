package exceptionTest;

import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
          int a=0;
          int b=6;

          try {
              System.out.println(b/a);
              throw new MyException();
          }catch (ArithmeticException e ){
          System.err.println("Деление на 0");
          } catch (MyException e) {
              throw new RuntimeException(e);
          } finally {
              System.out.println("Конец программы");
              System.exit(0);
              System.out.println("Конец программы");
          }
    }
}

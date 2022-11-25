import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Java8 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello");
            }
        };
        Runnable runnable1 = () -> System.out.println("hello");
        }
}
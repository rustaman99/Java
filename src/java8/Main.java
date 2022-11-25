package java8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrays.asList( "a", "b", "d" ).forEach(c -> System.out.println( c ) );
    }
}

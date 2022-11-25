package java8;

import java.util.ArrayList;
import java.util.Arrays;

public class Лямбда {

    public static void main(String[] args) {
//        String da = ",";
//        Arrays.asList( "a", "b", "d" ).forEach(
//                ( String e ) -> System.out.print( e + da) );
        Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> {
            int result = e1.compareTo( e2 );
            return result;
        } );
    }
}

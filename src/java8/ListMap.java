package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ruslan","Anton","Ruslan","Anton","Ruslan","Anton","Ruslan","Anton","Ruslan","Stepan","Ruslan","Vasya");
   Map<String,Long> frequencyName=list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
   frequencyName.forEach((k,v)-> System.out.println(k + ": " + v));

    }
}

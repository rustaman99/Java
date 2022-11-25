package java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("One");
        list.add("Two");


//        for (String s:list){
//            System.out.println(s);
//        }
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        Stream<String> stream=list.stream();//
//        stream.forEach(x-> System.out.println(x));
    }
}

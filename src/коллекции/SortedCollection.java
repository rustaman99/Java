package коллекции;

import java.util.Set;
import java.util.TreeSet;
class Person implements Comparable<Person>{ //используется implements Comparable для сортировки
    int age;
    public Person(int age){
        this.age=age;
    }

    @Override
    public int compareTo(Person p) {
        return this.age-p.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
public class SortedCollection {
    public static void main(String[] args) {
      Set set = new TreeSet();
//        set.add("5");
//        set.add("6");
//        set.add("2");
//        set.add("1");
//        set.add("8");
//        set.add("4");
//        for(Object o :set){
//            System.out.println(o);
        set.add(new Person(4));
        set.add(new Person(5));
        set.add(new Person(1));
        set.add(new Person(2));
        for(Object o:set){
            System.out.println(o);
        }
        }

}

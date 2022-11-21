package коллекции;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
         Set collection = new HashSet();
        //колекция уникальных чисел
        //add-добавить
        //size-размер
        //remove-удалить по значению
        collection.add("1");
        collection.add("2");
        collection.add("2");
        collection.add("3");
        collection.add("3");
        collection.add("3");
        collection.add("1");
        for (Object o:collection){
            System.out.println(o);
        }
    }
}

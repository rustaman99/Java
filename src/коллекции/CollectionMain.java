package коллекции;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {
    public static void main(String[] args) {
        Collection collection =new ArrayList();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.remove("2");
        Iterator iterator = collection.iterator();  //пробежаться по коллекции
        while (iterator.hasNext()){ //есть ли след элемент
            System.out.println(iterator.next()); //вывод
        }
        for (Object o:collection){  //вывод коллекции по новому
            System.out.println(o);
        }
    }
}

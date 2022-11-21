package коллекции;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        Map collection =new HashMap();
        //put-добавить
        //get-получить
        //size-размер
        collection.put("1","Dan Brown");
        collection.put("2","Carnegie");
        collection.put("3","Jack London");
        System.out.println(collection.get("2"));//вывод по ключу два
        System.out.println(collection.containsValue("Carnegie"));
        System.out.println(collection.size());
        Set set=collection.entrySet();
        for(Object o:set){         //вывести всю коллекицю
            System.out.println(o);
        }

    }
}

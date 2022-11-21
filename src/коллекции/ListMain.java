package коллекции;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListMain {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list1 = new Vector();//тот же самый аррей лист,только  синхронизиров аны
        List list2 = new LinkedList();//
        //add-добавить
        //set-заменить
        //get-получить по индексу
        //remove-удалить по индексу
        list.add("1");
        list.add("5");
        list.add("3");
        list.add("4");
        for (int i=0;i<list.size();i++){

            System.out.println(list.get(i));//получить элементы листа(идет от нулевого индекса
        }
    }
}

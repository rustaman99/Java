package коллекции;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        //offer-добавить
        //add- добавить
        //peek-доставать из коллекции(но не удаляет)
        //poll-доставать из коллекции( удаляет)
        Queue collection = new PriorityQueue();
        collection.offer("1");
        collection.offer("2");
        collection.offer("3");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(collection.poll());
    }
        System.out.println("Size of element"+collection.size());
}
}

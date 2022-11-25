import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class СравниваниеСтрок {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("bb");
        list.add("cc");
        list.add("aa");
        list.add("AA");
        list.add("ba");
        list.add("AA");
        list.add("ac ");

        Collator collator =Collator.getInstance();
        Collections.sort(list,collator);
        for(String s:list){
            System.out.println(s);
        }
    }
}

package www.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoveTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        Iterator<String> ite = list.iterator();
        while (ite.hasNext()){
            String str = ite.next();
            if (str.equals("b")){
                ite.remove();
                continue;
            }
        }
        System.out.println(list);
    }
}

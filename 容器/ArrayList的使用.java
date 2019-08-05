package www.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.size()+","+list.isEmpty());
        list.add("hello");
        list.add("hello");
        list.add("bye");
        System.out.println(list.size()+","+list.isEmpty());
        System.out.println(list);
        list.remove("hello");
        System.out.println(list);
        System.out.println(list.contains("bye"));
        System.out.println(list.contains("hello"));

        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.set(1,"world"));
        System.out.println(list);
        System.out.println();
    }
}

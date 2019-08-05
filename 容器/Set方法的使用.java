package www.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<String> hashset = new HashSet<>();
        hashset.add("D");
        hashset.add("C");
        hashset.add("A");
        hashset.add("A");
        hashset.add("B");
        System.out.println(hashset);
        Set<String> treeset = new TreeSet<>();
        treeset.add("A");
        treeset.add("A");
        treeset.add("B");
        treeset.add("D");
        treeset.add("C");
        System.out.println(treeset);
    }
}

import java.util.ArrayList;
import java.util.Collection;

public class PrintingCollection {
    static Collection fill(Collection<String> collection){
        collection.add("cat");
        collection.add("dog");
        collection.add("rat");
        return collection;
    }

    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<String>()));
    }
}


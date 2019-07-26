import java.util.*;

class Fruit{
    private String type;
    public Fruit(String type){
        this.type = type;
    }
    public String toString(){
        return this.type;
    }
}
public class CrossContainerIteration {

    public static void display(Iterator<Fruit> it){
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<Fruit>();
        fruits.add(new Fruit("Apple"));
        fruits.add(new Fruit("Orange"));
        fruits.add(new Fruit("Fuji"));
        fruits.add(new Fruit("Pitch"));
        fruits.add(new Fruit("Gala"));

        LinkedList<Fruit> fruitsLL = new LinkedList<Fruit>(fruits);
        HashSet<Fruit> fruitsHS = new HashSet<Fruit>(fruits);
        
        display(fruits.iterator());
        display(fruitsLL.iterator());
        display(fruitsHS.iterator());
    }
}


import java.util.ArrayList;
import java.util.List;

class Fruit{
    private String type;
    public Fruit(String type){
        this.type = type;
    }
    public String toString(){
        return this.type;
    }
}
public class ListTest {
    public ListTest() {
    }

    public static void main(String[] args) {
        List<Fruit> fruit = new ArrayList<Fruit>();
        //1. 使用add（）方法顺序添加元素并打印
        fruit.add(new Fruit("Apple"));
        fruit.add(new Fruit("Orange"));
        fruit.add(new Fruit("Fuji"));
        fruit.add(new Fruit("Pitch"));
        fruit.add(new Fruit("Gala"));
        System.out.println("1:"+fruit);

        //2. 使用add添加元素并打印
        Fruit f = new Fruit("Breaburn");
        fruit.add(f);
        System.out.println("2:"+fruit);

        //3. 使用remove（）删除指定元素并打印
        fruit.remove(f);
        System.out.println("3:"+fruit);

        //4. 使用get（）方法获取下标为2的元素
        // 使用indexOf（）方法获取指定元素的下标并打印
        Fruit f1 = fruit.get(2);
        System.out.println(f1+" "+fruit.indexOf(f1));
        System.out.println("4:"+fruit);

        //5. 使用add（）方法在列表中间插入元素并打印
        fruit.add(3,new Fruit("Apple2"));
        System.out.println("5:"+fruit);

        //6. 使用subList（）方法从列表中截取某一长度的列表并打印
        List<Fruit> sub = fruit.subList(1,4);
        System.out.println("6:"+sub);
        //7. 使用contains（）方法判断截取的列表是否存在于原列表中
        System.out.println(fruit.containsAll(sub));
    }
}


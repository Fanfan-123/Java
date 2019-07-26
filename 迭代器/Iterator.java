package www.fanfan.com;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Fruit1{
    private String type;
    public Fruit1(String type){
        this.type = type;
    }
    public String toString(){
        return this.type;
    }
}

public class SimpleIterator {
    public static void main(String[] args) {
        List<Fruit1> fruit1 = new ArrayList<Fruit1>();

        // 使用add（）方法顺序添加元素并打印
        fruit1.add(new Fruit1("Apple"));
        fruit1.add(new Fruit1("Orange"));
        fruit1.add(new Fruit1("Fuji"));
        fruit1.add(new Fruit1("Pitch"));
        fruit1.add(new Fruit1("Gala"));
        System.out.println("1:"+fruit1);

        //1.1 判断序列是否为空
        //1.2 每次返回序列中的下一个元素
        Iterator<Fruit1> it = (Iterator<Fruit1>) fruit1.iterator();
        while (it.hasNext()){
            Fruit1 f = it.next();
            System.out.print(f+" ");
        }
        System.out.println();

        //2.1 返回序列中的下一个元素
        //2.2 将最新返回的元素删除
        it = fruit1.iterator();
        for (int i = 0; i < 2; i++){
            it.next();
            it.remove();
        }
        System.out.println(fruit1);
    }
}


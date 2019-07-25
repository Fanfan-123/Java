import java.util.ArrayList;

class Apple{
    private static long coungter;
    private final long id = coungter++;
    public long id(){
        return id;
    }
}

public class AppleAndWithGenerics {
    public static void main(String[] args) {
        //声明ArrayList 存放的都是Apple对象
        ArrayList<Apple> apples = new ArrayList<Apple>();
        //使用add（）方法向ArrayList中添加对象
        for (int i = 0; i < 3; i++){
            apples.add(new Apple());
        }
        //调用ArrayList中每个对象的id（）方法，并打印信息
        //size（）方法可以得到有多少个元素被添加进来
        //get(i)方法可以访问对象，可以像数组一样使用索引
        for (int i = 0; i < apples.size();i++){
            System.out.println(apples.get(i).id()
            );
        }

    }
}


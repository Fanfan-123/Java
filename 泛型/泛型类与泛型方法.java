package www.fanfan.com;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

//泛型类与泛型方法可以共存
public class Point5<T,E>{
    private T x;
    private E y;

    public void setX(T x) {
        this.x = x;
    }

    public void setY(E y) {
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public E getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point5{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    //这是泛型类中的一个普通方法
    //普通方法中类型参数与类名中的类型参数一致
    public void test(T t){
        System.out.println(t);
    }
    //泛型方法
    public <X> void print(X o){
        System.out.println(o);
    }

    public static void main(String[] args) {
        Point5<Integer,Integer> integerIntegerPoint5 = new
                Point5<>();
        integerIntegerPoint5.setX(89);
        integerIntegerPoint5.setY(90);
        System.out.println(integerIntegerPoint5);
        integerIntegerPoint5.test(66);

        integerIntegerPoint5.print("hello");
    }
}

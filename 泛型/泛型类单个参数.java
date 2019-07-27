package www.fanfan.com;

import www.fanfan.com.Point;

//1. 使用泛型类，指定参数类型
//泛型类中属性的类型与普通方法的参数类型可以与类中制定的参数类型一样
public class Point2<T> {
    private T x;
    private T y;

    public void setX(T x) {
        this.x = x;
    }

    public void setY(T y) {
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point2{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
    //使用泛型类时指定具体的参数类型
        Point2<Integer> integerPoint2 = new Point2<>();
        integerPoint2.setX(1);
        integerPoint2.setY(2);
        System.out.println(integerPoint2);

        Point2<String> stringPoint2 = new Point2<>();
        stringPoint2.setY("东京180°");
        stringPoint2.setX("北纬30°");
        System.out.println(stringPoint2);
    }
}


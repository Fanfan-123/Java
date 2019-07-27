package www.fanfan.com;

public class Point3<T,E> {
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
        return "Point3{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point3<Integer,Integer> integerPoint3 = new Point3<>();
        integerPoint3.setX(16);
        integerPoint3.setY(17);
        System.out.println(integerPoint3);

        Point3<Integer,String> point3 = new Point3<>();
        point3.setX(2);
        point3.setY("hello");
        System.out.println(point3);
    }
}

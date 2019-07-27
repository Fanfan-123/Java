package www.fanfan.com;
//泛型方法
public class Point4 {
    public <T> void print(T o){
        System.out.println(o);
    }
    public static void main(String[] args) {
        Point4 point4 = new Point4();
        point4.print(3);
        point4.print("hello");
    }
}

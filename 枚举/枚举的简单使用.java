package www.fanfan.com;

enum Color{
    RED,YELLOW,BLUE;
}

public class EnumTest {
    public static void main(String[] args) {
        Color blue = Color.BLUE;
        System.out.println(blue);
        System.out.println(blue.name());
        System.out.println(blue.ordinal());
        for (Color c:Color.values()){
            System.out.print(c+" ");
        }
    }
}

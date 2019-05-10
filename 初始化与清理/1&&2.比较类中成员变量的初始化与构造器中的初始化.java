class Test1{
    String s;
}
class Test2{
    String s = "hello";
    String s1 = "world";
    Test2(){
        this.s = "good-bye";
    }
}
public class Code_练习1练2 {
    public static void main(String[] args) {
        Test1 test = new Test1();
        System.out.println(test.s);

        Test2 test21 = new Test2();
        System.out.println(test21.s);
        System.out.println(test21.s1);
    }
}

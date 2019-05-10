class Person{
    int age;
    String name;
    public Person(){
        System.out.println("这是一个人。");
    };
    public Person(int age){
        this();
        this.age = age;
        System.out.println("这个人的年龄是" +this.age+"岁。");
    }
    public Person(String name){
        this(17);
        this.name = name;
        System.out.println("这个人的名字是"+this.name+"。");
    }
}
public class Code_练习9 {
    public static void main(String[] args) {
        Person person = new Person("张三");
    }
}

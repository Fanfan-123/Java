class Person{
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "姓名："+this.name+",年龄："+this.age;
    }
}
public class Object_Person {
    public static void main(String[] args) {
        fun(new Person("alice",20));
    }
    public static void fun(Object obj){
        System.out.println(obj.toString());
    }
}


public class Code_以返回值区分方法重载 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.bark('w');
        dog.bark(1);
    }
}
class Dog{
    public void bark(){
        System.out.println("这只狗很安静");
    }
    public void bark(char w){
        System.out.println("这只狗在汪汪汪的叫");
    }
    public void bark(int i){
        System.out.println("这只狗在咆哮");
    }
}

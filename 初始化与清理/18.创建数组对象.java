class Person1{
    Person1(String s){
        System.out.println(s);
    }
}

public class Code_练习17和18 {
    public static void main(String[] args) {
        Person1[] person = {
                new Person1("SUSAN"),
                new Person1("JACK"),
                new Person1("alice")
        };
        for (int i = 0; i < person.length;i++){
            System.out.println(person[i]);
        }
    }
}

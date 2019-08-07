package www.treeset;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Semaphore;

class Person implements Comparable<Person>{

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.age > o.age){
            return 1;
        }else if (this.age < o.age){
            return -1;
        }else {
            return this.name.compareTo(o.name);
        }
    }
}

public class CompareToTest {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>();
        set.add(new Person("alice",20));
        set.add(new Person("ls",19));
        set.add(new Person("alice",20));
        System.out.println(set);
    }
}

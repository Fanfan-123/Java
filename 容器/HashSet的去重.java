package www.hashset;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Teacher{
    private String name;
    private Integer age;

    public Teacher(String name, Integer age) {
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
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }else if (!(obj instanceof Teacher)){
            return false;
        }
        return this.name.equals(((Teacher) obj).name) && this.age.equals(((Teacher) obj).age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }
}

public class HashSetTest {
    public static void main(String[] args) {
        Set<Teacher> set = new HashSet<>();
        set.add(new Teacher("alice",20));
        set.add(new Teacher("ls",19));
        set.add(new Teacher("tom",21));
        set.add(new Teacher("alice",20));
        System.out.println(set);
    }
}

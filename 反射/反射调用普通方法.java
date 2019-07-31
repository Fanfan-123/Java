package www.fanfan;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestBaseInfo {
    //反射调用构造方法
    public static void code2(){
        Class personClass = Person.class;
        Constructor[] constructors =  personClass.getConstructors();
        //获取到所有的构造方法
        for (Constructor i:constructors){
            System.out.println(i.getName()+"("+ Arrays.toString(i.getParameterTypes())+")");
        }
        //获取某一个构造方法
        try {
            Constructor c = personClass.getConstructor(String.class);
            Object obj = c.newInstance("alice");
            System.out.println(obj.getClass().getName());
            System.out.println(obj);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
       code2();
    }


}

interface IMessage{

}

interface SystemEdition{

}
class Father{

}

//www.fanfan.Son
class Son extends Father implements IMessage,SystemEdition{

}


class Person{
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

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
}



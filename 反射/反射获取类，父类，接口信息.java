package www.fanfan;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestBaseInfo {
    public static void code1(){
        //Class对象
        Class sonClass = Son.class;
        System.out.println(sonClass);
        System.out.println(sonClass.getName());
        //获取包
        Package packages = sonClass.getPackage();
        //包的名称
        System.out.println(packages);
        System.out.println(packages.getName());
        //获取父类
        //如果Son没有父类，则默认为Object
        Class superClass = sonClass.getSuperclass();
        System.out.println(sonClass);
        System.out.println(sonClass.getName());//类全限定名
        System.out.println(sonClass.getSimpleName());//类名
        //如果Son没有实现接口，返回空数组
        Class[] interfaceClass = sonClass.getInterfaces();
        for (Class i:interfaceClass){
            System.out.println(i);
        }
    }

    
    
    public static void main(String[] args) {
       code1();
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



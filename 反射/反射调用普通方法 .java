package www.fanfan;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestBaseInfo {

    //反射调用普通方法
    public static void code3(){
        Person person = new Person("jack",20);
        Class personClass = person.getClass();

        Method[] methods = personClass.getMethods();
        //Method[] methods = personClass.getDeclaredMethods();
        System.out.println("Person类中所有方法。");
        for (Method i:methods){
            System.out.println(i.getName()+"("+Arrays.toString(i.getParameterTypes())+")");
        }

        //
        try {
            Method setNameMethod = personClass.getMethod("setName",String.class);
            setNameMethod.invoke(person,"张三");
            Method getNameMethod = personClass.getMethod("getName");
            System.out.println(getNameMethod.invoke(person));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
       code3();
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



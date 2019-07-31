package www.fanfan;

import java.util.Date;
public class TestReflect {
    public static void main(String[] args) {
        
        //1. 通过对象.getClass()方法获取Class对象
         //通过date对象获取到创建date对象的类的对象
        //Class 类下的对象
        //java.util.Date->Class 对象，描述Date这个类
        Date date = new Date();
        Class classd = date.getClass();
        System.out.println(classd);
       
       //2. 通过类名.class获取Class对象
        Class classd1 = Date.class;
        System.out.println(classd1);

        //3. 通过Class.forname(“全限定类名”)
        //类的名称：全限定名称
        //需要捕获异常
        try {
            Class classd2 = Class.forName("java.util.Date");
            System.out.println(classd2);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
     }
 }

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
     //通过Class对象创建实例化对象
        try {
            Object object = classd.newInstance();
            //向下转型，有风险，使用instanceof
            if (object instanceof Date){
                Date date1 = (Date)object;
                System.out.println(date1);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

     }
 }

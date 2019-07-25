package www.fanfan.com;

import java.util.ArrayList;
import java.util.Collection;

class MyTree{ }
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        Collection<MyTree> trees = new ArrayList<MyTree>();
        for (int i  = 0 ; i < 10;i++){
            c.add(i);//自动装箱
        }
        for (Integer i:c){
            System.out.print(i+" ");//自动拆箱
        }
        System.out.println();
        System.out.println("-------------------");

        for (int i = 0; i < 3;i++){
            trees.add(new MyTree());
        }
        for (MyTree t:trees){
            System.out.println(t);
        }
    }
}


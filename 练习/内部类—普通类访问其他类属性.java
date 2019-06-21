//Outer类与Inner类都是普通类，并且两个类是平行关系
class Outer{
	String name = "kelly";
	public void fun(){//（3）out对象调用了fun方法
		Inner inner = new Inner(this);//（4）this表示当前对象
		inner.print();//（7）调用Inner类的方法
	}
}
//普通类若要访问其他类的属性，需要进行对象引用
class Inner{
    Outer out; //对Outer类的对象引用
    public Inner(Outer out){//（5）调用Inner的构造方法
		this.out = out;//（6）引用传递
	}	
	public void print(){//（8）执行方法
		 System.out.println(out.name+" is beautiful");
		}
	}
	//主方法
public class TestClass{
	public static void main(String[] args){
		Outer out = new Outer();//（1）实例化Outer类对象
		out.fun();//（2）调用Outer类方法
	}
}

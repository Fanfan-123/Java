class Outer{
	private String name = "Alice";
	//方法内部类定义在外部类方法中，只能在该方法中使用
	public void display(){
		class Inner{
			public void print(){
				System.out.println(name+" is beautiful!!!");
		}
		}
		new Inner().print();//创建匿名对象并调用方法内部类中的方法
	}
	
}
public class TestClass{
	public static void main(String[] args){
	Outer out = new Outer();
	out.display();
	}
}

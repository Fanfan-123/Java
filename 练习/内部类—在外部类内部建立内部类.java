class Outer{
	private String name;
	private int age;
	class Inner{
		public Inner(){
			Outer.this.name = "kity";
			Outer.this.age = 21;
		}
		public void print(){
		  System.out.println(name+" is beautiful,his age is "+age);
		}
	}
	public void fun(){
	//两种方法都可行
		//Outer.Inner inner = new Outer().new Inner();
		Inner inner = new Inner();
		inner.print();
	}
}
public class TestClass{
	public static void main(String[] args){
		Outer out = new Outer();
		out.fun();
	}
}

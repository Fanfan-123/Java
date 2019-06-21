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
		Inner inner = new Inner();
		inner.print();
	}
}
class Test4{
	public void funnnn(){
	//在其他类中创建内部类的时候注意形式
		Outer.Inner inner = new Outer().new Inner();
		inner.print();
	}
}
public class TestClass{
	public static void main(String[] args){
		Test4 out = new Test4();
		out.funnnn();
	}
}

class Outer{
	private static String name = "jack";
	static class Inner{
		public void print(){
			//静态内部类使用外部类的实行时，只能调用外部类的static属性
			//此时不能用 （属性名.this.属性名）形式，直接使用属性名即可
			// System.out.println("姓名为："+Outer.this.name);---error
			System.out.println("姓名为："+name);
		}
	}
	public void fun(){
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

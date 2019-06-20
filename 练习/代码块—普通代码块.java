public class Example1{
	public static void main(String[] args){
	//此处使用代码块，就可以出现同名变量
		{
		  int n = 6;
		  System.out.println(n);
		}
		int n = 100;
		System.out.println(n);
	}
}

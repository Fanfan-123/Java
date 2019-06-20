//主类
public class Example1{
	public static void main(String[] args){
		new Example();
		System.out.println("——————-————————————");
		new Example();
	}
}
//普通类
class Example{
	//非主类中的静态代码块
	static {
		System.out.println("0,非主类下的静态代码块");
	}
	//构造块
	{
		System.out.println("1,类下的构造块");
	}
	//构造方法
	public Example(){
		System.out.println("2,类下的构造方法");
	}
}

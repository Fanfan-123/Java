public class Example1{
	//主类中的静态代码块
	static {
		System.out.println("0,主类下的静态代码块");
	}
	//构造块
	{
		System.out.println("1,类下的构造块");
	}

	//构造方法
	public Example1(){
		System.out.println("2,类下的构造方法");
	}
	public static void main(String[] args){
		//new Example1();
		//System.out.println("——————-————————————");
		//new Example1();
	}
}

public class Example1{
	//构造块
	{
		System.out.println("1,类下的构造块");
	}
	//构造方法
	public Example1(){
		System.out.println("2,类下的构造方法");
	}
	public static void main(String[] args){
		new Example1();//匿名对象
		System.out.println("——————-————————————");
		new Example1();//匿名对象
	}
}

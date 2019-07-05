public class Test3{
	public static void main(String[] args){
		Person2 sg1 = new Person2();
		System.out.println(sg1);
		sg1.print();//对象调用本类中的方法，则方法中的this就表示当前执行的对象sg1
		System.out.println("————————————");
		Person2 sg2 = new Person2();//对象调用本类中的方法，则方法中的this就表示当前执行的对象sg2
		System.out.println(sg2);
		sg2.print();
	}
}

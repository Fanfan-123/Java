public class Test0001{
	
	public static void main(String[] args){
//2. Person类已经在其子类 Worker 中实例化，此处可直接创建对象即可
		Person person3 = Person.getObject();
		System.out.println(person3.getInfo());
	}
}
//1. 定义抽象类
abstract class Person{
	
	private String name;
	public Person(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
//1.1 在抽象类中定义抽象化方法
	public abstract String getInfo();

//1.2 在抽象类中定义一个普通方法，为定义局部内部类作基础，
//将该普通方法用static 修饰，方便在主类中好调用该方法
	public static Person getObject(){
		
//1.3 在抽象方法的普通方法中定义局部内部类
		class Worker extends Person{
			public Worker(String name){
				super(name);
			}
			public String getInfo(){
				return "工人姓名是："+this.getName();
			}
		}
		return new Worker("王五");
	}
}

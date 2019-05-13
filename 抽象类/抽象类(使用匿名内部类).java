public class Test0001{
	
	public static void main(String[] args){
		
		Person person4 = Person.getObject();
		System.out.println(person4.getInfo());
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
	
//1.1 定义抽象方法
	public abstract String getInfo();

//1.2 定义一个普通方法，是为了在普通方法中定义一个匿名内部类	
	public static Person getObject(){
//1.3 定义匿名内部类，该内部类没有名字，也就没有构造方法，同时该内部类继承了父类Person类		
		return new Person("孙六"){
//1.4 在匿名内部类中覆写父类抽象类中的抽象方法（具体实现)
			public String getInfo(){
				return "工人姓名："+this.getName();
			}
		};		
	}
}

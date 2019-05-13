//4. 定义主类
public class Test0001{
	public static void main(String[] args){
//4.1 父类通过其子类进行实例化（向上转型）
		Person person1 = new Student("张三");
		Person person2 = new Teacher("jack");
//4.2 通过实例化对象调用每个子类中具体实现的父类的抽象方法
		System.out.println(person1.getInfo());
		System.out.println(person2.getInfo());
	}
}
//1，定义抽象类
abstract class Person{
	
	private String name;
	
	public Person(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	//1，1定义抽象方法getInfo（）
	public abstract String getInfo();
}

//2，定义Student 子类继承抽象类
//2.1 子类中覆写父类的抽象方法（具体实现）
class Student extends Person{
	
	public Student(String name){
		super(name);
	}
	
	public String getInfo(){
		return "学生姓名是："+this.getName();
	}
}

//3，定义Teacher 子类继承抽象类
//3.1 子类中覆写父类的抽象方法（具体实现）
class Teacher extends Person{
	
	public Teacher(String name){
		super(name);
	}
	
	public String getInfo(){
		return "教师姓名是："+this.getName();
	}
}	



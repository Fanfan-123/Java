//主类
public class TestFatherAndSon{
	public static void main(String[] args){
		Person person = new Person();
		person.print();//父类方法
		Student stu = new Student();
		stu.print();//子类覆写父类方法，调用的是子类覆写过的方法。
	}
}

//父类
class Person{
	//成员方法
	public void print(){
		System.out.println("这是Person的print方法");
	}
}

//子类
class Student extends Person{
	public void print(){
		System.out.println("这是Student的print方法");
	}
}

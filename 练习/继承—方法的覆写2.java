public class TestFatherAndSon{
	public static void main(String[] args){
		Student stu = new Student();
		stu.print1();
	}
}


class Person{
	//父类中的方法为private时，子类使用public时不是方法的覆写，而是方法的重载）
	//子类中只是继承了父类的print1方法，并不能访问，所以子类根本就不知道父类中存在print方法
	private void print1(){
		System.out.println("hello");
	}
}


class Student extends Person{
	//此处子类中不知道父类中有print1方法
	public void print1(){
		System.out.println("Student hello");
	}
}

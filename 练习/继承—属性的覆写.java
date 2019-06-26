public class TestFatherAndSon{
	public static void main(String[] args){
		Student stu = new Student();
		System.out.println(stu.getName());
	}
}

class Person{
	//父类中的属性不为private时，子类才能覆写父类中的属性
	public String name = "kelly";
}


class Student extends Person{
	//属性覆写，不需要范围更为宽泛
	private String name = "alice"; 
	public String getName(){
		return name;
	}
}

//主类
public class TestExtends{
	public static void main(String[] args){
            Student stu = new Student();
	    stu.name = "kelly";
	    stu.age = 23;
	    stu.print();		
	}
}
//父类 
class Person{
        private String name;
	private int age;
	public void print(){
	System.out.println("姓名："+name+",年龄："+age);
	}	
}
//子类
class Student extends Person{
	
}


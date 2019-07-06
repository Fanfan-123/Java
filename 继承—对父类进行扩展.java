//主类
public class TestExtends{
	public static void main(String[] args){
		//父类中的私有属性需要通过get，set方法访问。
            Student stu = new Student();
	    stu.setName("jack");
	    stu.setAge(20);
	    stu.setNum("20160603");
	    System.out.println("姓名："+stu.getName()+"，年龄："+stu.getAge()+",学号："+stu.getNum());
}
}

//父类 
class Person{
        private String name;
	private int age;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}	
}
//子类
class Student extends Person{
	private String num;
    public void setNum(String num){
		this.num = num;
	}	
	public String getNum(){
		return num;
	}
}


1，动态数组初始化
public class ArrayInitialize{
	private String name;
	private int age;
	//构造方法
	public ArrayInitialize(String name,int age){
		this.name = name;
		this.age = age;
	}
	//方法
    public void print(){
	System.out.println("姓名："+name+",年龄："+age);
	}
	//主方法
	public static void main(String[] args){
		//需要指出数组长度
		ArrayInitialize[] person = new ArrayInitialize[2];
		person[0] = new ArrayInitialize("张三",20);
		person[1] = new ArrayInitialize("李四",21);
		for(int i = 0;i < person.length;i++){
			person[i].print();
		}
	}
}

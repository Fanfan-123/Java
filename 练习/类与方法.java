 public class KindAndObject{
	//属性
	String name;
	int age;
	//构造方法

      //1，默认的构造方法
	public KindAndObject(){
		
	}
	
	//2,Z自己定义的构造方法
	public KindAndObject(String name,int age){
		this.name = name;
		this.age = age;
	}
	//方法
	public void printInformation(){
		System.out.println("姓名："+this.name+",年龄："+this.age);
	}
	public static void main(String[] args){
	
	      //创建对象person1
	      //以下赋值形式只能对应构造方法1
		KindAndObject person1 = new KindAndObject();
		person1.name = "李四";
		person1.age = 22;

		//创建对象person2
		//以下赋值只能对应构造方法2
		KindAndObject person2 = new KindAndObject("张三",23);
		person1.printInformation();
		person2.printInformation();
	}
	}

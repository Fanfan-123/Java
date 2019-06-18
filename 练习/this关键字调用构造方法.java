class Person2{
	 //方法——private封装
	private String name;
	private int age;
	//构造方法
	public Person2(){
	}
	public Person2(String name){
		this();//调用本类无参构造方法
		this.name = name;
	}
	public Person2(String name,int age){
		this(name);//调用本类有参构造方法
		this.age = age;
	}
	//方法setter设置 和 getter获取
	public void setName(String name){
		this.name = name;//访问成员变量
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		if(age < 0 || age >= 150){
			System.out.println("输入错误！");
		}
		else{
		this.age = age;//访问成员变量
		}
	}
	public int getAge(){
		return age;
	}
	//方法
	public void intriduce(){
		System.out.println("姓名："+name+"，年龄："+age);
	}
}

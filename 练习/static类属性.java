class Person2{
	 //此处为了强调static关键字的作用，设为公共属性
	public  static String country = "中国";
	public String name;
	public int age;
	//构造方法
	public Person2(String name,int age){
		this.name = name;
		this.age = age;
		
	}
	//方法
	public void intriduce(){
		System.out.println("姓名："+name+"，年龄："+age+",国家："+country);
	}
}

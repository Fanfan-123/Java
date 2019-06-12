 class Person2{
	 //属性——private封装
	private String name;
	private int age;
	//对属性的 setter设置 和 getter获取
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	public void setAge(int a){
		if(age < 0 || age >= 150){
			System.out.println("输入错误！");
		}
		else{
		age = a;
		}
	}
	public int getAge(){
		return age;
	}
	
	//构造方法
	public Person2(String n,int a){
		name = n;
		setAge(a);
	}
	
	//方法
	public void intriduce(){
		System.out.println("姓名："+name+"，年龄："+age);
	}
}


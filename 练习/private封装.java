 class SetterAndGetter{
       //封装，设置私有属性
	private String name;
	private int age;
	
	//构造方法
	public SetterAndGetter(){
	}
	
	//private 封装属性
	     //对name属性进行设置修改的方法
	public void setName(String n){
		name = n;
	}
	   //获取name属性的方法
	public String getName(){
		return name;
	}
	  //对age属性进行设置修改
	public void setAge(int a){
		if(age < 0 || age >= 150){
			System.out.println("输入错误！");
		}
		else{
		age = a;
		}
	}
	   //获取age属性
	public int getAge(){
		return age;
	}
	//打印信息方法
	//私有属性可以直接在它本类中使用
	public void intriduce(){
		System.out.println("姓名："+name+"，年龄："+age);
	}
}

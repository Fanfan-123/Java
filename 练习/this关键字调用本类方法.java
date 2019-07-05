class Person2{
	
	//方法
	private String name;
	//构造方法
	//参数名（即局部变量）与属性名（即成员变量名）相同，
	//为了加以区分，属性名前加 this，用于访问属性变量
	public Person2(String name){
		this.name = name;
	}
	public String getName(){
		return name;
		//此处调用普通方法，但是一定要在本类中
		this.print();
	}	
	//普通方法
	public void print(){
		System.out.prinbtln("##33##");
	}
}

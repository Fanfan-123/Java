public class Initialization {
    private String
            //1. 在定义对象的时候进行初始化
    s1 = "happy",
    s2,
    s3;
  public  Initialization(){
      //2. 在构造方法中进行初始化
      s2 = "kelly";
    }
    public String toString(){
      //3. 惰性初始化
      if (s3 == null){
          s3 = "hello";
      }
      return "s1:"+s1+"\n"+
              "s2:"+s2+"\n"+
              "s3:"+s3+"\n";
    }
    public static void main(String[] args) {
      //4. 使用实例初始化
      Initialization itlize = new Initialization();
      System.out.println(itlize);
    }

}

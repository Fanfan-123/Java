package www.fanfan.com;

//自定义异常类
class SimpleException extends Exception{ }

public class InheritingException  {

    public void f() throws SimpleException{
        System.out.println("Throw SimpleExpection from f()");
        throw new SimpleException();
    }
    public static void main(String[] args) {
        InheritingException inheritingException = new InheritingException();
        try{
            inheritingException.f();
        }
        catch (SimpleException e){
            System.out.println("Catch it!");
        }

    }
}


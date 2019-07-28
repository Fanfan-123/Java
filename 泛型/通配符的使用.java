class  Message<T>{
    private T message;

    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }
}

public class MessageTest {
    public static void main(String[] args) {
        Message<String> mag = new Message<>();
        mag.setMessage("hello");
        fun(mag);
    }
    //使用通配符
    //此时不能修改对象内容
    public static void fun(Message<?> mag){
        System.out.println(mag.getMessage());
    }
    //此处没有使用通配符，直接使用了具体类型String，因为泛型类使用的时候使用的具体类型为String，因此此处使用String也可以，但是使用其他类型就不可以
//    public static void fun(Message<String> mag){
//        System.out.println(mag.getMessage());
//    }

}


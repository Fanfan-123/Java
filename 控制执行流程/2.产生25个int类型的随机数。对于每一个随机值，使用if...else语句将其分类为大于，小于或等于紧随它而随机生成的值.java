//写一个程序，产生25个int类型的随机数。对于每一个随机值，使用if...else语句将其分类为大于，小于或等于紧随它而随机生成的值。
public class Code_练习2 {
    public static void main(String[] args) {
        Random rand1 = new Random(2);
        Random rand2 = new Random(2);
        for(int i = 0; i < 25;i++){
            int x = rand1.nextInt(50);
            rand2.nextInt(50);
            int y = rand2.nextInt(50);
            if(x < y){
                System.out.println(x+" < "+y);
            }else if (x > y){
                System.out.println(x+" > "+y);
            }else {
                System.out.println(x+" = "+y);
            }
        }
    }
}

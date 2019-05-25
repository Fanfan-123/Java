import java.util.Stack;

public class day3_2 {
    public boolean chkParenthesis(String A, int n) {
        char[] c = A.toCharArray();
        Stack<Character>  left = new Stack<Character>();
        int count = 0;

        for (int i = 0; i < c.length;i++){
            if (c[i] == '('){
                left.push(c[i]);
                count++;
            }
            if (c[i] == ')'){
                if (left.empty()){
                    return false;
                }else {
                    count--;
                }
            }
        }
        if (count == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        day3_2 d = new day3_2();
        d.chkParenthesis("())",3);
    }
}

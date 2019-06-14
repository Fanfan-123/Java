public class ArrayDemo{ 
   public static void main(String[] args) {
   
   int[] x = {1,2,5,55,555,223,45545,666465,6443} ; // 静态初始化定义数组 
 //  int[] x = new int[]{1,2,5,55,555,223,45545,666465,6443};     
//上面两行代码意义一样呢，都是初始化数组。
 
   System.out.println(x.length) ; 
   for (int i = 0; i<x.length ; i++) {                
   System.out.println(x[i]) ;  
          }  
      } 
   }

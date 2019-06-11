 public class Multiply{                        //类
 public static void main(String[] args){      //主方法
  int i = 1;                                 //定义变量
  int j = 1;
  int c = 1;
  for(i = 1;i<=9;i++){                      //外层循环——控制行数
   for(j = 1;j<=i;j++){                     //内层循环——控制列数
    c = i*j;                                    //两数乘积
       System.out.print(j+"*"+i+"="+c+"\t");    //\t 控制每行之间的距离
   }
   System.out.println();                        //换行
  }
 }
}

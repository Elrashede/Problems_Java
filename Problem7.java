import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
          String W="hello";
          int count=0;
          Scanner sc= new Scanner(System.in);
          String str=sc.next();
          int len=str.length();
          int p=0;
          for(int i=0;i<len;i++){
            if(str.charAt(i)==W.charAt(p)){
               p++;
               count++;
               if(p==5)
                   break;
            }

         }
          if(count !=5)System.out.println("NO");
         else System.out.println("YES");
    }
}

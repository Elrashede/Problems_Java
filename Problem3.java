import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        String res="";
        str=str.replaceAll("[aeiouyAEIOUY]", "");

          for(int i=0;i<str.length();i++){
              res+=".";
              res+=Character.toLowerCase(str.charAt(i));
          }
        System.out.println(res);

    }
}

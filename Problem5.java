import java.util.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        str=str.replace("+","");
        char[] ch = str.toCharArray();
        Arrays.sort(ch);

        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
            if(i<ch.length-1)
            System.out.print("+");
        }
    }

}
import java.util.Scanner;
import java.util.*;

public class Problem2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        while(num>0) {
            String str = sc.nextLine();
            int length = str.length();
            if (length > 10) {
                System.out.println("" + str.charAt(0) + (length - 2) + str.charAt(length - 1));

            }
            else {
                System.out.println(str);
            }
            num--;
        }

    }
}


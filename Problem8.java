import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        if(num>0) {
            if (num % 4 == 0 || num % 7 == 0||num % 44 == 0 || num % 47 == 0 || num % 74 == 0||
                    num % 77 == 0 || num % 444 == 0||num % 447 == 0 || num % 474 == 0||
                    num % 477 == 0 || num % 744 == 0|| num % 747 == 0||
                    num % 774 == 0 || num % 777 == 0
            )
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        else
            System.out.println("NO");

    }
}

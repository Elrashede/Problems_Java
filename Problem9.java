import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int []res=new int[num];
        for(int i=1;i<=num;i++){
            int p = Integer.parseInt(sc.next());
            res[p-1]=i;
        }
        for(int i=0;i<num;i++){
            System.out.print(res[i]+" ");
        }


    }
}

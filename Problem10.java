import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        int[][] mat = new int[5][5];
        int count=0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
               mat[i][j] = Integer.parseInt(sc.next());
               if(mat[i][j]==1){
                   count += Math.abs(i - 2)+Math.abs(j - 2);


               }
            }
        }
        System.out.println(count);


    }
}

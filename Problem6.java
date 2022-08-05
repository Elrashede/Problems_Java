import java.util.Arrays;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int []arr=new int[num];
        int sum1=0,sum2=0,count=0;
        for(int i=0;i<num;i++){
             arr[i]=Integer.parseInt(sc.next());
             sum2+=arr[i];
        }

        Arrays.sort(arr);

        for(int i=num-1;i>=0;i--){
           sum1+=arr[i];
           sum2-=arr[i];
           count++;
           if(sum1>sum2){
               break;
           }
        }
        System.out.println(count);

    }
}

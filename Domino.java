import java.util.*;
public class Domino {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum1 = 0, sum2 = 0;
        boolean flag = false;
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if((a%2!=0 && b%2==0)||(a%2==0 && b%2!=0))
                flag = true;
            sum1 += a;
            sum2 += b;

        }

        if(sum1%2==0 && sum2%2==0) {
            System.out.println(0);
            System.exit(0);
        }
        else if((sum1%2!=0 && sum2%2==0) || (sum1%2==0 && sum2%2!=0))
        {
            System.out.println(-1);
            System.exit(0);
        }
        else {
            if (flag == true)
                System.out.println(1);
             else
                 System.out.println(-1);
        }


    }
}

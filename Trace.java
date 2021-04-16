import java.util.*;
public class Trace {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        if(n==1){
            int temp = sc.nextInt();
            System.out.println(Math.PI*temp*temp);
            System.exit(0);
        }


        int[] ar = new int[n];
        for(int i = 0; i<n; i++){
            ar[i] = sc.nextInt();
        }

        int res = 0;
        Arrays.sort(ar);
        for(int i = n-1; i>0; i=i-2){
            res += (ar[i]*ar[i]-ar[i-1]*ar[i-1]);
        }

        if(n%2!=0){
            res += ar[0]*ar[0];
        }


        System.out.println(Math.PI*res);

    }
}

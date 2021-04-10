import java.util.*;
public class FindMarble {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();

        int[] arr2 = new int[n];
        s = s-1;
        t = t-1;
        for(int i = 0; i<n; i++){
            arr2[i] = arr[i]-1;
        }

        if(s==t)
        {
            System.out.println(0);
            System.exit(0);
        }

        int temp = s;
        int i = 0;
        while(i<n){
            temp = arr2[temp];

            if(temp==s){
                System.out.println(-1);
                System.exit(0);
            }
            i++;
            if(temp == t){
                System.out.println(i);
                break;
            }
        }

        if(temp!=t)
            System.out.println(-1);



    }
}

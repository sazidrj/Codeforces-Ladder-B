import java.util.*;
public class DimaAndTodoList {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] sum = new int[k];
        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
            sum[i % k] += a[i];
        }


/*        for(int i = 0; i<n; i++) {
            int temp = i;
            for (int j = 1; j < n/k; j++) {
                temp = (temp+k)%n;
                a[i] += a[temp];
            }

        }

        for(int i =0; i<n; i++)
            System.out.print(a[i]+ " ");

        System.out.println();

        int min = a[0];
        int pos  = 0;
        for(int i =0; i<n; i++){
            if(min>a[i]){
                min = a[i];
                pos = i;
            }
        }
*/
    int min = sum[0];
    int pos = 0;
       for(int i =0; i<k; i++){
           if(min>sum[i]){
               min = sum[i];
               pos = i;
           }
       }

        System.out.println(pos+1);

    }
}
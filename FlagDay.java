import java.util.*;
public class FlagDay {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] ar = new int[m][3];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<3; j++){
                ar[i][j] = sc.nextInt();
            }
        }

        int count = 1;
        int[] arr = new int[n];
        for(int i = 0; i<m; i++){
            if(arr[ar[i][0]-1]!=0){
                int temp = arr[ar[i][0]-1];
                if(temp<3)
                    count = (arr[ar[i][0]-1]+1)%4;
                else
                    count=1;
                arr[ar[i][1]-1] = count;
                if(count<3)
                    count++;
                else
                    count=1;

                arr[ar[i][2]-1] = count++;
            }
            else if(arr[ar[i][1]-1]!=0){
                int temp = arr[ar[i][1]-1];
                if(temp<3)
                 count = (arr[ar[i][1]-1]+1)%4;
                else
                    count=1;
                arr[ar[i][0]-1] = count;
                if(count<3)
                    count++;
                else
                    count = 1;
                arr[ar[i][2]-1] = count++;
            }
            else if(arr[ar[i][2]-1]!=0){
                int temp = arr[ar[i][2]-1];
                if(temp<3)
                  count = (arr[ar[i][2]-1]+1)%4;
                else
                    count = 1;
                arr[ar[i][0]-1] = count;
                if(count<3)
                    count++;
                else
                    count = 1;
                arr[ar[i][1]-1] = count++;
            }
            else{
                arr[ar[i][0]-1] = count++;
                arr[ar[i][1]-1] = count++;
                arr[ar[i][2]-1] = count++;
            }
          count=1;
        }

        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }


    }
}

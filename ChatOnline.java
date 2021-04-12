import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ChatOnline {
    public static void main(String arg[]) throws IOException{
        //Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String in = reader.readLine();
        int p = Integer.parseInt(in.split(" ")[0]);
        int q = Integer.parseInt(in.split(" ")[1]);
        int l = Integer.parseInt(in.split(" ")[2]);
        int r = Integer.parseInt(in.split(" ")[3]);
        int[] a = new int[p];
        int[] b = new int[p];
        int[] c = new int[q];
        int[] d = new int[q];
        int[] x = new int[2001];





        for(int i = 0; i<p; i++){
            String temp = reader.readLine();
            a[i] = Integer.parseInt(temp.split(" ")[0]);
            b[i] = Integer.parseInt(temp.split(" ")[1]);
        }



        for(int i = 0; i<q; i++){
            String temp = reader.readLine();
            c[i] = Integer.parseInt(temp.split(" ")[0]);
            d[i] = Integer.parseInt(temp.split(" ")[1]);
        }



        int num  = 0;
        for(int i = 0; i<p; i++){
            for(int j = a[i]; j<=b[i]; j++)
                   x[j]= x[j]+1;

        }



        int flag = 1;

      for(int len = l ; len<=r; len++) {
          flag = 1;
          for (int i = 0; i < q; i++) {
              for (int j = c[i]; j <= d[i]; j++) {
                  if(x[j+len]>0){
                      num++;
                      flag = 0;
                      break;
                  }
              }
              if(flag==0)
                  break;
          }


      }









        System.out.println(num);






    }
}

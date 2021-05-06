import java.util.*;
public class Lecture {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap hm = new HashMap<String, String>();
        for(int i=0; i<m; i++){
            String str0 = sc.next();
            String str1 = sc.next();
            hm.put(str0, str1);
        }
        String[] str2 = new String[n];
        for(int i = 0; i<n; i++)
            str2[i] = sc.next();
        for(int i=0; i<n; i++){
            if(hm.get(str2[i]).toString().length()<str2[i].length())
                System.out.print(hm.get(str2[i])+" ");
            else
                System.out.print(str2[i]+" ");
        }
    }
}

import java.util.*;
public class Garland {
 public static void main(String arg[]){
     Scanner sc = new Scanner(System.in);
     String st1 = sc.nextLine();
     String st2 = sc.nextLine();
     int[] ar1 = new int[26];
     int[] ar2 = new int[26];
     for(int i= 0; i<st1.length(); i++){
         ar1[st1.charAt(i)-'a']++;
     }

     for(int i = 0; i<st2.length(); i++){
         ar2[st2.charAt(i)-'a']++;
     }


     int ans = 0;
     for(int i =0; i<26; i++) {
         if (ar2[i] != 0) {
             if (ar1[i] == 0) {
                 System.out.println(-1);
                 System.exit(0);
             } else if (ar2[i] <= ar1[i]) {
                 ans += ar2[i];
             } else {
                 ans += ar1[i];
             }
         }
     }

     System.out.println(ans);



 }
}

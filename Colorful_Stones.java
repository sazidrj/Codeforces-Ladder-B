import java.util.*;
public class Colorful_Stones {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        String st2 = sc.nextLine();
        int count = 1;
        for(int i = 0, j=0; i<st2.length(); i++ ){
           if(st1.charAt(j) == st2.charAt(i)){
               j++;
               count++;
           }
        }
        System.out.println(count);
    }
}

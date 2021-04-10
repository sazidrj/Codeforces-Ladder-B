import java.util.*;
public class DZY_loveStrings
{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int n = sc.nextInt();
        int[] w = new int[26];
        for(int i=0; i<26; i++){
            w[i] = sc.nextInt();
        }
        int max = w[0];
        for(int i=0; i<26; i++){
            if(max<w[i])
                max = w[i];
        }

        int sum = 0;
        int i;
        for(i=0; i<st.length(); i++){
            sum += (i+1)*w[st.charAt(i)-'a'];
        }

        for(int j = 0; j<n; j++){
            sum += (i+1)*max;
            i++;
        }

        System.out.println(sum);
    }
}

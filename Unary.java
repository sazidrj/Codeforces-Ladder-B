import java.util.*;
public class Unary {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character,String> hm = new HashMap<>();

        /*
        ">"  →  1000,
        "<"  →  1001,
        "+"  →  1010,
        "-"  →  1011,
        "."  →  1100,
        ","  →  1101,
        "["  →  1110,
        "]"  →  1111.
         */

        hm.put('>',"1000");
        hm.put('<',"1001");
        hm.put('+',"1010");
        hm.put('-',"1011");
        hm.put('.',"1100");
        hm.put(',',"1101");
        hm.put('[',"1110");
        hm.put(']',"1111");


        String st ="";

        for(int i = 0; i<str.length(); i++){
            st += hm.get(str.charAt(i));
        }



        int ans = 0;
        int temp = 1;


        for(int i = st.length()-1; i>=0; i--){
             int a = Character.getNumericValue(st.charAt(i));
             ans = ans + (a*temp);
             temp = (temp<<1)%1000003;
        }

         System.out.println(ans%1000003);
    }
}

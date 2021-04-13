import java.util.*;
public class YetAnotherCardDeck
{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        ArrayList<Integer> al1 = new ArrayList<>(n);
        ArrayList<Integer> al2 = new ArrayList<>(q);
        for(int i = 0; i<n; i++){
            int temp = sc.nextInt();
            al1.add(temp);
        }

        for(int i =0 ; i<q; i++){
            int temp = sc.nextInt();
            al2.add(temp);

        }

        for(int i = 0; i<q; i++){
            int index = al1.indexOf(al2.get(i));
            System.out.print((index+1)+" ");
            for(int j = index-1; j>=0; j--){
                  al1.set(j+1, al1.get(j));
            }
            al1.set(0,al2.get(i));

        }



    }
}

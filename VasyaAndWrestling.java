import java.util.*;
public class VasyaAndWrestling {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 1,atrue = 0;
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();


        int[] ar = new int[n];
        long first = 0,  second= 0;
        for(int i = 0; i<n; i++){
            ar[i] = sc.nextInt();
            if(ar[i]>0) {
                first += ar[i];
                al1.add(ar[i]);
            }
            else {
                second += ar[i];
                al2.add(ar[i]);
            }

        }

         second = Math.abs(second);
        if(first>second)
            System.out.println("first");
        else if(second>first)
            System.out.println("second");
        else
        {

            for(int i = 0; i<al1.size() && i<al2.size(); i++){
                if(al1.get(i) - Math.abs(al2.get(i))>0) {
                    flag = 0;
                    atrue= 1;
                    break;
                }
                else if(al1.get(i)-Math.abs(al2.get(i))<0)
                {
                    flag = 0;
                    atrue = 0;
                    break;
                }
            }

            if(flag==1) {
                if (ar[n - 1] > 0)
                    System.out.println("first");
                else
                    System.out.println("second");
            }
            else{
                if(atrue==1)
                    System.out.println("first");
                else
                    System.out.println("second");



            }






        }
    }
}

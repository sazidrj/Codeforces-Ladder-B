import java.util.*;
public class trapeziumPattern {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int count1 = 0, count2 = 0;
        int n = sc.nextInt();
        for(int i = n; i>=1; i--){
            for(int j = n; j>i; j--){
                System.out.print("  ");
            }
            for(int k = 1; k<=i; k++){
                System.out.print(++count1+"*");
            }
            for(int l=1; l<=i; l++){
                System.out.print(++count2+i*i);
                if(l!=i)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}

import java.util.*;
public class Amr_and_Pins {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double dis = 1.0*Math.sqrt(1.0*(x2-x1)*(x2-x1) + 1.0*(y2-y1)*(y2-y1));
        long res = (long)Math.ceil(dis/(2*r));

        System.out.println(res);
    }
}

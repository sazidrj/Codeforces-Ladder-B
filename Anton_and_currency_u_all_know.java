import java.util.*;

public class Anton_and_currency_u_all_know {
    public static void swap(char[] ar, int i, int j){
        char temp = ar[j];
        ar[j] = ar[i];
        ar[i] =  temp;
        System.out.println(new String(ar));
    }

    public static void main(String arg[]){
      Scanner sc = new Scanner(System.in);
      char[] chArr  = sc.nextLine().toCharArray();
      int pos=-1;
      boolean flag = false;
      for(int i=0; i<chArr.length; i++){
          if(Character.getNumericValue(chArr[i])%2==0)
          {
              if(Character.getNumericValue(chArr[i])<Character.getNumericValue(chArr[chArr.length-1])){
                      swap(chArr, i, chArr.length-1);
                      System.exit(0);
              }
              else{
                  flag = true;
                  pos = i;
              }
          }
      }


      if(flag == true)
          swap(chArr, pos, chArr.length-1);
      else
          System.out.println(-1);

  }
}

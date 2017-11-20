
import java.util.Scanner;

public class ex_04 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      int v1= scn.nextInt();
      boolean  b= true;
      int i=2;
      while (i<=v1/2 &&  b){
          if(v1%i ==0){
              b= false;
          }
      }   i++;
      if(b == true){
          System.out.println("YES");
      }else{
          System.out.println("NO");
      }

    }
}

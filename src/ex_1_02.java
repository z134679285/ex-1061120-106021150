
import java.util.Scanner;

public class ex_1_02 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      float max =Float.MIN_VALUE;
      float min =Float.MAX_VALUE;
      float f= 0.0f;
      for(int i=0;i<10;i++){
          f= scn.nextFloat();
          if(max<f){
              max=f;
          }
          if(min>f){
              min=f;
          }
      }
        System.out.println("min="+min+"\nmax="+max);

    }
}

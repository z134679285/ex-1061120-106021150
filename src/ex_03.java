
import java.util.Scanner;

public class ex_03 {
//還沒打完十進制轉二進制
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = 0,s = 0;
        int v1= scn.nextInt();
        String str="";
        while(v1>1) {
            r = v1 % 2;
            v1 = r / 2;
            str=Integer.toString(v1)+str;


        }
        System.out.println(Integer.toString(v1)+str);

    }
}


import java.util.Scanner;

public class ex_02 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         char ch= ' ';
         String str =scn.nextLine(),str1="";
         int key=scn.nextInt();
         int length=str.length();
         for(int i =0;i<length;i++){
             ch=(char)((int)str.charAt(i)+key);
             str1=str1+Character.toString(ch);

         }
        System.out.println(str1);
    }
}

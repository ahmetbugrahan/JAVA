
package yapamadiklarim;

import java.util.Scanner;
public class rakamtop {
 public static int rakamtop(int a){
     if(a==0){
         return 0;
     }
     else
         return a%10+rakamtop(a/10);
 }
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int sayi=k.nextInt();
        int x=rakamtop(sayi);
        System.out.println(x);
    }
}

/*kullanıcı tarfından girilen bir sayının basamakları toplamını bulan methodu yazınız
 */
package metotlar;

import java.util.Scanner;

public class basamaktop {
    public static int bastop(int sayi){
        int rakam;
        int top=0;
        while(sayi!=0){
            rakam=sayi%10;
            sayi=sayi/10;
            top+=rakam;
        }
        return top;
    }
    public static void main(String[] args) {
         Scanner klavye=new Scanner(System.in);
         int sum=klavye.nextInt();
         int x=bastop(sum);
         System.out.println(x);
    }
    
}

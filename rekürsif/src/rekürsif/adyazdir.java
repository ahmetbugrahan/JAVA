
package rekürsif;
import java.util.Scanner;
public class adyazdir {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int sayi=k.nextInt();
        String ad=k.next();
        yazdir(ad,sayi);
    }

    static void yazdir(String ad, int sayi) {
        for (int i = 0; i < sayi; i++) {
            System.out.println(ad);
        }
    }
}

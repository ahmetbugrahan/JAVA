/*kendisine parametre olarak gelen tam sayının asal olup olmadıgını geri döndüren program
 */
package method_sorular;

import java.util.Random;

public class Methotsorular32 {
    public static  boolean prime_number(int n) {
        int sayac = 0;
        boolean b = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n%i == 0) {
                sayac++;
            }
        } if (sayac == 0) {
            b = true;
        } else {
            b = false;
        }
        return b;
    }
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(1000)+1;
        System.out.println(n +" sayisi asal mi? " + prime_number(n));
    }
}


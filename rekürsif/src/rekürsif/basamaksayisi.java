/*kendsine parametre olarak gelen bir tam sayının basamak sayısını geri döndüren rekürsif fonksiyonu yazınız
 */
package rekürsif;

import java.util.Scanner;

public class basamaksayisi {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int x = klavye.nextInt();
        int y = bassayi(x);
        System.out.println(y);
    }

    public static int bassayi(int sayi) {
        if (sayi > 0 && sayi < 9) 
            return 1;
        else 
            return 1 + bassayi(sayi/10);
        
    }
    

}

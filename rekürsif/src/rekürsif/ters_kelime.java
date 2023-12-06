/*kendisine parametre olarak gelen kelimeyi ters çeviren rekürsif fonksiyonu yazınız
 */
package rekürsif;

import java.util.Scanner;

public class ters_kelime{

    public static String ters(String s, int i) {
        String bos = "";
        if (i == s.length()) {
            return bos;
        } else {
            bos = bos + s.charAt(s.length() - 1 - i);
            return bos + ters(s, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String y = k.next();
        String x = ters(y, 0);
        System.out.println(x);
    }

}

/*kendisine parametre olarak gelen iki tam sayının toplamı
 *
 */
package method_sorular;

import java.util.Scanner;

public class Method_sorular1 {

    public static void main(String[] args) {
        Scanner klavye =new Scanner(System.in);
        int x=klavye.nextInt();
        int y=klavye.nextInt();
        int z=toplam(x,y);
        System.out.println(z);
    }
    public static int toplam(int a,int b){
        int toplam=a+b;
        return toplam;
    
    }
    
    
}

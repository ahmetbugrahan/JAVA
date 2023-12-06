/*kendisine parametre olarak gelen pozitif tam sayının kaç basamaklı olduğunu gösteren geri döndüren programı yazınız
 *
 */
package method_sorular;

import java.util.Scanner;

public class Method_sorular4 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int sayi=k.nextInt();
        int x=basamak(sayi);
        System.out.println(x);
        
    }
    public static int basamak(int a){
        int basamak=0;
        while(a>0){
            basamak++;
            a=a/10;
        }
        
        return basamak;
    }
    
    
}

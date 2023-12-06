/*kendisine parametre olarak gelen dizinin toplamını geri döndüren ana program
 */
package metotlar;

import java.util.Scanner;

public class methotornek3 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int x[]={1,7,3,6,5,2};
        int y=toplam(x);
        System.out.println(y);
        
    }
    public static int toplam(int[]a){
        int toplam=0;
        for(int i=0;i<a.length;i++){
            toplam+=a[i];
        }
        return toplam;
    }
    
}

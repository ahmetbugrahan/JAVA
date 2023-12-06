/*kendisine parametre olarak gelen n tane sayı kadar adınızı yazıp geri döndüren programı yazının
 *
 */
package method_sorular;

import java.util.Scanner;

public class Method_sorular3 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int n=k.nextInt();
        yaz(n);
    }
    public static void yaz(int a){
        for(int i=0;i<a;i++){
            System.out.println("ahmet");
        }
    }
}

/*kendisine parametre olarak gelen sayı kadar adınızı yazan programı giriniz
 */
package metotlar;

import java.util.Scanner;

public class methodornek1 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int y=k.nextInt();
        yaz(y);
    }
    public static void yaz(int a){
        for(int i=0;i<a;i++){
            System.out.println("ahmet");
        }
    }
    
}

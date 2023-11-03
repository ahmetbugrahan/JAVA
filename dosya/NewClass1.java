/*Klavyeden girilen ifadeler içinde sayı olanlarını sayı.dat karakter olanları karakter.dat dosyasına yazan progaramı yazızınız
toplam 5 adet ifade girilecektir
 */
package dosya;

import java.io.*;
import java.util.Scanner;

public class NewClass1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner k=new Scanner(System.in);
        File f1=new File("tek.txt");
        File f2=new File("cift.txt");
        PrintWriter p1=new PrintWriter(f1);
        PrintWriter p2=new PrintWriter(f2);
        int x;
        for (int i = 0; i < 5; i++) {
            x=k.nextInt();
            if(x%2==0) p2.println(x);
            else p1.println(x);
        }
        
    
    }
    
}

/*öyle bir metot yazınız ki klavyeden girilen rakamları rakam.dat dosyasına digerlerini diger.dat dosyasına yazan metodu olusturunuz
 */
package vizeyeyonelik;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class soru2 {
 public static void yazdosya() throws FileNotFoundException{
     File f1=new File("rakam.dat");
     File f2=new File("diger.dat");
     PrintWriter p1=new PrintWriter(f1);
     PrintWriter p2=new PrintWriter(f2);
     Scanner k=new Scanner(System.in);
     for(int i=0;i<10;i++){
         char c=k.next().charAt(0);
         if(c>='0'&& c<='9')p1.print(c);
         else p2.print(c);
     }
     p1.close();
     p2.close();
     
 }
    public static void main(String[] args) throws FileNotFoundException {
        yazdosya();
    }
}

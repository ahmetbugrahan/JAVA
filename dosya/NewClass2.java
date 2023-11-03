/*ali.txt dosyasında sayılar ve stringler bulunmaktadır.Bunları okuyup ekrana yazan
 */
package dosya;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NewClass2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner k=new Scanner(System.in);
        File f1=new File("ali.txt");
        PrintWriter p=new PrintWriter(f1);
        for (int i = 0; i < 10; i++) {
            String s;
            s=k.nextLine();
            p.println(s);
        }
    }
}

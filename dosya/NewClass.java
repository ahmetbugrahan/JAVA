/*klavyeden girilen 3 kişiye ad soyad numara bilgisini yazan program
 */
package dosya;

import java.io.*;
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) throws IOException {
        Scanner k=new Scanner(System.in);
        String ad_soyad_numara;
        File fx=new File("no.txt");
        FileWriter fw=new FileWriter(fx,true);
        fw.write("true güncelleme yapar");
        fw.close();
    }
    
}

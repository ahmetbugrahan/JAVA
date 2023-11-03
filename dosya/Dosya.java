/*Ali.txt dosyasına adınızı soyadınızı yazın
 */
package dosya;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dosya {
    public static void main(String[] args) throws IOException {
        Scanner k=new Scanner(System.in);
        File f1=new File("ahmet.txt");
        FileWriter fw=new FileWriter(f1,true);
        fw.write(k.next());
        fw.close();
    }
    
}

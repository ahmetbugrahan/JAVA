package dosyaislem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class dosya_yaz {
    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("notlar.txt");
        PrintWriter yaz=new PrintWriter(f);
        Random rnd=new Random();
        int s;
        String str;
        for (int i = 0; i <= 100; i++) {
            s=rnd.nextInt(100)+1;
            str="ogrenci"+i+"sinav="+s;
            yaz.print(str);
            
        }
        yaz.close();
    }
}

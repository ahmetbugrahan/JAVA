package istisna;
import java.awt.RenderingHints;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class uygulama2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File dosya=new File("karakter.txt");
        PrintWriter p=null;
        Random r=new Random();
        try{
            if(!dosya.exists())
                dosya.createNewFile();
                p=new PrintWriter(new FileOutputStream(dosya, false));
                for (int i = 1; i <= 100; i++) {
                    char c=(char)(r.nextInt(74)+'0');
                    p.print(c);
                }
                p.close();
            File dosya2=new File("toplam.txt");
            Scanner k=new Scanner(dosya);
            p=new PrintWriter(new FileOutputStream(dosya2, false));
            
            while(k.hasNext()){
                String sayi=k.nextLine();
                String[]dizi=sayi.split(" ");
                for (int i = 0; i < dizi.length; i++) {
                    int top=0;
                    char rakam = dizi[i].charAt(0);
                    if(rakam>='0'&&rakam<='9'){   
                        top=top+rakam;
                    }
                    p.print(top);
                }
            }
            p.close();   
        }
        catch(IOException e){
    }
}
}

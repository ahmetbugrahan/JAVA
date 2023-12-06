
package istisna;

import java.io.*;
import java.util.Random;
import java.util.Scanner;


public class Istisna {

    public static void main(String[] args)  {
        File dosya=new File("karakterler.txt");
        PrintWriter p=null;
        Random rnd=new Random();
        try {
            if(!dosya.exists())
                dosya.createNewFile();
            p=new PrintWriter(new FileOutputStream(dosya, false));
            for (int i = 1; i <=1000; i++) {
                char c=(char)(rnd.nextInt(74)+'0');
                p.print(c+" ");
                if(i%100==0) p.println();
            }
            p.close();
            File dosya1=new File("rakamlar.txt");
            Scanner oku=new Scanner(dosya);
            p=new PrintWriter(new FileOutputStream(dosya1, false));
            while(oku.hasNext()){
                String okunan=oku.nextLine();
                String [] dizi=okunan.split(" ");
                for (int i = 0; i < dizi.length; i++) {
                    char yeni=dizi[i].charAt(0);
                    if(yeni>='0' && yeni<='9')
                        p.print(yeni+" ");            
                }
                p.println();
            }
            oku.close();
            p.close();
        } catch (IOException e) {
        }
        
    }
    
}

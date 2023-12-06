//kendisine parametre olarak gelen dosya içinde kaç tane 100 den büyük sayı olduğunu 
//bulup geri döndüren metodu çalışır sekildi veriniz.Dosyanın içinde sayılar bulunmaktadır
package vizeyeyonelik;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Vizeyeyonelik {
    public static int dosya(File fx) throws FileNotFoundException{
        Scanner fk=new Scanner(fx);
        int x,sayac=0;
        while(fk.hasNext()){
        x=fk.nextInt();
        if(x>=100) sayac++;
        }
        return sayac;
        }
    public static void main(String[] args) throws FileNotFoundException {
        File fx=new File("Ali.txt");
        System.out.println(dosya(fx));
        
        
    }
    
}

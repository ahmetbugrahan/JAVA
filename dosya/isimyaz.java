//klavyeden girilen stringler içerisinde ilk harfi a olanları swift.dat içine yazan programı yazınız
package dosya;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class isimyaz {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f1=new File("swift.dat");
        FileWriter f=new FileWriter(f1);
        f.write("ahmet");
        f.write("ali");
        f.write("adem");
        Scanner fd=new Scanner(f1);
        String s=fd.nextLine();
        System.out.println(s);
        fd.close();
        f.close();} 
            
        }
                
        


       
        
        
        
    

    

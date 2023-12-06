package dosyaislem;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class dosya_olustur {
    public void olustur(String klasor_adı){
    Scanner klavye=new Scanner(System.in);
    System.out.println("dosya ismini giriniz");
    String dosya_adi=klavye.next();
    System.out.println(klasor_adı+dosya_adi+".txt");
    try{
        File dosya=new File(klasor_adı+dosya_adi+".txt");
        dosya.createNewFile();
    }catch(IOException e){    
   }
  }
    public void listele(String klasor_adı,String k){
        File klasor =new File(klasor_adı);
        File[]dosyalar=klasor.listFiles();
        System.out.println(k+"ile başlayan dosyalar:");
        for (int i = 0; i < dosyalar.length; i++){
            String isim=dosyalar[i].getName();
            if(isim.startsWith(k)){
                System.out.println(isim);
            } 
        }
    }
    public static void main(String[] args){
        dosya_olustur f1=new dosya_olustur();
        System.out.println("kac tane dosya olusturlsun");
        Scanner klavye=new Scanner(System.in);
        int file_num=klavye.nextInt();
        String file_name="";
        for (int i = 0; i < file_num; i++) {
            f1.olustur("folder1/");    
        }
        f1.listele("folder1/", "a");
    }
}
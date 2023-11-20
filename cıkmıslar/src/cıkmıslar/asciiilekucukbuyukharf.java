/*Kalveyden bir karakter alan ve eğer küçük harf ise büyük harfe, büyük harf ise küçük harfe dönüştürüp ekrana
yazan Java kodunu yazınız? ( ASCII kodlar: A=65, a=97) NOT: .toUpperCase() ve .toLowerCase() fonksiyonları
kullanılmayacaktır.*/
package cıkmıslar;
import java.util.Scanner;
public class asciiilekucukbuyukharf {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("bir harf giriniz");
        char harf=klavye.nextLine().charAt(0);
        int ascii=harf;
        System.out.println(harf+"harfinin kod:"+ascii);
        if(ascii>=97&&ascii<=132){
            ascii=ascii-32;
            System.out.println((char)ascii);}
        else if(ascii>=65&&ascii<=96){
            ascii=ascii+32;
            System.out.println((char)ascii);
            
        
        
        }            
    }
}
        
        
    
        
    

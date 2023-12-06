/*
 */
package method_sorular;

import java.util.Scanner;

public class Methotsorular15 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("enter a string");
        String s=klavye.next();
        String x=ksayi(s);
        System.out.println(x);
            
        
    }
    public static String ksayi(String kelime){
        int sayac=0;
        for(int i=0;i<kelime.length();i++){
            if(kelime.charAt(i)==' '){
                sayac++;
            }
            
        }
        String empty = "Kelime Sayisi: " + (sayac);
        return empty;
    }
        
    
}

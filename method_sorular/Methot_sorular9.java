/*
 */
package method_sorular;

import java.util.Scanner;

public class Methot_sorular9 {
    public static int ksayi(String str){
        int sayac=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)>=97 && str.charAt(i)<=122) {
                sayac++; 
        }
    }
        return sayac;
}
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println(" enter a string");
        String str=klavye.next();
        klavye.close();
        System.out.println("number of lowercase letters = "+ksayi(str));
        
    }
}

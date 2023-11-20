/*
 * Klavyeden girilen 2 String içinde yerleri ve değeri aynı olan elamanları bulup ekrana yazan programı yazınız?
 */
package cıkmıslar;

import java.util.Scanner;

public class ikistringkarsılastır {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("2 tane string giriniz");
        String s=oku.next();
        String z=oku.next();
        int sayac=0;
        for(int i=0;i<s.length();i++){
            for (int j = 0; j < z.length(); j++) {
                if(s.charAt(i)==z.charAt(j))
                    sayac++;
            }
       
                
        }
        if(sayac==s.length())
            System.out.println("iki string esit");
        else
            System.out.println("İki String eşit değil");
        
        
        
    }
    
}

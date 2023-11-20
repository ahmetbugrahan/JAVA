/*
Klavyeden girilen String içinde kaç adet rakam girildiğini bulup ekrana yazan ve bu rakamların hangileri olduğunu da
ekrana yazan programı yapınız?
 */
package cıkmıslar;

import java.util.Scanner;

public class kacrakam {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("string giriniz");
        String s=oku.next();
        int sayac=0;
        int i;
        for(i=0;i<s.length();i++){
                if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                sayac++;
                System.out.println(s.charAt(i)+" rakamı vardır");
                }
        }
        System.out.println((sayac)+" tane vardır");
        
    }
    
               
        
        
            
        
   
    }
    


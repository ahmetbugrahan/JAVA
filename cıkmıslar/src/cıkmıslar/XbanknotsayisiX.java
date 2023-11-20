/*
 1,5,10,20,50,100 liralık banknotların en az kullanılması 
*/
package cıkmıslar;

import java.util.Scanner;


public class XbanknotsayisiX {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("kac tl oldugunu giriniz");
        int para=oku.nextInt();
        int ikiyuz,yuz,elli,yirmi,on;
        if(para%10==0){
             ikiyuz=para/200;
            int kalan=para%200;
             yuz=kalan/100;
            kalan=kalan%100;
             elli=kalan/50;
            kalan=kalan%50;
             yirmi=kalan/20;
            kalan=kalan%20;
             on=kalan/10;
            kalan=kalan%10;  
            System.out.println("200:"+ikiyuz+" yuz:"+yuz+" elli:"+elli+" yirmi:"+yirmi+" on:"+on);   
        }
        else System.out.println("Bu miktar verilmez onun katlarını girin");                           
                          
        }
        
    }


            
        
            
            
            
            
        
        
    

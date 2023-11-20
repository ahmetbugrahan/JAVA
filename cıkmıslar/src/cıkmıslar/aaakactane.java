/*Klavyeden girilen String içinde kaç adet ”aaa”
karakterinin olduğunu bulan Java programını yazınız.
*/
package cıkmıslar;

import java.util.Scanner;


public class aaakactane{
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("bir STRING giriniz");
        String s=oku.next();
        int sayac=0;
        for(int i=0;i<s.length()-2;i++){
            if(s.charAt(i)=='a'&&s.charAt(i+1)=='a'&&s.charAt(i+2)=='a')
                sayac++;
        }
        System.out.println(sayac+" tane vardır");
        
            
      
            
        }
                    
                        
                    
            
        
        
        
        
    }
    


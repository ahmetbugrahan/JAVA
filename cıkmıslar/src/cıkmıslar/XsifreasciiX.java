/*
 *Klavyeden İngilizce olarak girilen bir kelimeyi (String) şifrelemek istiyoruz. Şifreleme işlemi her bir karakterin kendisinden
sonraki karakter ile yer değiştirmesidir. Bu basit şifrelemeyi gerçekleştiren Java kodunu veriniz. Örnek: Klavyeden WATER girilmiş
ise şifrelenmiş String XBUFS olacaktır.
 */
package cıkmıslar;

import java.util.Scanner;


public class XsifreasciiX {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        String s=oku.next();
        int x;
        for(int i=0;i<s.length();i++){
            char harf=s.charAt(i);
            int ascii=harf;
            ascii=ascii+1;
            System.out.println((char)ascii);
            
        }
       
        }
            
        
        
    }
    

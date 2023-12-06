/*
 *kendisine parametre olarak gelen stringi küçük harflerine çeviren program 
 */
package rekürsif;

import java.util.Scanner;

public class harf_donusturme {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        String s=klavye.next();
        String y=kharf(s);
        System.out.println(y);
    }
    public static String kharf(String kelime){
        String bos="";
        for(int i=0;i<kelime.length();i++){
            if(kelime.charAt(i)>='A'&&kelime.charAt(i)<='Z'){
                bos=bos+(char)(kelime.charAt(i)+32);
            }
            else{
                bos=bos+kelime.charAt(i);
            }
                 
        }
        return bos;
    }
}
    


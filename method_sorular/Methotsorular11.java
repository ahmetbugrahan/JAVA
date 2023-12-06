/*kendisine parametre olarak gelen stringdeki küçük harfleri büyük yapan program
 */
package method_sorular;

import java.util.Scanner;

public class Methotsorular11 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("enter a string");
        String s=klavye.next();        
        String y=buyuk(s);
        System.out.println(y);
        
    }
    public static String buyuk(String kelime){
        String bos="";
        for(int i=0;i<kelime.length();i++){
            if(kelime.charAt(i)>='a'&&kelime.charAt(i)<='z'){
                bos=bos+(char)(kelime.charAt(i)-32);
            }
            else
                bos=bos+kelime.charAt(i);
        }
        return bos;
    }
}

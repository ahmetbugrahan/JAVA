
package method_sorular;

import java.util.Scanner;


public class Methotsorular17 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("enter a string");
        String s=klavye.next();
        String y=polindrom(s);
        System.out.println(y);
    }
    public static String polindrom(String kelime){
        String bos="";
        int bas=0;
        int son=kelime.length()-1;
        while(bas<son){
            if(kelime.charAt(bas)!=kelime.charAt(son)){
                break;
            }
            bas++;
            son--;
            
        }
        if(kelime.charAt(bas)==kelime.charAt(son)){
                bos="polindromdur";
            }
            else
                bos="polindrom değildir";
        return bos;
    }
    
}

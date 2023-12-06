
package method_sorular;

import java.util.Scanner;


public class Methotsorular13 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        String s=klavye.next();
        int y=aaa(s);
        System.out.println(y);
    }
    public static int aaa(String kelime){
        int sayac=0;
        for(int i=0;i<=kelime.length()-2;i++){
            if(kelime.charAt(i)=='a' && kelime.charAt(i+1)=='a'){
                sayac++;
            }
        }
        return sayac;
    }
}

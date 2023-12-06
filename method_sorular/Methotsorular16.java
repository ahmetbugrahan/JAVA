
package method_sorular;

import java.util.Scanner;


public class Methotsorular16 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("enter a string");
        String s=klavye.next();
        String y=control(s);
        System.out.println(y);
    }
    public static String control(String kelime){
        String bos="";
        boolean b=true;
        for(int i=0;i<kelime.length();i++){
            b = kelime.charAt(i)=='a';
        }
        if(b==true){
            bos="a karakteri vardır";
        }
        else{
            bos="a karakteri yoktur";    
        }
        return bos;
    }
    
    
}

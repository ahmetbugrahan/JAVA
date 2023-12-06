/*kendisine parametre olarak gelen 2 stringden büyük olanını geri döndüren program*/
package method_sorular;

import java.util.Scanner;


public class Methotsorular14 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("enter 2 string");
        String s1=klavye.next();
        String s2=klavye.next();
        String b=stringmax(s1,s2);
        System.out.println(b);
    }
    public static String stringmax(String s1,String s2){
        String maksstring="";
        if(s1.length()>s2.length()){
            maksstring=s1;}
        
        else if(s2.length()>s1.length()){
            maksstring=s2;}
        return maksstring;
        
               
    }
    
    
}

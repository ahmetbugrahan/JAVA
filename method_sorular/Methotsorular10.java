/*kendidine parametre olarak gelen stringi ters çevirip geri döndüren programı yazınız
 */
package method_sorular;

import java.util.Scanner;

public class Methotsorular10 {
    public static String ters(String y) {
        String bos="";
        for(int i=y.length()-1;i>=0;i--){
            char c=y.charAt(i);
            bos+=c;
        }
        return bos;
        
    }
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        String y=klavye.next();
        klavye.close();
        System.out.println(ters(y));
    }
}

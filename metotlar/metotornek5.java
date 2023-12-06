/*kendisine parametre olarak gelen stringi büyük harflerle çeviren
 */
package metotlar;

import java.util.Scanner;

public class metotornek5 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        String s=k.nextLine();
        String x=buyuk(s);
        System.out.println(x);
        
    }
    public static String buyuk(String kelime){
        String bos="";
        for(int i=0;i<kelime.length();i++){
            if(kelime.charAt(i)>='a'&&kelime.charAt(i)<='z'){
                bos+=(char)(kelime.charAt(i)-32);
            }
            else
                bos+=kelime.charAt(i);
        }
        return bos;
        
    }
    
}

/*kendisine parametre olarak gelen iki boyutlu string dizisindeki en uzun stringi geri döndüren programı yazınız
 */
package method_sorular;

import java.util.Scanner;

public class Methotsorular29 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        String [][] dizi=new String [3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                dizi[i][j]=klavye.next();
            }
        }
        String s=enuzun(dizi);
        System.out.println(s);
    }
    public static String enuzun(String[][]s){
        int enb=s[0][0].length();
        String enbd="";
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(enb<s[i][j].length()){
                    enb=s[i][j].length();
                    enbd=s[i][j];
                }
                else
                    enbd=s[0][0];
            }
        }
        return enbd;
    }
}

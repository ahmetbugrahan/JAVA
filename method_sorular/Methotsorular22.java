/*kendisine parametre olarak helen string dizisindeki en uzun stringin oldugu inidisi geri döndüren program
 */
package method_sorular;

import java.util.Scanner;

public class Methotsorular22 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        String[]dizi=new String[5];
        for(int i=0;i<5;i++){
            dizi[i]=k.next();
        }
        int list=maks(dizi);
        System.out.println(list);
    }
    public static int maks(String arr[]){
        int sayac=0;
        int enb=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<arr[i].length();j++){
                sayac++;            
            }
            if(sayac>enb){
                enb=sayac;}
            sayac=0;
            
        }
        return enb;
    }
}

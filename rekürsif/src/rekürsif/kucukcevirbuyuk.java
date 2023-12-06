/*
 *kendisine parametre olarak gelen iki boyutlu string dizisindeki küçük harfleri  çeviren metodu yazınz
 */
package rekürsif;

import java.util.Scanner;

public class kucukcevirbuyuk {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        String dizi[][]=new String[2][2];
        String list[][]=new String[2][2];
        for(int i=0;i<dizi.length;i++){
            for(int j=0;j<dizi[i].length;j++){
                dizi[i][j]=klavye.next();
            }
        }
        yazdir(dizi);
        list=kharf(dizi);
        yazdir(list);
    }
    public static void yazdir(String[][] y){
         for(int i=0;i<y.length;i++){
            for(int j=0;j<y[i].length;j++){
                System.out.print(y[i][j]+" ");
            }
             System.out.println("");
        }
    }
    public static String[][]kharf(String[][]y){
        String bos[][]=new String[2][2];
        for (int i = 0; i < y.length; i++) 
            for (int j = 0; j < bos[i].length; j++) 
                bos[i][j]=y[i][j].toLowerCase();
         return bos;
      
    }
}

/*Kendisine parametre olarak gelen iki boyutlu tamsayı dizisindeki en büyük sayıyı geri döndüren methodu yazınız.*/
package method_sorular;

import java.util.Scanner;

public class Methotsorular26 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int dizi[][]=new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                dizi[i][j]=k.nextInt();
            }
        }
        int y=enb(dizi);
        System.out.println(y);
    }
    public static int enb(int a[][]){
        int bsayi = 0;
        a[0][0]=bsayi;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(a[i][j]>bsayi){
                    bsayi=a[i][j];
                }
            }
        }
        return bsayi;
    }
    
}

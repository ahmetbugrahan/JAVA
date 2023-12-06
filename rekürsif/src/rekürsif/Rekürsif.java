/*
 *kendisine parametre olark gelen n tam sayısına kadar olan tam sayıların toplamını rekürsif olarak yazınız
 */
package rekürsif;

import java.util.Scanner;

public class Rekürsif {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int sayi=klavye.nextInt();
        int x=toplam(sayi);
        System.out.println(x);
    }
    public static int toplam(int a){
        if(a==1){
            return 1;
        }
        else{
            return a+toplam(a-1);
        }
    }
}

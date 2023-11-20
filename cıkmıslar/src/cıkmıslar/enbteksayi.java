/*10 elemanlı tam sayı dizisinde en büyük tek tam sayıyı bulan program
 */
package cıkmıslar;

import java.util.Scanner;

public class enbteksayi {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int t[] = new int[10];

        for (int i = 0; i < 10; i++) {
            t[i] = k.nextInt();
        }
        int max = t[0];
        for (int i = 0; i < 10; i++) {
            if (t[i] > max && t[i]%2==1) {
                max = t[i];
            }
        }
        if(max==2){
            System.out.println(" tek tam sayı bulunmamaktadır");}
         else{
        System.out.println(max);}
    }
}

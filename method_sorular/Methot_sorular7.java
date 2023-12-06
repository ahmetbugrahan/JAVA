/*kendisine parametre olarak gelen tam sayının ondan önceki tam sayılarının toplamı
 */
package method_sorular;

import java.util.Scanner;

public class Methot_sorular7 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("enter a integer");
        int num=klavye.nextInt();
        int x=top(num);
        System.out.println(x);
    }
    public static int top(int sayi){
        int t=0;
        for(int i=0;i<sayi;i++){
            t=t+(i+1);
        }
        return t;    }
}

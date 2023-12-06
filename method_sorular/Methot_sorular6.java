/*
 *kendisine parametre olarak gelen pozitif tam sayının faktöriyeli 
 */
package method_sorular;

import java.util.Scanner;

public class Methot_sorular6 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi =klavye.nextInt();
        int x=fact(sayi);
        System.out.println(x);
        
    }
    public static int fact(int y){
        int f=1;
        for(int i=0;i<y;i++){
            f=f*(i+1);
        }
        return f;
            
    }
}

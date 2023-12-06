/*
 *kendisine parametre olarak gelen iki tam sayının a üzeri b sini hesaplayıp geri döndüren program
 */
package method_sorular;

import java.util.Scanner;

public class Method_sorular2 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int x=k.nextInt();
        int y=k.nextInt();
        int f=us(x,y);
        System.out.println(f);
    }
    public static int us(int a,int b){
        int f=1;
        for(int i=0;i<b;i++){
            f=f*a;
        }
        return f;
    }
   
    
}

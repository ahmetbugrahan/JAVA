/*n . fibonacci sayısını geri döndüren programı yazınız
 */
package method_sorular;

import java.util.Scanner;

public class Methot_sorular5 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("fibonaccinin kaçıncı elemanı?");
        int sayi=k.nextInt();
        int x=fibo(sayi);
        System.out.println(x);
    }
    public static int fibo(int y){
        int a=0,b=1,c;
        if(y==0){
            return a;
        }
        for(int i=0;i<y;i++){
            c=a+b;
            a=b;
            b=c; 
        }
        return b;
        
       
    }
}

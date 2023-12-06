/*kendisine parametre olarak gelen tam sayı dizisinin her elemanını bir attırıp geri döndüren programı yazınız
 */
package method_sorular;

import java.util.Scanner;


public class Methotsorular21 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int dizi[]=new int[5];
        int list[]=new int[5];        
        for(int i=0;i<5;i++){
            dizi[i]=k.nextInt();
        }
        list=top(dizi);
        for(int i=0;i<5;i++){
            System.out.println(list[i]);
        }
        
    }
    public static int[]top(int arr[]){
        int t=0;
        int tdizi[]=new int[5];
        for(int i=0;i<5;i++){
            tdizi[i]=arr[i]+1;
        }
        return tdizi;
    }
}

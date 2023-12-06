/*kendisine parametre olarak gelen tam sayı dizisindeki en büyük ve en küçük tam sayıyı geri döndüren programı yazınız
*/
package method_sorular;

import java.util.Scanner;

public class Methotsorular24 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int dizi[]=new int[5];
        int list[]=new int[2];
        for(int i=0;i<dizi.length;i++){
            dizi[i]=k.nextInt();        
         }
        list=enbenk(dizi);
        System.out.println(list[0]+""+list[1]);
    }
    public static int [] enbenk(int [] arr){
        int a[]=new int[2];
        int enb=arr[0];
        int enk=arr[0];
        for(int i=1;i<5;i++){
            if(arr[i]>enb){
                enb=arr[i];
            }
            if(arr[i]<enk){
                enk=arr[i];
            }
        }
        a[1]=enk;
        a[0]=enb;
        return a;
    }
    
}

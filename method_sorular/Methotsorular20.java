/*kendisine parametre olarak gelen tam sayı dizisinin sıralı olup olmadıgını geri döndüren programı yazınz*/
package method_sorular;

import java.util.Scanner;

public class Methotsorular20 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int dizi[]=new int [5];
        for(int i=0;i<5;i++){
            dizi[i]=k.nextInt();
        }
        boolean x=sirali(dizi);
        System.out.println(x);
    }
    public static boolean sirali(int [] dizi){
        int enb = 0;
        dizi[0]=enb;
        boolean y=true;
        for(int i=1;i<dizi.length;i++){
            if(dizi[i]>enb){
                enb=dizi[i];
                y=true;
            }
            else{
                y=false;
                break;
            }
            
                
        }
        return y;
        
    }
    
    
}

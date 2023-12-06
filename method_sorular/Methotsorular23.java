/*kendisine parametre olarak gelen sayı dizisindeki en büyük 2. sayıyı geri döndüren program
 */
package method_sorular;

import java.util.Scanner;

public class Methotsorular23 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int dizi[]=new int[5];
        for(int i=0;i<5;i++){
            dizi[i]=k.nextInt();}
        int list=ebiki(dizi);
        System.out.println(list);    
    }

    
    public static int ebiki(int [] arr){
        int enb1,enb2;
        if(arr[0]>arr[1]){
                enb1=arr[0];
                enb2=arr[1];}
        else{
                enb2=arr[0];
                enb1=arr[1];}
        for(int i=2;i<arr.length;i++){
            if(arr[i]>enb1){
                enb2=enb1;
                enb1=arr[i];}
            if(arr[i]>enb2&&arr[i]<enb1){
                enb2=arr[i];}
             }
        return enb2;
    }
 
}

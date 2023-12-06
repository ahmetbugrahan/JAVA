package method_sorular;

import java.util.Scanner;

public class Methotsorular18 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("enter a integer type array");
        int dizi[]=new int[5];
        for(int i=0;i<dizi.length;i++){
            dizi[i]=klavye.nextInt();
        }
        int x=toplam(dizi);
        System.out.println(x);
        
    }
    public static int toplam(int[]arr){
        int toplam=0;
        for(int i=0;i<arr.length;i++){
            toplam=toplam+arr[i];
        }
        return toplam;
    }
    
    
    
}


package cıkmıslar;

import java.util.Scanner;

public class enbuyukkackez {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int enb=Integer.MIN_VALUE,say=0,sayi;
        while(true){
            System.out.println("Sayi girisi:");
            sayi=oku.nextInt();
            if(sayi==0)
                break;
            if(sayi>enb){
                enb=sayi;
                say=1;
            }
            else if(sayi==enb)
                say++;
        }
        System.out.println("En buyuk sayi:"+enb);
        System.out.println("Tekrar:"+say);
    }
    
}

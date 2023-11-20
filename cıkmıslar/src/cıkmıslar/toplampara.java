/*
 Bir çocuğa babası, n. yaş gününde n lira para vermektedir ve bu para %10 faiz veren bir banka hesabına
yatırılmaktadır. Çocuğun 23. yaş gününde toplam parasını bulan bir Java programı yazınız?
 */
package cıkmıslar;

public class toplampara {
    public static void main(String[] args) {
        double t=1;
        for(double n=1;n<=23;n++){
            t=t+(n*n)+n/10;
        }
        System.out.println(t);
        
    }
    
}

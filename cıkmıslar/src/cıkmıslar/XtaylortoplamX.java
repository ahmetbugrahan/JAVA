/*cos(x) ‘in değerini hesaplamak için aşağıda
Taylor serisi verilmiştir. Klavyeden radyan cinsinden
girilen (0 .0 ile 6.28 arasında) açının değerini ilk 10 terim
için hesaplayan Java programı veriniz.
NOT: Math.pow(x,y) fonksiyonu x y değerini hesaplar.
 */
package cıkmıslar;

import java.util.Scanner;


public class XtaylortoplamX {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("radyan giriniz");
        double x = oku.nextDouble();
        double t = 1.0;
        double a = (double)Math.toRadians(x);
        System.out.println(x+" Açı = " + a+ " radayandır");
        int isaret=-1;
        for(int i=2;i<=18;i=i+2){
            int fact=1;
            for(int j=1;j<=i;j++){
                fact=j*fact;}
            t=t+isaret*(Math.pow(a, i)/(double)fact);
            isaret=isaret*(-1);
           
                   
        }
         System.out.println(t);
    }
}
       
        
            
 

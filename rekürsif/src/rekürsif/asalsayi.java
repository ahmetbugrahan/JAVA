/*kendisine parametre olarak gelen sayıya kadar olan sayılardan asal olanları geri döndüren
 *rekürsif fonksiyonu yaznız
 */
package rekürsif;

import java.util.Random;

public class asalsayi {
    public static String asalsayi(int a,int i,int n){
        if(i==a){
            return "";
        }
        else{
            if(n==i) return asalsayi(a,i+1,2);
            else if(i%n==0){
                return asalsayi(a,i,n+1)+i;
            }
            else{ 
                return asalsayi(a,i,n+1);}
        }
    }
    public static void main(String[] args) {
        Random r=new Random();
        int sayi=r.nextInt(50);
        System.out.println(sayi);
        int x[]=new int[sayi];
        String s=asalsayi(sayi,2,2);
        System.out.println(s);
        }
    }
    


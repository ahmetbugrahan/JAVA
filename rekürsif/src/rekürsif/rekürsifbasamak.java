/*
 *kendisine parametre olarak gelen sayının kaç basamaklı oldugunun hespalayan
 */
package rekürsif;

import java.util.Scanner;

public class rekürsifbasamak {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int sayi=klavye.nextInt();
       
        System.out.println(basamak(sayi));
    }
    public static int basamak(int a){
        if(a>=-9&&a<=9){
            return 1;
        }
        else{
            return 1+basamak(a/10);
        }
    }
        
    
}

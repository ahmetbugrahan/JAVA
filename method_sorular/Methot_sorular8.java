/*
 *kendisine parametre olarak gelen 2 tam sayıdan büyük olanı geri döndüren programı yazınız
 */
package method_sorular;

import java.util.Scanner;

public class Methot_sorular8 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("enter 2 integer");
        int num1=klavye.nextInt();
        int num2=klavye.nextInt();
        int x=enb(num1,num2);
        System.out.println(x);
    }
    public static int enb(int num1,int num2){
        int b=0;
        if(num1>num2){
            b=num1;
        }
        else
            b=num2;
    return b;
    }
    
    
}

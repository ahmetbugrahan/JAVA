/*Kendisine parametre olarak gelen 
 */
package cıkmıslar;

import java.util.Random;

public class fibonacci {
    public static void main(String[] args) {
        Random r=new Random();
        int ind=r.nextInt(39)+1;
        System.out.println(ind+".eleman");
        System.out.println(fibonacci(ind)+"");
    }
    public static int fibonacci(int i){
        if(i==0||i==1){
            return i;
        }
        else
            return fibonacci(i-1)+fibonacci(i-2);
    }
}

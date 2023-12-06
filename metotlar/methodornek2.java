/*kendisine parametre olarak gelen iki sayının üssünü alan program
 */
package metotlar;

import java.util.Scanner;


public class methodornek2 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int y=k.nextInt();
        int x=k.nextInt();
        int z=us(x,y);
        System.out.println(z);
        
    }
    public static int us(int a,int b){
        int f=1;
        for(int i=0;i<b;i++){
            f=f*a;        
        }
        return f;
    }
}
    


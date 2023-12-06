/*f(x)=x2   f degeri method x değeri parametre olur
public static - return tip=int,double,String,void,int[] - Methodun ismi(parametreler) {
}
*/
/*kendisine parametre olarak gelen iki tam sayıyı toplayıp geri bölen ana methodu yazınız*/
package metotlar;

import java.util.Scanner;

public class Metotlar {

    public static void main(String[] args) {
        Scanner klavye =new Scanner(System.in);
        int x=klavye.nextInt();
        int y=klavye.nextInt();
        int z=klavye.nextInt();
        toplam(x,y,z);
        System.out.println(x+y+z);        
        
    
    }
    public static int toplam(int a,int b,int c) {
        return a+b+c;
        
    }
}

    


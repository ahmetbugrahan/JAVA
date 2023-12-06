/*kendisine parametre olarak gelen pozitif sayının kaç basamaklı olduğunu bulan ana program ve metotu yazınız
 */
package metotlar;

import java.util.Scanner;

public class methotornek4 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int y=k.nextInt();
        int x=basamak(y);
        System.out.println(x);   
    }
    public static int basamak(int a){
        int bass=0;
        while(a>0){
            bass++;
            a=a/10;
        }
        return bass;
    }
}

/*kendisine parametre olarak gelen tam sayının faktöriyelini hesaplayan programını yazınız
 */
package rekürsif;
public class Rekursif_faktoriyel {
    public static void main(String[] args) {
        int x=factor(3);
        System.out.println(x);
    }
    public static int factor(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*factor(n-1);
        }
    }
}

/*kendisine parametre olarak gelen sayıya kadarki toplamı hesaplayan
*/
package rekürsif;
public class Rekursif_toplam {
    public static void main(String[] args) {
        int x=toplam(5);
        System.out.println(x);
    }
    public static int toplam(int n){
        if(n==1)
            return 1;
        else
            return n+toplam(n-1);
    }
}

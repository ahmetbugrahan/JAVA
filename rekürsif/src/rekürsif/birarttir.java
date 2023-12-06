/*kendisine parametre olarak gelen sayı dizisindeki her bir elemanı bir atrttırıp geri döndüren program
 */
package rekürsif;
public class birarttir {
    public static void main(String[] args) {
        int x[]={1,2,3,4,5};
        x=birart(x,0);
        for (int i = 0; i < 5; i++) {
            System.out.println(x[i]);
        }
    }
    public static int[]birart(int d [],int n){
        if(n==d.length)
            return d;
        else
            d[n]=d[n]+1;
            return birart(d,n+1);
    }
}

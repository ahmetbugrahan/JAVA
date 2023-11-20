/*kendisine parametre olarak gelen tek boyutlu sayısal dizi içerisindekş negatif sayıların toplamını geri döndüren rekursif fonk yazınız
 */
package cıkmıslar;
public class rekursif_negatiftop {
    public static void main(String[] args) {
        int[]t={1,2,3,-1,-2,-3,-4,-5,-6,-7};
        int x=negatiftop(t,0,0);
        System.out.println(x);
    }
    public static int negatiftop(int [] d,int i, int n){
        if(i==d.length){
            return n;
        }
        else if(d[i]<0){
        return n+d[i]+negatiftop(d,i+1,n);
    }
        else
            return negatiftop(d,i+1,n);
    }
}

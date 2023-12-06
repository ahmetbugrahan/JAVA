/*kendisine parametre olarak gelen dizideki en büyük elamanı geri döndüren rekürsif fonksiyonu yazınız
 */
package rekürsif;

public class enbbul {
    public static void main(String[] args) {
        int x[]={3,1,5,7,2};
        int y=enbbul(x,0,0);
        System.out.println(y);}
    public static int enbbul(int []d,int i,int ind){
        int enb=d[0];
        if(i==d.length){
            return d[ind];
        }
        else if(d[i]>d[ind]){
            return enbbul(d,i+1,i);
        }
        else
            return enbbul(d,i+1,ind);
    }
}

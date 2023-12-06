/*kendisine parametre olarak gelen dizinin elemanlarını 1 attırıp geri döndüren programı
 */
package metotlar;


public class metotornek6 {
    public static void main(String[] args) {
        int x[]={1,1,1,1,1,1,1,1,1,1};
        int [] y=new int[10];
        y=artır(x);
        for(int i=0;i<y.length;i++){
            System.out.println(y[i]);
        }
    }
    public static int[] artır(int[]a){
        for(int i=0;i<a.length;i++){
            a[i]++;
        }
        return a;
    }
    
}

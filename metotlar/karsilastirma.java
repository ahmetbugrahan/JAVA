/*kendisine parametre olarak gelen iki diziden aynı indiste büyük olanı geri döndüren programı yazınız
 */
package metotlar;

import java.util.Arrays;

public class karsilastirma {
    public static int [] buyuk(int [] d1,int [] d2){
        int b[]=new int[d1.length];
        for (int i = 0; i < d2.length; i++) {
            if(d1[i]>d2[i]){
              b[i]=d1[i];  
            }
            else
                b[i]=d2[i];
            
        }
        return b;
    }
    public static void main(String[] args) {
        int[] x={1,3,4,7,4};
        int[] y={2,6,4,8,2};
        int enb[]=buyuk(x,y);
        System.out.println(Arrays.toString(buyuk(x,y)));
    }
}

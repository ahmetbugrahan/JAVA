/*kendisine parametre olarak gelen string dizisini ters çeviren rekürsif fonksiyonu yazunız
 */
package rekürsif;
public class terscevir {
    public static String tersDizi(int[] dizi, int i) {
        String bos="";
        if (i<0) return bos;
        else {
            return dizi[i] + tersDizi(dizi,i-1);
        }
    }
    public static void main(String[] args) {
        int y[]={1,2,3,4,5};
        String x=tersDizi(y,4);
        System.out.println(x);
    }
}


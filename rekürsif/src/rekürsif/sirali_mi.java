/*kendisine parametre olarak gelen tam sayı dizisinin sıralı olup olmadığını geri döndüren rekürsif metod yazınız
 */
package rekürsif;
public class sirali_mi {
    public static void main(String[] args) {
        int x[]={1,2,3,4,5};
        boolean t=sirali(x,0);
        System.out.println(t);
    }
    public static boolean sirali(int []d,int i){
        if(i==d.length-1)
            return true;
        else if(d[i]<d[i+1])
            return sirali(d,++i);
        else
            return false;       
    }
}

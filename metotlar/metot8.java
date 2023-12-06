/*kendisine parametre olarak verilen dizideki en büyük ve en küçük elemanı geri döndüren programı metotu yazınız 
 */
package metotlar;


public class metot8 {
    public static void main(String[] args) {
        int x[]={1,5,6,3,7};
        int[]y=new int[2];
        y=enbenk(x);
        System.out.println(y[0]+" "+y[1]);
    }
    public static int[] enbenk(int[] a){
        int enk=a[0];
        int enb=a[0];
        int list[]=new int[2];
        for(int i=1;i<a.length;i++){
            if(enk>a[i]){
                enk=a[i];
            }
            if(enb<a[i]){
                enb=a[i];
            }
            
        }
        list[0]=enk;
        list[1]=enb;
        return list;
        
    }
    
}

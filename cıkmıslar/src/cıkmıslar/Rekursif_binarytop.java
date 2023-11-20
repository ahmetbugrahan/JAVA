/*kendisine parametre olarak gelen 0 ve 1 lerde olusan iki tam sayı dizisinin ikilik tabanda toplamının rekürsif fonksiyonla yazı 
 */
package cıkmıslar;
public class Rekursif_binarytop {
    public static void main(String[] args) {
        int x[]={0,1,1,0,0};
        int y[]={1,1,0,0,1};
        int z[]=new int[6];
        int e[]=toplam(x,y,z,x.length-1,0);
       
    }
    public static int[]toplam(int[]a,int[]b,int[]c,int n,int elde){
        if(n!=-1){
            c[n+1]=a[n]+b[n]+elde;
            if(c[n+1]>=2){
                c[n+1]=c[n+1]-2;
                elde=1;
            }else{
                elde=0;}
        }
        else c[0]=elde;
        return c;
    }
}

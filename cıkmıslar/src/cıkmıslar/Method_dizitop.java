/*kendisine paramtre olarak gelen iki tam sayı dizisinin toplamı
 */
package cıkmıslar;
public class Method_dizitop {
    public static int[] toplam(int[]b,int a[]){
       int[]c=new int[a.length+1];
       int top,elde=0;
        for (int i = a.length-1; i >=0; i--) {
            top=(a[i]+b[i]+elde);
            if(top>10){
                top=top%10;
                elde=1;
            }
            else elde=0;
            c[i+1]=top;            
        }
        c[0]=elde;
        return c;
    }
    static void diziyazdir(int[] c){
        for (int i : c) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int x[]={1,0,3,7};
        int y[]={2,8,9,5};
        int[]c=toplam(x, y);
        diziyazdir(c);
        
       
        
    }
    
}

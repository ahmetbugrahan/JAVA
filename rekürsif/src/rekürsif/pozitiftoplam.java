/*kendisine parametre olarak gelen*/ 
package rekürsif;
public class pozitiftoplam {
    public static void main(String[] args) {
        int x[]={3,2,7,-6,4,-3,16,9,4,-1};
        int y=pozitif(x,0);
        System.out.println(y);
    }
    public static int pozitif(int [] d,int i){
        if(i==d.length)
            return 0;
        else if(d[i]>0)
            return d[i]+pozitif(d,++i);
        else
            return pozitif(d,++i);
    }
}

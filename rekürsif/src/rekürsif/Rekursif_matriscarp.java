/*kendisine parametre olarak gelen 2 matrisin çarpımını yapan rekürsif fonksiyonu yazınız
*/
package rekürsif;
public class Rekursif_matriscarp {
    public static void main(String[] args) {
        int[][] x = {{3, 2, 2}, {2, 1, 4}, {5, 1, 6}, {2, 1, 4}};
        int[][] y = {{1, 3, 5, 4}, {3, 3, 2, 4}, {2, 4, 5, 3}};
        int[][]s=new int [4][4]; 
        int[][]z=matriscarp(x,y,s,0,0,0,0);
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[i].length; j++) {
                System.out.print(z[i][j]+" ");                
            }
            System.out.println("");
        }
    }
    public static int[][]matriscarp(int[][]d1,int[][]d2,int[][]d3,int i,int j,int n,int top){
        if(i==d1.length){
            return d3;
        }else{
            if(n==d1[i].length){
                d3[i][j]=top;
                return matriscarp(d1,d2,d3,i,j+1,0,0);
            }
            else if(j==d2[n].length){
                return matriscarp(d1,d2,d3,i+1,0,0,0);
            }
            else
                return matriscarp(d1,d2,d3,i,j,n+1,top+(d1[i][n]*d2[n][j]));
        }
    }
}

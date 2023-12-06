/*kendisine paramatre olarak gelen 3x3 boyutlu iki matrisin toplamını geri döndüren mwethodu yazınız
 */
package method_sorular;
public class Methotsorular30 {
    public static void main(String[] args) {
        int[][]a={{1,2,3},{1,2,3},{1,2,3}};
        int[][]b={{3,4,5},{3,4,5},{3,4,5}};
        int[][]c=new int[3][3];
        c=matristop(a,b);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]);
            }
            System.out.println("");
        }
    }
    public static int[][] matristop(int d[][],int e[][]){
        int[][] f=new int[d.length][d.length];
        for(int i=0;i<d.length;i++){
            for(int j=0;j<d.length;j++){
                f[i][j]=d[i][j]+e[i][j];
            }
        }
        return f;
}
}

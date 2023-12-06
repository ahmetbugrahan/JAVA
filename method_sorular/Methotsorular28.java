/* kendisine parametre olarak gelen iki boyutlu tam sayı dizisindeki her bir satırın toplamını geri döndüren programı yazınız
 */
package method_sorular;
public class Methotsorular28 {
    public static void yazdir(int[][] d) {
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
            System.out.print(d[i][j] + " ");    
            }
            
        }
        System.out.println("");
    }
    public static int[][] diziuret(int n) {
        int[][] d = new int[n][n];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++) {
                d[i][j] = (int) (Math.random() * 10);
            }
            
        }

        return d;
    }
    public static String satirtop(int [][] d){
        int top=0;
        for (int i = 0; i < d.length; i++) {
            top=0;
            for (int j = 0; j < d.length; j++) {
                top=top+d[i][j];
            }
            System.out.println((i+1)+". satirin toplami:"+(top));
        }
        return "";
    }
    public static void main(String[] args) {
        int [][] dizi=diziuret(5);
        yazdir(dizi);
        System.out.println(satirtop(dizi));
        
    }
}
   
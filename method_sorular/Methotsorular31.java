/*kendisine parametre olarak gelen 10 elemanlı tam sayı dizisini bir saga döndüren programı yazınız
 */
package method_sorular;

public class Methotsorular31 {

    public static void main(String[] args) {
        int x[] = {1, 2, 3, 4, 5};
        int y[] = new int[5];
        y = kaydir(x);
        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
            
        }
    }

    public static int[] kaydir(int[] d) {
        int bos[]=new int [5];
        int yedek=d[4];
        for (int i = 1; i <= 4 ; i++) {
            bos[i]=d[i-1];
        }
        bos[0]=yedek;
        return bos;
    }

    }

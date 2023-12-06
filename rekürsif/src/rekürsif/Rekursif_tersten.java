/*kendisine parametre olarak geln stringdeki küçükleri büyük büyükleri küçük yapan rekürsif fonksiyonu yazınız
 *kendisine parametre olarak gelen stringi 
 */
package rekürsif;
public class Rekursif_tersten {
    public static void main(String[] args) {
        String str="Abcde";
        String y=ters(str,0);
        System.out.println(y);
    }
    public static String ters(String s,int i){
        if(i==s.length())
            return "";
        else
            return ters(s,i+1)+s.charAt(i);    
    }
    
}

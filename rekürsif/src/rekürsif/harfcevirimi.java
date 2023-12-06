/*kendisine parametre olarak geln dizinin her bir elemanını bir attırıp geri döndüren rekürsif fonk yazınız
 *kendisine parametre olarak gelen sayının kaç basamaklı olugunu yazan rekürsif fonk yazınız
 *kendisine parametre olarak gelen 2 stringdeki aynı indisteki karakterleri aynı olmasını saglayan rekürsif fonk yaznız
 * kendisine paramtre olarak gelen stringin polindrom oluğ olmadığını geri döndüren rekürsif fonk yazınız
 * kendisine parametre olarak gelen tam sayı kadar adınızı yazdıran programı yazınız
 *    ''         "      "       "   stringdeki boslukları silip stringi geri döndüren rekürsif fonk
 *    "          "      "       "   
 */
package rekürsif;
public class harfcevirimi {
    public static void main(String[] args) {
        String str="AliVElikIRkdOkuzellI";
        String y=buyuk(str,0);
        System.out.println(y);
    }
    public static String buyuk(String s,int i){
        if(i==s.length())
            return "";
        else if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
            return (char)(s.charAt(i)-32)+buyuk(s,i+1);
        }
        else
            return (char)(s.charAt(i)+32)+buyuk(s,i+1);
    }
    
}

    

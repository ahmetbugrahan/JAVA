/*kendisine parametre olarak gelen stringdeki kucuk karakterlerin sayısını rekürsif biçiminde yazınız
 */
package rekürsif;
public class kucukkarakter {
    public static void main(String[] args) {
        String str="aliAtabAk";
        int x=ksayi(str,0,0);
        String st=kucuk(str,0);
        System.out.println(x);
        System.out.println(st);
    }
    public static int ksayi(String s,int n,int i){
        if(i==s.length()){
            return 0;
        }
        else if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
            return 1+ksayi(s,n+1,i+1);
        }
        else
            return ksayi(s,n,i+1);         
    }
    public static String kucuk(String s,int i){
        if(i==s.length())
            return "";
        else if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
            return s.charAt(i)+kucuk(s,i+1);
        }
        else
            return kucuk(s,i+1);
    }
}

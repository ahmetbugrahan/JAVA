/*kendisine parametre olarak gelen n tam sayısı kadar adını yaz
*/
package metotlar;

import java.util.Scanner;


public class methot_ornekler {
    public static void adyaz(int n){
        for(int i=0;i<n;i++){
            System.out.println("Ali demir");
        }  
    }
    public static void main(String[]args){
        Scanner klavye=new Scanner(System.in);
        
        adyaz(6);
        System.out.println(bastop(456));
        System.out.println("basamak sayısı toplamı = "+bassayi(345));
        System.out.println(sayitop(4));
        System.out.println(enb(10,7));
        System.out.println(buyuk("abc","defeev"));
        String str=klavye.next();
        System.out.println(control(str));
        System.out.println(Reverse("ahmet"));
        System.out.println(rtoplam("12312"));
    }
    public static int bassayi(int sayi){
        int sayac=0;
        while(sayi>0){
            sayi=sayi/10;
            sayac++;
        }
        return sayac;
    }
    public static int bastop(int sayi){
        int top=0;
        while(sayi!=0){
            top=(sayi%10)+top;
            sayi=sayi/10;
        }
        return top;
    }
    public static int sayitop(int sayi){
        int top=0;
        for(int i=0;i<sayi;i++){
            top=top+i;
        }
        return top;
    }
    public static int enb(int sayi1,int sayi2){
        if(sayi1<sayi2){
            return sayi2;
        }
        else{
            return sayi1;
        }    
    }
    public static String buyuk(String s1,String s2 ){
        if(s1.length()>s2.length()){
            return s1;}
        else{
            return s2;}
    }
    public static boolean control(String s){
        boolean k=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                k=true;
                break;
            }
            
        }
        return k;
    }
    public static String Reverse(String a){
        String r="";
        for (int i = a.length()-1; i >= 0; i--) {
            r=a.charAt(i)+r;
        }
        return r;
    }
    public static int rtoplam(String a){
        int toplam=0;
        int temp;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)>='0'&&a.charAt(i)<='9'){
                temp=a.charAt(i)-48;
                toplam=toplam+temp;
            }
            
        }
        return toplam ;
    }
    
    
}

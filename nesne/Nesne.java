package nesne;
class ARABA{ // Soyuttur...
    public int t=10;// DATA Field veri alanı, değişkenler
    public int tekerlek_Sayisi=4;
    String renk="kırmızı";
    public void calis(){ // ACTIONS,BEHAVIOR bunlar kodda METHOD olarak 
              System.out.println("ARABA CALISTIR");         
}}
public class Nesne { // Ana Class...
    public static void main(String[] args) {
        ARABA sahin=new ARABA(); //sahin somuttur
        int x=sahin.tekerlek_Sayisi;
        System.out.println(x);//new ifadesi somutlastırır...
        sahin.calis();
    }   
}
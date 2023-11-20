package cıkmıslar;
public class Rekursif_armstrongsayi {
    static int amstrongrec(int sayi){
        if(sayi==0) return sayi;
        else return (int)Math.pow((sayi%10),3)+amstrongrec(sayi/10);
    }
    static void yaz(String isim,int n){
        if(n>0){
            System.out.println(isim);
            yaz(isim, n-1);
        }
    }
    static boolean toplaesit(int sayi){
        int top=0,orj=sayi;
        while(sayi>0){
            int rakam=sayi%10;
            System.out.println(rakam);
            rakam=rakam*rakam*rakam;
            sayi=sayi/10;
            top=top+rakam;
            
            
        }
        if(top==orj) return true;
        else return false;
    }
    public static void main(String[] args) {
        int sayi=407;
        if(toplaesit(sayi)==true)
            System.out.println("Amstron sayısı");
        else 
            System.out.println("amstrong degil");
        int sonuc=amstrongrec(sayi);
        System.out.println(sonuc);
        yaz("Ahmet",10);
       
    }
    
}

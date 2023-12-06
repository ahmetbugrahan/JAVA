/* 
*/
package vizeyeyonelik;
class urun{
   int id=1000;
   String isim="Sampuan";
   String birim="adet";
   double fiyat=17.50;
   public urun(String isim,String birim,double fiyat){
       this.isim=isim;
       this.fiyat=fiyat;
       this.birim=birim;
    }
   @Override
   public String toString(){
       return("isim adı"+isim+fiyat+"TL"+"birim fiyatı"+birim);
   }
}
class meyve extends urun{
    String orjin="Antalya";
    public meyve(String isim,String birim,double fiyat,String orjin){
        super(isim,birim,fiyat);
        this.orjin=orjin;
    }
    @Override
    public String toString(){
        return("urun ismi"+isim+fiyat+"TL"+"birim fiyatı"+birim+"yer"+orjin);
    }
}
class icecek extends urun{
    String marka="pepsi";
    String tür="gazlı";
    
    public icecek(String isim, String birim, double fiyat,String tür,String marka) {
        super(isim, birim, fiyat);
        this.marka=marka;
        this.tür=tür;
    }
    @Override
    public String toString(){
    return("ürün adı"+isim+"birim"+birim+fiyat+"TL"+"türü"+tür+"markası"+marka);
    }
}
public class soru8 {
    public static void main(String[] args) {
         urun u1 = new urun("sampuan", "adet", 17.50);
         icecek i1 = new icecek("Nar Suyu", "adet", 4.50, "Dimes", "Gazsız");
         meyve m1=new meyve("nar","kilo",6.00,"Antalya");
         System.out.println(u1.birim+u1.isim+u1.fiyat+u1.id);
    }
    
    
}

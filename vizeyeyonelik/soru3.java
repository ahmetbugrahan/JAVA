/*sınıf class ı içinde constuctor kullanmak suretiyle ogrenci sayısı,
dersin adı set edilicektir bu class içinde ders anlat metodu yazılacak ve 
bu metod kendi içinde sınıfta hoca oşup olmadıgını da kontrol edecektir bu yapıyı
olusturunuz
 */
package vizeyeyonelik;
class sınıf{
    private int ogrenci_sayisi;
    private String dersin_adi,hoca_adi;
    public sınıf(int sayi,String ders,String hoca){
        this.ogrenci_sayisi=sayi;
        this.dersin_adi=ders;
        this.hoca_adi=hoca;
    }
    public void dersanlat(){
        if(hoca_adi!=null){
            System.out.println("hoca sınıf içindedir");
        }
        else
            System.out.println("henüz sınıfa gelmemistir");
    }
}
public class soru3 {
    public static void main(String[] args) {
    sınıf bd4=new sınıf(70,"algoritma","");
    bd4.dersanlat();    
    }
    
}

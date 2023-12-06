/*
 */
package vizeyeyonelik;
interface sayi{
    int x=0;
}
interface rakam{
    int y=10;
    public void topla();
}
abstract class dogalsayi{
    public abstract void cikar();
}
class saymasayi extends dogalsayi implements sayi,rakam{
    @Override
    public void topla(){
        System.out.println("toplam metodu");
    }
    @Override
    public void cikar(){
        System.out.println("Çıkar metodu");
    }
    
}
class x extends saymasayi implements rakam{
    @Override
    public void topla(){
        System.out.println("x class ı içindeki toplam metodu");
    }
}
public class soru6 {
    public static void main(String[] args) {
        //dogalsayi z=new dogalsayi(); SOYUTTUR...
    }
}

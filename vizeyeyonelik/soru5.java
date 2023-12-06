/*Yılın ayları kullanılacaktır.1. ayda kar kürem yapılacaktır.6.ayda okul
karnesi alınacaktır 9. ayda okullar baslayacaktır
bu islemleri gerceklestiren oop yapınız
 */
package vizeyeyonelik;
interface aylar{
    String ay1="ocak",ay2="subat",ay6="haziran",ay9="eylul";
    public void karkureme();// Soyut method
    public void okulkarnesi();
    public void okulbaslar();
}
class sene implements aylar{
    public void karkureme(){System.out.println("1.ayda kar kurenir");}
    public void okulkarnesi(){System.out.println("6.ayda karne alınır");}
    public void okulbaslar(){System.out.println("9.ayda okul baslar");}
}
public class soru5 {
    public static void main(String[] args) {
        sene ikibin23=new sene();
        ikibin23.okulbaslar();
        System.out.println(aylar.ay6);
    }
    
    
}

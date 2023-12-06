/*toplum bildiginiz gibi aileden olusur 
  aile anne baba cocuklardan ibarettir 
  bir toplumu modelleyen class yapısını ve constructorlarını olusturunuz 
 */
package vizeyeyonelik;
class Aile{
    public String  anne,baba,cocuk1,cocuk2;
    public Aile(){
        anne="evin diregi";
        baba="evin her seyidir";
        cocuk1="evin guludur";
        cocuk2="evin guludur";
    }
}
class toplum{
    private Aile x1=new Aile(); // kompozisyon;
    private String isim;
    public toplum(){
        isim="turk toplumu";
        System.out.println(x1.anne);
        System.out.println(x1.baba);
        System.out.println(x1.cocuk1);
    }
}
public class soru4 {
    public static void main(String[] args) {
        toplum turk_toplumu=new toplum();
    }
    
}

/*CONSTRUCTOR:Class ile aynı isme sahip METODLAR...
 Başlangıç değeri ayarlamaları için kullanılır
 */
// not=parametreli constructor oldugu icin parametresiz constructor govdesi yazılmalıdır
package nesne;
class ARABA{
    String renk;
    int model_yili;
    public ARABA(){ //Constructor...
        System.out.println("Araba olusturucu icindeyiz.");
        renk="Siyah";
        model_yili=2022;
    }
    public ARABA (String color, int year){
        renk=color;
        model_yili=year;
    }
}
public class Constructor {
    public static void main(String[] args) {
        ARABA BMW=new ARABA();
        System.out.println(BMW.model_yili );
        ARABA reno=new ARABA("BEYAZ",1992);
        System.out.println(reno.model_yili+"   "+reno.renk);
        ARABA x=new ARABA();
    }
}
package polimorfizm;
abstract class araba{
    public void yurur(){
        System.out.println("araba yurur");
    }
    public abstract void hizli();
}
abstract class sahin extends araba{
    public abstract void yavaslar();
}
public class abstract2 extends sahin {
    public void yavaslar(){
        System.out.println("sahin yavaslar");
    }
    public void hizli(){
        System.out.println("araba hizlidir");
    }
    public static void main(String[] args) {
        abstract2 x=new abstract2();
        x.yavaslar(); x.hizli(); x.yurur();
    }
    
}

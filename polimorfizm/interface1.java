package polimorfizm;
interface hayvan{// EN soyut yapılardır
    public void yer();// bütün metotlar SOYUTTUR ama basına abstract yazmak gerekmez
    public int x=10;
}
abstract class etcil{
    public void etyer(){
        System.out.println("kedi et yer");
    }
}
class kedi extends etcil implements hayvan{
    public void yer(){
        System.out.println("kedi et yer");
    }
}
public class interface1 {
    public static void main(String[] args) {
        kedi british=new kedi();
        british.yer();
        System.out.println(hayvan.x);
        british.etyer();
        british.yer();
    }
}

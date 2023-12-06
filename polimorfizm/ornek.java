package polimorfizm;
class esya{
    public void degerli(){
        System.out.println("esyalar degerlidir");
    }
}
class TV extends esya{
    public void ekran(){
        System.out.println("Tv ekrana sahiptir");
    }
}
public class ornek {
    public static void main(String[] args) {
        esya masa =new esya();
        TV Lg=new TV();
        Lg.degerli();
        Lg.ekran();
        esya samsung=new TV();
    }
}

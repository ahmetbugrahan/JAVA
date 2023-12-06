package nesne;
class BaseKrediManager{
    public double hesapla(double tutar){
        return tutar*1.18;
    }
}
class TarımKrediManager extends BaseKrediManager{
    
}
class OgretmenKrediManager extends BaseKrediManager{
    
}
class OgrenciKrediManager extends BaseKrediManager{
    @Override//!!!   
    public double hesapla(double tutar){
        return tutar*1.1;
    }
}
public class overriding {
    public static void main(String[] args) {
        // OgretmenKrediManager ogretmenkredimanager= new OgretmenKrediManager();
        //System.out.println(ogretmenkredimanager.hesapla(100));
        BaseKrediManager[] kredimanagers=new BaseKrediManager[]{new OgretmenKrediManager(),new TarımKrediManager(),new OgrenciKrediManager()};
        for(BaseKrediManager kredimanager:kredimanagers){
            System.out.println(kredimanager.hesapla(1000));
        }
    } 
}

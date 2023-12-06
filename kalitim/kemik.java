package kalitim;
class kemk{
    public void kirilir(){
        System.out.println("kemik kıraılabilir");
    }
    
}
class deri extends kemk{// KALITIM
    public deri(){
        System.out.println("constructor deri");
    }
    public void kaplar(){
        System.out.println("kemik deri ile kaplıdır ");
    }
}
public class kemik {// ANA CLASS
    public deri x=new deri();
    public static void main(String[] args) {
        kemik ali =new kemik();
        ali.x.kirilir();// ERISIME DIKKAT!!! hem kompozisyon hem kalıtım mevcut
    }
    
}

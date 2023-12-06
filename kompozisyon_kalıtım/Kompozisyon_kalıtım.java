/*
 */
package kompozisyon_kalıtım;
class Motor{
    public void calisir(){
        System.out.println("MOTOR çalısır");
    }
}

class Araba{
    public Motor dizel=new Motor(); // KOMPOZISYON..
    public void yurur(){
        System.out.println("ARABA yurur");
        dizel.calisir();// Motor sınıfının elemanı
    }
}

public class Kompozisyon_kalıtım { // ANA CLASS
    public static void main(String[] args) {
        Araba sahin =new Araba();
        sahin.yurur();//sahin.dizel.calisir();
    }
    
}

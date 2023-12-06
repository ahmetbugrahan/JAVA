package kompozisyon_kalıtım;
class SINAV{
    public void vize(){
        System.out.println("Vize sınavı önemlidir");
    }
    public void FINAL(){  // private yapılara sadece class içindekiler         
        System.out.println("final sınavında enn az 50 alınmalıdır");
    }
}
public class sinav {// ANA Class
    SINAV mayis_ayi=new SINAV();
    public static void main(String[] args) {
        sinav x=new sinav();
        x.mayis_ayi.vize();// vize metoduna erisim yapılabilir..
        x.mayis_ayi.FINAL();
    
    }
}

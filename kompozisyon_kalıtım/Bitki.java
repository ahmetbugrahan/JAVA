
package kompozisyon_kalıtım;
class bitki{
    public bitki(){ // class ile aynı isimlidir
        System.out.println("Bitki construction calisir");
        su_ister();
    }
    private void su_ister(){
        System.out.println("bitki su ister");
    }
}
public class Bitki {
    public bitki papatya=new bitki();
    public static void main(String[] args) {
        bitki akasya = new bitki();
    }
    
}

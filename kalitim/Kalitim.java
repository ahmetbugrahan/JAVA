package kalitim;
class kedi{
    public void mirlar(){
        System.out.println("kedi mirlar");
    }
}
class kaplan extends kedi{ //kalıtımdır
    public kaplan(){
        System.out.println("kaplan constructor");
    }
    public void kukrer(){
        System.out.println("kaplan kukrer");
    }
}
public class Kalitim {
    public static void main(String[] args) {
        // kedi miyav =new kedi(); miyav.mirlar();
        kaplan sibirya=new kaplan();
        sibirya.kukrer();
        sibirya.mirlar();// mirlar metodu kalıtımdan bgeldi ve publictir...
    }
    
}

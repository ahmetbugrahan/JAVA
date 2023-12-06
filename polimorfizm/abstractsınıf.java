package polimorfizm;
abstract class memur{
    public abstract void mesai();
    public void calisir(){
        System.out.println("memur calisir");
    }
}
class sef extends memur{
    public void mesai(){
        System.out.println("memur mesaiye tabiidir");
    }
}
public class abstractsınıf {
    public static void main(String[] args) {
      sef ali =new sef();
      ali.calisir(); ali.mesai();
      memur ayse=new sef();
      ayse.calisir();ayse.mesai();   
     
    }
}

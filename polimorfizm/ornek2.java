package polimorfizm;
class ev{
    public void yasanir(){
        System.out.println("Ev içinde yasanır");
    }
}
class apartman extends ev{
    public void kat(){
        System.out.println("apartman dairesi katlardadır");
    }
}
class site extends apartman{
    public void ortam(){
        System.out.println("site ortamı güzeldir");
    }
}
public class ornek2 {
    public static void main(String[] args) {
      ev x=new ev();
      apartman y=new apartman();
      ev t=new apartman();
      apartman z=new site();
     
    }
}

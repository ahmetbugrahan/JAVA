package kompozisyon_kalıtım;
class deneme{
    public deneme(){
        System.out.println("hayvan class icindeyiz");
    }
}
class evcil_hayvan{
    hayvan kedi=new hayvan();
    public evcil_hayvan(){
        System.out.println("evcil hayvan calss icindeyiz");
    }
}
class ev_hayvani{
    evcil_hayvan kopek=new evcil_hayvan();
    public ev_hayvani(){
        System.out.println("ev hayvani classi içindeyiz");
    }
}
public class hayvan {
    ev_hayvani karabas=new ev_hayvani();
    public static void main(String[] args) {
        hayvan kangal=new hayvan();
    }
    
}

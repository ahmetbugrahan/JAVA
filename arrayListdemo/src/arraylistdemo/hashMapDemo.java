package arraylistdemo;

import java.util.HashMap;

public class hashMapDemo {
    public static void main(String[] args) {
        HashMap<String,String>sozluk=new HashMap<String,String>();
        sozluk.put("book", "kitap");
        sozluk.put("table", "masa");
        sozluk.put("computer", "bilgisayar");
        System.out.println(sozluk.get("table"));
        Customer customer=new Customer();
        for(String item:sozluk.keySet()){
            System.out.println("Eleman-"+item+" Deger-"+sozluk.get(item));
        }
        
    }
    
}

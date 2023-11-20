package arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListTypedDemo {
    public static void main(String[] args) {
        ArrayList<String> sehirler=new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("istanbul");
        sehirler.remove("istanbul");
        Collections.sort(sehirler);//Sıralama için kullanılır
        for(String s:sehirler){
            System.out.println(s);
        }
    }
   
}

package arraylistdemo;

import java.util.ArrayList;

public class ArrayListdemo {
    public static void main(String[] args) {
        ArrayList sayilar=new ArrayList();
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
        sayilar.set(2,100);
        
        sayilar.remove(0);
        System.out.println(sayilar.get(0));
        for(Object i:sayilar){
            System.out.println(1);
        }
    }
    
}

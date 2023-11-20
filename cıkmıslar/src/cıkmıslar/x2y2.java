/*
 x<y<z olmak üzere [0, 50] aralığında x 2 +y 2 =z 2
denklemini sağlayan [x, y, z] sayılarını ekranda gösteren
Java programını yazınız?
 */
package cıkmıslar;

/**
 *
 * @author ahmet
 */
public class x2y2 {
    public static void main(String[] args) {
        for(double z=0;z<=50;z++)
            for(double y=0;y<z;y++)
                for(double x=0;x<y;x++)
                    if(Math.pow(x, 2)+Math.pow(y, 2)==Math.pow(z, 2)){
                       
                        System.out.println(x);
                        System.out.println(y);
                        System.out.println(z);
                    
                }
     
        
        
                    
                        
                    
                
     
    }
    
}

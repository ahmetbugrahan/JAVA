/*kendisine paramtre olarak gelen rastgele 20 adet 3 sayının ucgeni tanımlayıp tanımlamaması
rekürsif olarak 
methot olarak
 */
package cıkmıslar;

import java.util.Random;

public class ucgen {
    public static void main(String[] args) {
        Random r=new Random();
        int dizi [][]=new int[20][3];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 3; j++) {
                dizi[i][j]=r.nextInt(100);
            }
            
        }
        for(int i=0;i<20;i++){
            for(int j=0;j<3;j++){
                System.out.println(dizi[i][j]);
            }
            System.out.println("");
        }
        boolean x=ucgen(dizi);
        System.out.println(x);
        boolean y=ucgenRekur(dizi,0);
        System.out.println(y);
        
    }
    public static boolean ucgen(int [][] d){
        boolean b=true;
        int j=0;
        for (int i = 0; i < d.length; i++) {
                if(d[i][j]+d[i][j+1]>d[i][j+2]&&d[i][j+1]+d[i][j+2]>d[i][j]&&d[i][j]+d[i][j+2]>d[i][j+1]){
                    b=true;
                }
                else
                    b=false;   
            }
        return b;
    }
    public static boolean ucgenRekur(int [][]d,int i){
        int j=0;
        if(i==20){
            return true;
        }
        else if(d[i][0]+d[i][1]>d[i][2]&&d[i][1]+d[i][2]>d[i][0]&&d[i][0]+d[i][2]>d[i][1]){
            return ucgenRekur(d,i+1);
        }
        else
            return false;
    }
}


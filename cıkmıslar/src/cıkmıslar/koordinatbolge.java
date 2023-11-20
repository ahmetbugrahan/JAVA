/*koordinat sistemi hangi bölge?
 */
package cıkmıslar;
 
import java.util.Scanner;

public class koordinatbolge {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("x değeri giriniz");
        System.out.println("y değeri giriniz");
        int x=oku.nextInt();
        int y=oku.nextInt();
        if(x>=0&&y>=0)
            System.out.println("1. bölgededir");
        else if (x>0&&y<0){
            System.out.println("4.bölgededir");}
        else if(x<0&&y>0)
            System.out.println("2. bölgededir");
        else if(x<0&&y<0)
            System.out.println("3.bölgededir");
        else if(x==0&&y!=0)
            System.out.println("y ekseni üzerinde");
        else if(x!=0&&y==0)
            System.out.println("x ekseni üzerindedir");
        
            
        
        
            
        
        
    }
    
}

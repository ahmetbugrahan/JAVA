/* kendisine paramatre olarak gelen a üssü b rekürsif 
*/
package rekürsif;
public class Rekkursif_us {
    public static void main(String[] args) {
        int x=us(2,7);
        System.out.println(x);
    }
    public static int us(int a,int b){
        if(b==0){
            return 1;}
        else{
            return a*us(a,b-1);}
    }
}    


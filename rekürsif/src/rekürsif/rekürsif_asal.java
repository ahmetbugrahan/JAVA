/*
 *kendisine parametre olarak gelen sayının asal olup olmadıgını bulan program
 */
package rekürsif;

public class rekürsif_asal {
    public static void main(String[] args) {
        boolean x=abul(19);
        if(x){
            System.out.println("asal");
        }
        else{
            System.out.println("asal degil");
        }
    }
    public static boolean abul(int a){
        int sayac=0;
        boolean x=true;
        for(int j=0;j<a;j++){
            if(a%j==0){
                x=false;
                break;
            }
        }
        return x;              
    }
}
    
        

    

/*kendisine parametre olarak gelen 
*/
package metotlar;




public class us_alma {
    public static int usalma(int a,int b){
        int sonuc=1;
        for(int i=0;i<b;i++){
            sonuc=a*sonuc;
        }
        return sonuc;
    }
    public static void main(String[] args) {
        System.out.println(usalma(3,4));
        
    }
    
}

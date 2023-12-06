package metotlar;

public class methotdiziornekler {
    public static void main(String[] args) {
        
    }
    public static int [] birArttır(int [] y){
        
        for (int i = 0; i < y.length; i++) {
            y[i]=y[i]+1;
            
        }
        return y;
    }
    public static boolean diziSırlama(int[]a){
        boolean k=true;
        int j=1;
        for (int i = 0; i <a.length; i++) {
            if(a[i]>a[j]){
                k=false;
                break;
            }
            j++;
        }
        return k;
    }
    
}

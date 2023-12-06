/*kendisine parametre olarak gelen 2 stringden ortak indisteki aynı elemanı geri döndüren rekürsif fonksiyonu yazınız
 */
package rekürsif;
public class indisleritop {
    public static void main(String[] args) {
        String y[]={"a","b","c","d","e"};
        String x[]={"z","b","d","a","e"};
        int sum=ayni(y,x,0);
        System.out.println(sum);
    }
    public static int ayni(String[]d,String[]e,int i){
        if(i==d.length){
            return 0;
        }
        else if(d[i]==e[i]){
            return i+ayni(d,e,i+1);       
    }
        else{
            return ayni(d,e,i+1);}
}
 
}
    

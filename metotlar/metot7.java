/*kendisine parametre olarak gelen 2 boyutlu sttirngin satırlarını birleştirip geri döndüren 
 */
package metotlar;


public class metot7 {
    public static void main(String[] args) {
        String  str [][]={{"abc","veli"},{"abc","de"}};
        String bos[]=new String [2];
        bos=birlestirme(str);
        System.out.println(bos[0]+" "+bos[1]);
        
  }
    public static String[] birlestirme(String[][] s){
        String []s2=new String[2];
        for(int i=0;i<s.length;i++){
            s2[i]="";
            for(int j=0;j<s[i].length;j++){
                s2[i]+=s[i][j];
            }
        }
        return s2;
    }
    
}

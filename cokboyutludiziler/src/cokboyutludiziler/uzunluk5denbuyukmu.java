
package cokboyutludiziler;
import java.util.Scanner;
public class uzunluk5denbuyukmu {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        String[][]list=new String[5][5];
        for(int i=0;i<list.length;i++){
            for(int j=0;j<list[i].length;j++){
                list[i][j]=k.next();
                if(list[i][j].length()>=5){
                    System.out.println(list[i][j]);
                }
            }
                
                    
            }
    }
    
}

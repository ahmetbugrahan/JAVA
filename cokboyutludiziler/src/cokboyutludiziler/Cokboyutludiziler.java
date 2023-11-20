
package cokboyutludiziler;

import java.util.Scanner;


public class Cokboyutludiziler {

    
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int top=0;
        int[][]list=new int[3][3];
        for(int i=0;i<list.length;i++){
            for(int j=0;j<list[i].length;j++){
            list[i][j]=k.nextInt();
                top+=list[i][j];
        }
        System.out.println(top);
        }
        for(int i=0;i<list.length;i++){
            for(int j=0;j<list[i].length;j++){
                list[i][j]=k.nextInt();
                
                
            }
            
        }
        for(int i=0;i<list.length;i++){
            for(int j=0;j<list[i].length;j++){
                System.out.print(list[i][j]);
            
            }
            
            System.out.println("");
        }
        
    }
    
}

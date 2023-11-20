/*İkilik tabandaki bir sayının ikiye tümleyeni, sağdan başlayıp ilk 1’e rastlayıncaya
kadar 1 de dahil tüm basamakları aynı bırakmak geriye kalanların ise 1 ise 0, 0 ise 1 yapılması ile
elde edilir. Aşağıdaki programda string olarak verilen bir S sayısının ikiye tümleyenini ST’de veren
programı tamamlayınız?*/
package cıkmıslar;
public class XikiliksayiX {   
    public static void main(String[] args) {
        String S="010101010000" ;
        boolean ilkbir=false;
        String ST="";
        int i=0;
        for(i=S.length()-1;i>=0;i--){
           if(S.charAt(i)!='1' && ilkbir==false){
               ST=S.charAt(i)+ST;               
           }
           else if(S.charAt(i)=='1' && ilkbir==false){
               ilkbir=true;
               ST=S.charAt(i)+ST;
           }
           else if(S.charAt(i)=='0')
               ST='1'+ST;
           else 
               ST='0'+ST;
            
            
            
            
            }
        System.out.println(S);
        System.out.println(ST);
        }
            
            
        
        
    }   

                
            
                
        
            
    
    


package rekürsif;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("2 tane sayi giriniz");
        int sum1=k.nextInt();
        int sum2=k.nextInt();
        int eb=ebob(sum1,sum2,0);
    }
    public static int ebob(int a,int b,int i){
        if(i==a){
            return 0;}
        else{ 
            if(a%i==0&&b%i==0){
                return i+ebob(a,b,i+1);}
            else
                return ebob(a,b,i+1);}}}

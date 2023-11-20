/*Klavyeden 100 tane tamsayı girilecektir. Bu sayılardan tam kare olanları ekrana yazan Java programını yazınız (Tamkare
9, 36, 49, 121 gibi karekökü tam olan sayılardır.*/
package cıkmıslar;

import java.util.Scanner;

public class tamkaresayi{
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        for(int i=0;i<100;i++){
            System.out.println("bir sayı giriniz");
            Byte sayi=oku.nextByte();
            Byte t=0;
            for(int j=0;j<sayi/2+1;j++){
                if(sayi==j*j){
                    t=1;
                break;}
                
            }
        if(t!=0)
                System.out.println(sayi+"tam kare sayıdır");
        else
                System.out.println(sayi+"tam kare sayı değildir");
        
        
        }
        }
    }




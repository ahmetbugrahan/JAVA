
package method_sorular;

public class Methotsorular25 {
    public static void main(String[] args) {
        int vnot[]={65,45,70,45,50};
        int fnot[]={70,30,55,55,60};
        double dizi[]=new double [5];
        dizi=ortnot(fnot,vnot);
        for (int i = 0; i < 5; i++) {
            System.out.println(dizi[i]);
        }
    }
    public static double[]ortnot(int[]a,int[]b){
        double bos[]=new double[5];
        for (int i = 0; i < 5; i++) {
            if(a[i]<50){
                i++;
                System.out.println((i+1)+". kisi ff kaldiniz");
            }
            else{
            bos[i]=(a[i]*0.6)+(b[i]*0.4);
            if(bos[i]<50){
                System.out.println((i+1)+".kişi kaldınız");
            }
            }
        }
        return bos;
    }
    }


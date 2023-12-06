/*
 *kendisine parametre olarak gelen
 */
package rekürsif;

public class integral_hesabi {
    public static void main(String[] args) {
        double h=0.00000001;
        int bas=2,son=6;
        double alan=0.0;
        double f1,f2;
        for(double i=bas;i<son;i=i+0.00000001){
            f1=i*i;
            f2=(i+h)*(i+h);
            alan=alan+(f1+f2)*h/2;
        }
        System.out.println(alan);
    }
}

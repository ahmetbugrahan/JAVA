package cıkmıslar;
public class Sericarpim {
    public static void main(String[] args) {
        int top=0;
        for(int i=1;i<=4;i++){
            int f=1;
            for (int j = 1; j <=5 ; j++) {
                f=f*j;
            }
            top=top+f;
        }
        System.out.println(top);
    }
}

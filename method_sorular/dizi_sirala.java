package method_sorular;

public class dizi_sirala {

    public static void yazdir(int[] d) {
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println("");
    }

    public static int[] diziuret(int n) {
        int[] d = new int[n];
        for (int i = 0; i < d.length; i++) {
            d[i] = (int) (Math.random() * 100);
        }

        return d;
    }

    public static int[] secmeli_sirala(int[] d) {
        for (int i = 0; i < d.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < d.length; j++) {
                if (d[j] < d[min]) {
                    min = j;
                }
            }
            int ara = d[i];
            d[i] = d[min];
            d[min] = ara;
        }
        return d;
    }

    public static int[] baloncuk_sirala(int[] d) {
        boolean degisti = true;
        while (degisti) {
            degisti = false;
            for (int j = 0; j < d.length - 1; j++) {
                if (d[j + 1] < d[j]) {
                    int ara = d[j];
                    d[j] = d[j + 1];
                    d[j + 1] = ara;
                    degisti=true;
                }
            }
        }
        return d;
    }

    public static void main(String[] args) {
        int[] dizi = diziuret(7);
        yazdir(dizi);
        int[] sonuc = secmeli_sirala(dizi);
        System.out.println("");
        yazdir(sonuc);

    }
}

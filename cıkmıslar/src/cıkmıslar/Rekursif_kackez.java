/*kendisine parametre olarak gelen karakterin stringde kaç kez geçtiğini bulan program
 */
package cıkmıslar;

public class Rekursif_kackez {

    public static int kackez(String s, char c) {
        if (s.length() < 1) {
            return 0;
        } else if (s.charAt(s.length() - 1) == c) {
            return 1 + kackez(s.substring(0, s.length() - 1), c);
        } else {
            return 0 + kackez(s.substring(0, s.length() - 1), c);
        }
    }

    public static void main(String[] args) {
        String y = "aabca";
        System.out.println(kackez(y, 'a'));
    }
}

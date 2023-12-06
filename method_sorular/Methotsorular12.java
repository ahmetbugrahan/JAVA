/*
 */
package method_sorular;

import java.util.Scanner;

public class Methotsorular12 {
    public static  String uppercase_lowercase(String str){
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>=65 && str.charAt(i)<=90) {
                char ch = str.charAt(i);
                ch = (char)(ch+32); 
                temp += ch;
            }
            else if (str.charAt(i)>=97 && str.charAt(i)<=122) {
                char ch = str.charAt(i);
                ch = (char)(ch-32); 
                temp += ch;
            }
        } 
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kelime giriniz: ");
        String str = sc.nextLine();
        sc.close();
        System.out.println(uppercase_lowercase(str));
    }
}

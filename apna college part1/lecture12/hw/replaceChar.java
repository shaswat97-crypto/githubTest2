import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class replaceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String orig = sc.next();
        String result = "";

        for(int i=0; i<orig.length(); i++) {
            char temp = orig.charAt(i);
            if(temp=='e') {
                result += "i";
            } else {
                result += temp;
            }
        }

        System.out.println(result);
    }
}

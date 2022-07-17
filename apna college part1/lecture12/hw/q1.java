import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        // System.out.println(len);
        String str[] = new String[len];

        //input
        for(int i=0; i<len; i++) {
            str[i] = sc.next();
        }

        //combine
        String combined = "";
        for(int i=0; i<len; i++) {
            combined += str[i];
        }

        System.out.println(combined);
        System.out.println(combined.length());
    }
}
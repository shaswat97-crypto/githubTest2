import java.util.Scanner;

public class userName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        int end = 0;
        //finding last char
        for(int i=0; i<email.length(); i++) {
            if(email.charAt(i) == '@') {
                end = i;
                break;
            }
        }
        String result = email.substring(0, end);
        System.out.println(result);
    }
}

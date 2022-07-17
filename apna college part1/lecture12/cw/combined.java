import java.util.Scanner;

public class combined {
    public static void main(String[] args) {
        // //strings
        // //declaration 
        // String name = "tone";
        // //taking input
        // Scanner sc = new Scanner(System.in);
        // String college = sc.nextLine();
        // System.out.println(college);
        // System.out.println(name+" "+college);
        // String nawa = name+college;
        // System.out.println(nawa.length());
        // for(int i=0; i<nawa.length(); i++){
        //     System.out.println(nawa.charAt(i));
        // }

        // //always use .equals() to compare strings.
        // //compares first unequal char from both strings
        // if(name.equals(college)) {
        //     System.out.println("same");
        // } else {
        //     System.out.println("different");
        // }

        //non primitive way to create a string
        //makes an object
        //new String("tone")

        //substring- returns part of a string
        //input is starting index and one more than last index(with zero indexing)

        String cll = "g.b. pant govt college";
        System.out.println(cll.substring(5,9));

        // String local = "231";
        // int number = Integer.parseInt(local);
        // System.out.println(number);

        int number = 1234;
        String local = Integer.toString(number);
        System.out.println(local.length());
    }
}
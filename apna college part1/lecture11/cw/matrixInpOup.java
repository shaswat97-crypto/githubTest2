package cw;

import java.util.*;

public class matrixInpOup{
    public static void main(String[] args) {
        //take 2-d array from user
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        int coulmns=sc.nextInt();
        int[][] nums = new int[rows][coulmns];
        //nested for loop
        //rows
        for(int i=0; i<rows; i++) {
            //columns
            for(int j=0; j<coulmns; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        //print back the same array
        //nested for loop
        //rows
        for(int i=0; i<rows; i++) {
            for(int j=0; j<coulmns; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
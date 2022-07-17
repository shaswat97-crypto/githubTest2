package cw;

import java.util.Scanner;

public class matrixSearch {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int rows = sc.nextInt();
            int columns = sc.nextInt();
            int[][] nums = new int[rows][columns];

            //input
            //rows
            for(int i=0; i<rows; i++){
                //columns
                for(int j=0; j<columns; j++){
                    nums[i][j] = sc.nextInt();
                }
            }

            System.out.println("search for");
            int n = sc.nextInt();

            //printing
            for(int i=0; i<rows; i++) {
                for(int j=0; j<columns; j++) {
                    System.out.print(nums[i][j]+" ");
                }
                System.out.println();
            }

            //searching
            //rows
            for(int i=0; i<rows; i++) {
                //columns
                for(int j=0; j<columns; j++) {
                    if(n==nums[i][j]) {
                        System.out.println("n found at ("+i+","+j+")");
                    }
                }
        }
    }
}

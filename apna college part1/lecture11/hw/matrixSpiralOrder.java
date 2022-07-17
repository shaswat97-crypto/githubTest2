package hw;

import java.util.Scanner;

public class matrixSpiralOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("rows");
        int rows = sc.nextInt();
        System.out.println("columns");
        int columns = sc.nextInt();

        int[][] nums = new int[rows][columns];
        int j=0;

        //input
        for(int i=0; i<rows; i++) {
            for(int k=0; k<columns; k++) {
                nums[i][k] = sc.nextInt();
            }
        }

        //output
        for(int i=0; i<rows; i++) {
            for(int k=0; k<columns; k++) {
                System.out.print(nums[i][k]+" ");
            }
            System.out.println();
        }
        //spiral
        //rows
        for(int i=0; i<rows; i++) {
            //print l->r if j=0, else print r->l
            if(j==0 || j==-1) {
                for(j=0; j<columns; j++) {
                    System.out.print(nums[i][j]+" ");
                }
            } else {
                for(j=columns-1; j>=0; j--) {
                    System.out.print(nums[i][j]+" ");
                    //System.out.println("j is "+j);
                } 
            }
        }
        System.out.println();
    }
}

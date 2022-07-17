package hw;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class matrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("rows");
        int rows = sc.nextInt();
        System.out.println("columns");
        int columns = sc.nextInt();

        int[][] nums = new int[rows][columns];

        //input
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        //transpose
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                System.out.print(nums[j][i]+" ");
            }
            System.out.println();
        }
    }
}

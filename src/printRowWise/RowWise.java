package printRowWise;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 24-03-2021
 * Time: 00:10
 */

public class RowWise {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] input_matrix = new int[rows] [cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                input_matrix[row] [col] = sc.nextInt();
            }
        }


        System.out.print("START, ");
        for (int row = 0; row < rows; row++) {
            if(row % 2 == 0) {
                int col = 0;    // initializing row with top
                while (col < cols) {
                    System.out.print(input_matrix[row] [col] + ", ");
                    col++;
                }
            }
            else {
                int col = cols - 1;     // initializing row with bottom
                while (col >= 0) {
                    System.out.print(input_matrix[row] [col] + ", ");
                    col--;
                }
            }
        }
        System.out.print("END");
    }
}

package Arrays_program;

import java.util.Scanner;

public class Martix_sum {
    public static void main(String[] args) {
        Martix_sum o = new Martix_sum();
        o.martix_add();
    }

    private void martix_add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row: ");
        int row = sc.nextInt();
        System.out.println("Enter the col: ");
        int col = sc.nextInt();
        int ar[][]= new int[row][col];
        int arr[][]= new int[row][col];
        int out[][]= new int[row][col];

        System.out.println("Enter the first value:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ar[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the second value:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("sum of matrix addition:");
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                out[i][j]=ar[i][j]+arr[i][j];
                System.out.print(out[i][j]+"   ");
            }
            System.out.println();
        }
    }
}

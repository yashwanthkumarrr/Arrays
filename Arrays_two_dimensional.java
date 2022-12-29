package Arrays_program;

import java.util.Scanner;

public class Arrays_two_dimensional {
    public static void main(String[] args) {
    Arrays_two_dimensional o = new Arrays_two_dimensional();
   // o.arra();
     //   o.arr();
        o.jagged();
    }

    private void jagged() {
        int [][] ar = new int[3][];
        ar[0] =new int[5];
        ar[1]= new int[3];
        ar[2]= new int[1];
        Scanner sc = new Scanner(System.in);
        int k =0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[k].length; j++) {
               ar[i][j]=sc.nextInt();
            }
            k++;
        }
        int p=0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[p].length; j++) { //5 j<3 1
                System.out.print(ar[i][j]+"  ");

            }
            p++;
            System.out.println();
        }


    }

    private void arr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the exam: ");
        int exam = sc.nextInt();
        int sem = sc.nextInt();
        int [][] ar = new int[exam][sem];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < sem; j++) {
                ar[i][j]= sc.nextInt();
              //  System.out.print(ar[i][j]+"   ");
            }
            System.out.println();

        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                System.out.print(ar[i][j]+"  ");

            }
            System.out.println();
        }

    }


    private void arra() {
                    //  1 2 3 4 5
        int ar[][] = {{1, 2, 3, 4, 5},
                      {6, 7, 8, 9, 10 },
                      {11, 12, 13, 14, 15}};
        System.out.println(ar.length);
        System.out.println(ar[1].length);

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                System.out.print(ar[i][j]+"  ");

            }
            System.out.println();
        }
    }
}

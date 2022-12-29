package Arrays_program;

import java.util.HashSet;

public class Arrays_program7_20 {
    public static void main(String[] args) {
        Arrays_program7_20 o =new Arrays_program7_20();
      //  o.placing_given_number_last_index(); //7
     //   o.how_many_times_given_ele_pre(); //8
      // o.finding_biggest_no(); //9 ,11

      // o.finding_smallest_no(); // 10 , 12
      //  o.finding_count_of_duplicate_elements_in_agiven_array();//13
       // o.finding_addition_of_odd_index_numbers_in_a_given_array();//14
      //  o.copy_arrays_rev_order();
       // o.copy_arrays();
      //  o.remove();
       // o.find_the_non_repeated_char();
       // o.Sum_of_2_elements_in_a_single_array_corresponding_to_10();
        //  o.split_arrays();
       // o.check_prime_num();
       // o.odd_element_present_in_the_even();
      //  o.arrays_interset();
       o.arrays_union();

    }

    private void arrays_union() {

        // [1, 2, 3, 4, 5, 6, 7, 8]
        // [2, 4, 6, 8, 10,12,14]
        //Union of two arrays: [1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14]
        int ar1[] = {1, 2, 3, 4, 5, 5, 6, 7, 8};
        int ar2[] = {2, 4, 11, 6, 8, 10, 12, 8, 14};
        int k =0;


        for (int i = 0; i < ar1.length; i++) {

        int count=0;

            for (int j = k; j < ar2.length; j++) {
                if(ar1[i]==ar2[j]){
                    count++;
                }
            }
            if (count==0)
                System.out.print(ar1[i]+" ");
            else {
                System.out.print(ar2[k]+" ");
                k++;
            }
            
        }
        for (int i = k; i <ar2.length ; i++) {
            System.out.print(ar2[i]+" ");
        }


       /* private void arrayUnion() {
        *//*[1, 2, 3, 4, 5, 6, 7, 8]
        Array 2 : [2, 4, 6, 8, 10, 12, 14]
        Union of two arrays: [1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14]*//*
            int ar1[] = {1, 2, 3, 4, 5, 6, 7, 8};
            int ar2[] = {2, 4, 6, 11, 8, 10, 12, 14};
            int flag = 0;

            System.out.print("Union of Two Arrays: ");
            for (int i = 0; i < ar1.length; i++) {
                System.out.print(ar1[i] + " ");
            }
            for (int i = 0; i < ar2.length; i++) {
                for (int j = 0; j < ar1.length; j++) {
                    if (ar2[i] != ar1[j]) { //2=2
                        flag = 1;

                    } else {
                        flag = 0;
                        break;
                    }

                }
                if (flag == 1) {
                    System.out.print(ar2[i] + " ");
                }
            }
        }*/


    }

    private void arrays_interset() {
       // 2 3 4 5 6 7
      //  8 9 2 4 10 11
        int ar1[]={2,3,4,5,6,7};
        int ar2[]={8,9,2,4,10,11};
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar2.length; j++) {
                if (ar1[i]==ar2[j])
                    System.out.print(ar1[i]+" ");

            }

        }
    }

    private void odd_element_present_in_the_even() {
        int arr[]={2,3,5,6,8,7,17};
                 //0 1 2 3 4 5 6
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]%2!=0 && i%2==0)
                System.out.println(arr[i]);

        }
    }

    private void check_prime_num() {
        int ar[]={2,3,4,5,6,7,9,10,13,17,22,25,19,};

        for (int i = 0; i < ar.length; i++) {
            int num=ar[i];// 2
            int count=0;
            for (int j = 2; j <=num/2; j++) {
                if (num%j==0){
                    count++;
                    break;
                }

            }
            if (count==0){
                System.out.println(num+" ");
            }

        }
    }

    private void split_arrays() {
        int ar[]={2,3,4,5,6,7,8}; // 3 5 7 2 4 6 8
        int arr[]= new int[ar.length];
        int j=0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]%2!=0) {
                arr[j] = ar[i];
                j++;
            }
        }
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]%2==0){
                arr[j]=ar[i];
                j++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }




    }

    private void Sum_of_2_elements_in_a_single_array_corresponding_to_10() {
        int ar[]={2,3,7,8,2};
        for (int i = 0; i < ar.length-1; i++) {
            int sum=0;
            sum+=ar[i]+ar[i+1];
            if (sum==10)
                System.out.println(ar[i]+" "+ar[i+1]);

            }

        }


    private void find_the_non_repeated_char() {
        char [] ar ={'y','a','y','h','w','a','n',};
                   // 2   2   -1  1   1   -1  1
        int feq[] = new int[ar.length];// 2 1 2 -1 1 -1
        for (int i = 0; i < ar.length; i++) { // 1 2 3 1 4 3
            int count=1;
            for (int j = i+1; j < ar.length ; j++) { // 2 3 1
                if (ar[i]==ar[j]){ //1==1
                    count++;// 2
                    feq[j]= -1;// 0 0 0 -1 0 0

                }
            }
            if (feq[i]!=-1)
                feq[i]=count; // 2 0 0 -1 0 0

        }
        for (int i = 0; i < ar.length; i++) {

            if(feq[i]==1){
                System.out.print(ar[i]+" ");
                break;
            }
        }

    }

    private void remove() {
        int ar[]={1,2,3,1,4,3,};
               // 2 1 2 -1 1 -1
        int feq[] = new int[ar.length];// 2 1 2 -1 1 -1
        for (int i = 0; i < ar.length; i++) { // 1 2 3 1 4 3
            int count=1;
            for (int j = i+1; j < ar.length ; j++) { // 2 3 1
                if (ar[i]==ar[j]){ //1==1
                    count++;// 2
                    feq[j]= -1;// 0 0 0 -1 0 0

                }
            }
           if (feq[i]!=-1)
               feq[i]=count; // 2 0 0 -1 0 0

        }
        for (int i = 0; i < ar.length; i++) {

            if(feq[i]==1){
                System.out.print(ar[i]+" ");
            }
        }
    }

    private void copy_arrays() {
        int ar[]={1,2,4,5,6,7,};
        int arr[]= new int [ar.length/2];
        int j=0;
        for (int i=0;i<ar.length;i++){
            if(i%2!=0) {
                arr[j] = ar[i];
                System.out.print(arr[j] + " ");
                j++;
            }
        }
    }

    private void copy_arrays_rev_order() {
        int[] arr ={1,2,3,45,6};
        int [] ar =new int[arr.length];
        int j=arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            ar[i]=arr[j];
            j--;
            System.out.print(ar[i]+" ");
        }
       // System.out.println(ar);
       /* for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");

        }
*/
    }

    private void finding_addition_of_odd_index_numbers_in_a_given_array() {
        int ar[]={1,2,3,4,5,5};
           //     0 1 2 3 4 5
        int count=0;
        for (int i = 1; i < ar.length ; i+=2) {
            count+=ar[i];
          //  count=count+ar[i];

        }
        System.out.println(count);
    }

    private void finding_count_of_duplicate_elements_in_agiven_array() {
        char[] ar = {'y', 'a', 's', 'h', 'w', 'a', 'n', 't', 'h', 'k',  's', 'a', 'r'};
                //    0   1      2   3    4    5    6    7    8   9      10   11   13
        //            1   3      2    2    1   -1    1     1   -1   1      -1  -1    1
        int feq[] = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            int count = 1;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    count++;// 2
                    feq[j] = -1;
                      //10
                }
            }
            if (feq[i] != -1)
                feq[i] = count;

        }
        for (int i = 0; i < ar.length; i++) {

            if(feq[i]>1)
            System.out.println(ar[i] + " occurred time " + feq[i]);
        }


    }
    private void finding_smallest_no() {
        int ar[]={3,19,7,27,13,33,20,59,12,17,1};
        int small =Integer.MAX_VALUE; // 222222222
        int se = Integer.MAX_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]<small){
                se=small;
             small=ar[i];
            }
            else if(ar[i]<se)
                se= ar[i];
        }
        System.out.println(small);
        System.out.println(se);
    }

    private void finding_biggest_no() {
        /*int ar[]={3,19,7,27,13,33,20,59,12,17};
        int temp=0;
        int sed=0;
        for (int i = 0; i < ar.length-1; i++) {
        if(ar[i]>ar[i+1]){

           temp=ar[i];

        }


        }

        for (int i = 0; i < ar.length-1; i++) {
            if(ar[i]>ar[i+1]&&ar[i]<temp)
                sed=ar[i];
        }
        System.out.println(temp);
        System.out.println(sed);*/
        int ar[]={3,19,7,27,13,33,20,59,12,17};

        int se = Integer.MIN_VALUE; //
         int big = Integer.MIN_VALUE; // -22537819
        for (int i = 0; i < ar.length; i++) {//

            if(ar[i]>big){ // 3 > -22222 3 19>3 19 7 >19 27>19
               se=big; // -22
                big = ar[i]; //2  7>19
            }
           else if(ar[i]>se) // 7 >3
                se=ar[i]; //7

        }
        System.out.println(big);
       System.out.println(se);




    }


    private void how_many_times_given_ele_pre() {
        char[] ar ={'y','a','s','h','w','a','n','t','h','a'};
        char find ='a';
        int count=0;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]==find)
                count++;

        }
        System.out.println(count);

    }

    private void placing_given_number_last_index() {
        char ar[]={'y','a','s','h'};
       /* for (char n:ar)
            System.out.print(n+" ");  for int given ascii value print*/


        char ch ='w';
        int len = ar.length;
        char[] arr = new char[len+1];
       // String[]a = new String[2];
        for (int i = 0; i < ar.length; i++) {
            arr[i]=ar[i];
        }
        int le = arr.length;
        arr[le-1]=ch;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }

    }
}

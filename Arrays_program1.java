package Arrays_program;

public class Arrays_program1 {
    public static void main(String[] args) {
        Arrays_program1 o = new Arrays_program1();
        //o.shit_right();
      //  o.reverse();
       o.linear();
       // o.finding_Index();
       // o.removing_given_num();
        //o.ad();


    }

    private void ad() {
        int[] ar = {5, 9, 15};
        for(int j=0;j<ar.length-1; j++)
        {			//0		1
            int small = ar[j]<ar[j+1]? ar[j]: ar[j+1];
            int big = ar[j]>ar[j+1]? ar[j]: ar[j+1];
            for(int i=small;i<=big;i++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

   /* private void removing_given_num() {
        char[] arr ={'T','H','A','R','I','Q'};
        char rem='Q';
        for (int i=0;i<arr.length;i++){
            if(rem==arr[i])
                System.out.println();

        }
    }*/

    private void finding_Index() {

        int ar[]={17,13,4,9,25,32};
        int key=25;
        boolean re = true;
        for (int i=0;i<ar.length;i++) {
            if (key == ar[i]) {
                System.out.println("got in position: " + i);
                re = false;
                break;
            }
        }
        if(re==true)
            System.out.println("given key is not present in an array");


    }

    private void linear() {
        int ar[]={17,13,4,9,25,32};
        int tha=13;
        boolean re = true;
        for (int i=0;i<ar.length;i++){
            if(tha==ar[i]){ // 14 ar[i] 13==17 13==13 1
                System.out.println("got in position: "+i+" got num "+ar[i]);
                re=false;
                break;
            }

        }
        if(re==true)
            System.out.println("given key is not present in an array");

    }

    private void reverse() {
        int ar[]={1,2,3,4,5,6};
               // 0 1 2 3 4 5
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        for (int i=ar.length-1;i>=0;i--)
            System.out.print(ar[i]+" ");
    }

    private void shit_right() {
        int ar[]={5,10,15,20};
        int arr[]=new int[6];

        int len=ar.length;
        int temp= ar[len-1];
        for (int i=3;i>0;i--){

            ar[i]=ar[i-1];

        }
        ar[0]=temp;
        for(int num :ar){
            System.out.print(num+" ");
        }
    }
}

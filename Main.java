import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //ex1
//        int [] num = {50,-20,0,30,40,60,10};
//        boolean output = (num.length>=2 && num[0]==num[num.length-1]);
//        System.out.println(output);

        //ex2 
//        int [] num = {1,4,17,7,25,3,100};
//        int sum = 0;
//        double avg = 0;
//
//        for (int i = 0; i < num.length; i++) {
//            sum=sum+num[i];
//        }
//        avg = sum / num.length;
//        System.out.print("the average of the said array is : "+avg);
//        System.out.println(" the number in the said array that are greater than the average are : ");
//        for (int i = 0; i < num.length; i++) {
//            if(num[i] > avg)
//                System.out.print(num[i]);
//        }


        //ex3
//        int [] num = {20,30,40};
//        int large = num[0];
//       if(num[0]>num[num.length-1]){
          System.out.println("larger value between first and last element : "+num[0]);}
          else
          System.out.println("larger value between first and last element : "+num[num.length-1]);
      
        //ex4
//         int soop=0;
    int []swap ={20, 30, 40};
    soop=swap[0];//save first element
    swap[0]=swap[swap.length-1]; //swap first with last
    swap[swap.length-1]=soop; //put new first here in the last
    System.out.println("New array after swapping the first and last elements:");
    for(int s:swap){System.out.print("\t"+s);}
     System.out.println("");


        //ex5
//        int [] num = {2,3,40,1,5,9,4,10,7};
//        int n = 0;
//        while(n < num.length && num[n] % 2 !=0)
//            n++;
//        for (int i = n+1; i <num.length ; i++) {
//            if(num[i] % 2 != 0){
//                int s = num[n];
//                num[n]=num[i];
//                num[i]=s;
//                n++;
//            }
//        }
//        System.out.println(Arrays.toString(num));

        //ex6

//        int [] num1 = {2,3,6,6,4};
//        int [] num2 = {2,3,6,6,4};
//        System.out.println(Arrays.equals(num1,num2));





       }
}

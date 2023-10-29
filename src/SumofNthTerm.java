import java.util.Scanner;

public class SumofNthTerm {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        //Method-1

        /*  int sum=0;
        for (int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);*/

        /*int sum=0;
        int i=-1;
        while(i>=n){
            sum =sum+i;
            i--;
        }
        System.out.println(sum);*///Negative numbers sum


        // Method-2

        /*System.out.println(n*(n+1)/2);

        System.out.println(-n*(n-1)/2);// Sum of negative numbers nth term*/

        //Method-3

        /*if(n>0)System.out.println(sum(n));
        else System.out.println("Negative is entered");
    }

    //Recursive

    public static int sum(int val) {

        if (val == 0) {
            return 0;
        }
        else {
             return val+sum(val-1);// Try for negative numbers it has been already done by you. You van now!!
        }

*/
    }
}

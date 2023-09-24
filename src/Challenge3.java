/*
Task
        Given an integer,n, perform the following conditional actions:

        If  is n odd, print Weird
        If  is  n even and in the inclusive range of  2 to 5 , print Not Weird
        If  is n even and in the inclusive range of 6 to 20, print Weird
        If  is n  even and greater than 20 , print Not Weird
        Complete the stub code provided in your editor to print whether or not n is weird.

        Input Format

        A single line containing a positive integer,n.

        Constraints

        0<n<101

        Output Format

        Print Weird if the number is weird; otherwise, print Not Weird.

        Sample Input 0

        3
        Sample Output 0

        Weird
        Sample Input 1

        24
        Sample Output 1

        Not Weird

*/

import java.util.Scanner;

public class Challenge3 {


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();

        if (num%2==0){

          if(num>=2 && num<=5 || num >20)

            System.out.println("Not Weird");
          else{
              System.out.println("Weird");
          }

        }
        else{
            System.out.println("Weird");
        }

        sc.close();




    }
}


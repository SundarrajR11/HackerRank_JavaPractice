import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num =sc.nextLong();

        //Method-1(Brute force)
        /*if(num>0){
            System.out.println("Positive");
        }
        else if(num<0){
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }*/

        //Method-2
        if(num==0){
            System.out.println("Zero");
        }
        else {
            String output = num>0?"Positive":"Negative";
            System.out.println(output);
        }

        //Method-3(Nested if -else statements)
        /*if (num>=0){
            if(num==0){
                System.out.println("Zero");
            }
            else {
                System.out.println("Positive");
            }
        }
        else {
            System.out.println("Negative");
        }*/
    }
}

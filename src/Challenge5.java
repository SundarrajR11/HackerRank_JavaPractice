import java.util.Scanner;

public class Challenge5 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String str=sc.next();
            int num=sc.nextInt();

            if (0<=num && num<=999 && str.length()<=10){
                System.out.printf("%-14s %03d%n",str,num);
            }
            /*else{
                System.out.println("Breaching the given constraints");
                Not required for the challenge practice purpose created.
            }*/
        }
        System.out.println("================================");

        sc.close();

    }

}
